package org.baicaixiaozhan.generatecode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.regex.Pattern;

class GenerateCodeApplicationTests {

    @Test
    void contextLoads() {

        final boolean matches = Pattern.compile("[0-9a-zA-Z:/\\-_]+")
                .matcher("csdcsdvsv://")
                .matches();

        Assert.isTrue(matches, "is false");

    }

}
