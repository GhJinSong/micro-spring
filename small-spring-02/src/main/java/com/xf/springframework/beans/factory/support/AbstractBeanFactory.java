package com.xf.springframework.beans.factory.support;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.beans.factory.BeanFactory;
import com.xf.springframework.beans.factory.config.BeanDefinition;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:44
 * Description: com.xf.springframework.com.xf.springframework.beans.factory.support
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}