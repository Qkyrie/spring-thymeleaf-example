package com.deswaef.spring.examples.thymeleaf;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ThymeLeafExampleTest.class)
@IntegrationTest("server.port:0")
public class ThymeLeafExampleTest {

    @Test
    public void startUp() {
        
    }
}