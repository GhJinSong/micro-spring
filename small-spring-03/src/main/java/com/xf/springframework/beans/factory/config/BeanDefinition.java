package com.xf.springframework.beans.factory.config;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:20
 * Description: com.xf.springframework
 */

// beanDefinition定义信息
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {
    private Class beanClass;

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }
}
