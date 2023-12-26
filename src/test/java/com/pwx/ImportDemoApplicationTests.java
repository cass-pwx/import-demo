package com.pwx;

import com.pwx.config.ImportAutoConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ImportDemoApplicationTests {

    @Test
    void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportAutoConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();  // 此种方式获取不到xml中的bean定义
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }
    }
}
