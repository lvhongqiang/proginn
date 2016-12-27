package lv.hongqiang.proginn.dao;

import lv.hongqiang.proginn.model.Programmer;
import lv.hongqiang.proginn.util.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lv on 2016/12/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ProgrammerDaoTest {
    @Autowired
    private ProgrammerDao programmerDao;

    @Test
    public void save() throws Exception {
        programmerDao.save(new Programmer("你好","url","url","你好","company","job","city","trade","year","800"));
    }

    @Test
    public void listAllUrl() throws Exception {

    }

    @Test
    public void listUnTransed() throws Exception {

    }

}