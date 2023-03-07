package com.xf.springframework.beans.factory;

import com.xf.springframework.beans.BeansException;

/**
 * @author  lx
 * Description: com.xf.springframework
 */
public interface BeanFactory {

    /**
     *
     * @param  name
     * @return
     * @throws   BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     *
     * 有参构造器 创建bean
     * @param  name
     * @param  args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 按照类型获取bean
     *
     * @param  name
     * @param  requiredType
     * @param  <T>
     * @return
     */
    <T> T getBean(String name, Class<T> requiredType);

}
