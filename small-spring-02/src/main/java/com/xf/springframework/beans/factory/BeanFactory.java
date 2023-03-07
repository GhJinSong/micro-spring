package com.xf.springframework.beans.factory;

import com.xf.springframework.beans.BeansException;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:20
 * Description: com.xf.springframework
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

//    Object getBean(String name, Object... args) throws BeansException;
//    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
//
//    public Object getBean(String name) {
//        return beanDefinitionMap.get(name);
//    }
//
//    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
//        beanDefinitionMap.put(name, beanDefinition);
//    }
}
