package com.xf.springframework.beans.factory;

import com.xf.springframework.beans.BeansException;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:20
 * Description: com.xf.springframework
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    // 有参构造器 创建bean
    Object getBean(String name, Object... args) throws BeansException;

}
