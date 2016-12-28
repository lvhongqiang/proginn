package lv.hongqiang.proginn.service;

import lv.hongqiang.proginn.dao.ProgrammerDao;
import lv.hongqiang.proginn.model.Programmer;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lv on 2016/12/27.
 */
@Service
public class CrawlerService {
    private static final Logger logger = Logger.getLogger(CrawlerService.class);
    @Autowired
    private ProgrammerDao programmerDao;

    public void execute(){
        List<Programmer> list=crabList();
        List<Programmer> newList=new ArrayList<>();
        List<String>ids = programmerDao.list3Ids();
        for (int i = 0; i < list.size(); i++) {
            if(checkSame(list,ids,i)) break;
            newList.add(list.get(i));
        }
        Collections.reverse(newList);
        for (Programmer programmer : newList) {
            logger.info(programmer.toString());
            programmerDao.save(programmer);
        }
    }
    
    private boolean checkSame(List<Programmer> list, List<String> ids, int i) {
        try {
            if(ids==null||ids.size()<=0) return false;
            for (String id : ids) {
                Programmer programmer = list.get(i);
                if(id.equals(programmer.getUserId())){
                    i++;
                }else {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private List<Programmer> crabList() {
        try {
            List<Programmer> list= new ArrayList<>();
            trustEveryone();
            Document doc = Jsoup.connect("https://www.proginn.com/users/").get();
            Elements elements = doc.select("#widget-user-list div.J_user");
            for (Element element : elements) {
                String company = "";
                String job = "";
                String city = "";
                String trade = "";
                String language = "";
                String year = "";
                Element avatar = element.select("div.user-avatar").first();
                String userId=avatar.attr("userid");
                String userName = avatar.select("p.user-name").first().text();
                
                Elements spans = element.select("div.title span");
                try {
                    company = spans.get(0).text();
                    job = spans.get(1).text();
                    city = spans.get(2).text();
                    trade = spans.get(3).text();
                    language = spans.get(4).text();
                    year = spans.get(5).text();
                } catch (Exception e) {
                    logger.debug("",e);
                }

                String price = element.select("div.hire-info .price").text();
                list.add(new Programmer(userId, userName, "", company, job, city, trade, language, year, price));
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void trustEveryone() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new X509TrustManager[] { new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
                
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
                
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            } }, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    
}
