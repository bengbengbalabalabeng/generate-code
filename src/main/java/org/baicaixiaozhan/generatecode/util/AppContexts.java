package org.baicaixiaozhan.generatecode.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Objects;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
public class AppContexts implements ApplicationContextAware, BeanFactoryPostProcessor {

    private static ConfigurableListableBeanFactory beanFactory;
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AppContexts.applicationContext = applicationContext;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        AppContexts.beanFactory = configurableListableBeanFactory;
    }

    public static BeanFactory getBeanFactory() {
        return Objects.nonNull(beanFactory) ? beanFactory : applicationContext;
    }

    public static Object getBean(String beanName) {
        return getBeanFactory().getBean(beanName);
    }

    public static  <T> T getBean(Class<T> clazz) {
        return getBeanFactory().getBean(clazz);
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        return getBeanFactory().getBean(beanName, clazz);
    }

    public static ConfigurableListableBeanFactory configurableListableBeanFactory() {
        if (Objects.nonNull(beanFactory)) {
            return beanFactory;
        } else if (applicationContext instanceof ConfigurableApplicationContext) {
            return ((ConfigurableApplicationContext) applicationContext).getBeanFactory();
        } else {
            throw new NullPointerException();
        }
    }

    public static void registerBean(String beanName, Object object) {
        final ConfigurableListableBeanFactory factory = configurableListableBeanFactory();
        factory.autowireBean(object);
        factory.registerSingleton(beanName, object);
    }
}
