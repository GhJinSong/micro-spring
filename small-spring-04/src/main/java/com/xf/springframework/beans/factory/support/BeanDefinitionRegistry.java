package com.xf.springframework.beans.factory.support;


import com.xf.springframework.beans.factory.config.BeanDefinition;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:44
 * Description: com.xf.springframework.com.xf.springframework.beans.factory.support
 */
public interface BeanDefinitionRegistry {
    //向注册表中注册 BeanDefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
