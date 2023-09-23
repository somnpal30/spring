package com.sample.springmodulith;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class SpringModulithApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithApplication.class);
        modules.forEach(System.out::println);
    }


    @Test
    void verifyRegularExpression() {
        String regularExpression = "^\\S[a-zA-Z ]{0,80}$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher("som");

        Assertions.assertTrue(matcher.find());
    }

}
