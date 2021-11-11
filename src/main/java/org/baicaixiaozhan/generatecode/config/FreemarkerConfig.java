package org.baicaixiaozhan.generatecode.config;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Component
public class FreemarkerConfig {

    @Bean
    @Primary
    public Configuration configuration() {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_20);
        cfg.setClassLoaderForTemplateLoading(this.getClass().getClassLoader(), "freemarker-template/");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return cfg;
    }

}
