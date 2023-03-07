package com.xf.springframework.beans.factory.support;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略
 * 传入bd，bean名称，构造器，参数
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
