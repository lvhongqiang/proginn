package lv.hongqiang.proginn.dao.mapper;

import lv.hongqiang.proginn.model.Programmer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lv on 2016/12/13.
 */
@Mapper
public interface ProgrammerMapper {

    void save(@Param("programmer") Programmer programmer);

    List<String> list3Ids();
}
