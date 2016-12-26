package lv.hongqiang.proginn.model;


import java.sql.Timestamp;

/**
 * Created by Lv on 2016/9/27.
 */
public class Article {
    private Integer id;
    private String title;
    private String brief;
    private String content;
    private String url;
    private Timestamp insertTime;
    private Integer translated;

    public Article(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Article(String brief, String content, String url) {
        this.brief = brief;
        this.content = content;
        this.url = url;
    }
    public Article(String title, String brief, String content, String url, Timestamp insertTime) {
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.url = url;
        this.insertTime = insertTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getTranslated() {
        return translated;
    }

    public void setTranslated(Integer translated) {
        this.translated = translated;
    }
}
