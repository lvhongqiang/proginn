package lv.hongqiang.proginn.dao;

import lv.hongqiang.proginn.dao.mapper.ProgrammerMapper;
import lv.hongqiang.proginn.model.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lv on 2016/9/29.
 */
@Repository
public class ProgrammerDao {

    @Autowired private ProgrammerMapper programmerMapper;

    public void save(Programmer programmer){
        programmerMapper.save(programmer);
    }

    public List<String> list3Ids() {
        return programmerMapper.list3Ids();
    }
}
