package lv.hongqiang.proginn.dao.mapper;

import lv.hongqiang.proginn.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lv on 2016/12/13.
 */
@Mapper
public interface ArticleMapper {

    void save(@Param("article") Article article);

    List<String> listAllUrl();

    List<Article> listUnTransed();

    void saveTranslated(@Param("translated") String trans, @Param("id") int id);
}
