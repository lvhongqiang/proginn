package sample.simple.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Lv on 2016/12/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;
    @Test
    public void getHelloMessage() throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
    }

}