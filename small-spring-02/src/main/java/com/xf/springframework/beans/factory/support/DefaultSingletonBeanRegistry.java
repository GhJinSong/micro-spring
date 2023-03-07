package com.xf.springframework.beans.factory.support;

import com.xf.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:46
 * Description: com.xf.springframework.com.xf.springframework.beans.factory.support
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();
    // 获取单例bean
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    // 添加单例bean
    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }
}
