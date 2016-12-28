package lv.hongqiang.proginn.quartz;

import lv.hongqiang.proginn.service.CrawlerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Lv on 2016/12/28.
 */
@Component
@Configurable
@EnableScheduling
public class CrawlerJob {
    private static final Logger logger = Logger.getLogger(CrawlerJob.class);
    @Autowired
    private CrawlerService crawlerService;
    
    @Scheduled(cron = "0 */5 *  * * * ")
    public void execute(){
        logger.info("开始爬虫。。。。。。");
        crawlerService.execute();
        logger.info("完成爬虫。。。。。。");
    }
}
