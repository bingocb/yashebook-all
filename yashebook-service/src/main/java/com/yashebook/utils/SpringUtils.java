package com.yashebook.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by binchen on 2018/1/3.
 */
@Component
public class SpringUtils implements ApplicationContextAware{

    public static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.err.println("set application context ===> "+applicationContext);
        context = applicationContext;
    }

    public static Object getBean(String beanName) throws BeansException {
        return context.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz) throws BeansException  {
        return (T)context.getBean(clazz);
    }
}
