package lv.hongqiang.proginn.model;

import lv.hongqiang.proginn.util.TimeUtil;

import java.util.Date;

/**
 * Created by Lv on 2016/12/27.
 */
public class Programmer {
    private Integer id;
    private String userId;
    private String userName;
    private String url;
    private String company;
    private String job;
    private String city;
    private String trade;
    private String language;
    private String year;
    private String price;
    private Date insertTime;

    public Programmer(String userId, String userName, String url, String company, String job, String city, String trade, String language, String year, String price) {
        this.userId = userId;
        this.userName = userName;
        this.url = url;
        this.company = company;
        this.job = job;
        this.city = city;
        this.trade = trade;
        this.language = language;
        this.year = year;
        this.price = price;
        this.insertTime = TimeUtil.now();
    }

    public Programmer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
