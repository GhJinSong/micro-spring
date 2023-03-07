package com.xf.springframework.beans.factory.support;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.core.io.Resource;
import com.xf.springframework.core.io.ResourceLoader;

/**
 * bd读取接口
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String... locations) throws BeansException;
}
