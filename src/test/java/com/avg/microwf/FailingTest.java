package com.avg.microwf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hibernate.example.SampleApplication;

@SpringApplicationConfiguration(classes = {SampleApplication.class})
@WebIntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
public class FailingTest {

    @Test
    public void emptyTest() {
        System.out.println("Empty test does not even start.");
    }
}
