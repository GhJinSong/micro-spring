package com.xf.springframework.beans.factory.config;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:43
 * Description: com.xf.springframework.com.xf.springframework.beans.factory.factory
 */
public interface SingletonBeanRegistry {
    // 定义了一个获取单例对象的接口。
    Object getSingleton(String beanName);

}
