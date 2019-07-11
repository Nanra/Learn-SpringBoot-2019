package com.learning.learningspring.plugin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

@Component
public class LogPlugin extends InstantiationAwareBeanPostProcessorAdapter {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return super.postProcessAfterInitialization(bean, beanName);
        System.out.println("Telah Dibuat Bean dengan nama " + beanName + " dengan type " + bean.getClass());
        return bean;
    }
}
