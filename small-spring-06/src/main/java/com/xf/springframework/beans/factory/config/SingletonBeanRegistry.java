package com.xf.springframework.beans.factory.config;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {
    // 定义了一个获取单例对象的接口。
    Object getSingleton(String beanName);

}
