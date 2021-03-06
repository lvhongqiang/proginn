package lv.hongqiang.proginn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Lv on 2016/12/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class CrawlerServiceTest {
    @Autowired
    CrawlerService crawlerService;
    @Test
    public void execute() throws Exception {
        crawlerService.execute();
    }
    
}