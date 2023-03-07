package com.xf.springframework.beans.factory.support;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.core.io.Resource;
import com.xf.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
