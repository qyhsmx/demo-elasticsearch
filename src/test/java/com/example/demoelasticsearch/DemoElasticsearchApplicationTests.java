package com.example.demoelasticsearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoElasticsearchApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("测试邮件");
        message.setText("这是一个测试邮件");

        message.setTo("qy19961202@163.com");

        mailSender.send(message);
    }

}
