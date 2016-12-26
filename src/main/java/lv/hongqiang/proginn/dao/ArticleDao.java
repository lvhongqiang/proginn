package lv.hongqiang.proginn.dao;

import lv.hongqiang.proginn.dao.mapper.ArticleMapper;
import lv.hongqiang.proginn.model.Article;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lv on 2016/9/29.
 */
@Repository
public class ArticleDao {

    @Autowired private ArticleMapper articleMapper;

    public void save(Article article){
        articleMapper.save(article);
    }

    public List<String> listAllUrl() {
        return articleMapper.listAllUrl();
    }

    public List<Article> listUnTransed() {
        return articleMapper.listUnTransed();
    }
}
