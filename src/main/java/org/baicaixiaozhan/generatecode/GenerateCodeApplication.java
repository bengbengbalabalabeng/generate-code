package org.baicaixiaozhan.generatecode;

import org.baicaixiaozhan.generatecode.util.AppContexts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Import(AppContexts.class)
public class GenerateCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerateCodeApplication.class, args);
    }

}
