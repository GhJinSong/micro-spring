package com.xf.springframework.beans.factory;


import com.xf.springframework.beans.BeansException;
import com.xf.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.xf.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.xf.springframework.beans.factory.config.BeanDefinition;

/**
 * @author lx
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    /**
     * lx
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     *
     * @throws  BeansException
     */
    void preInstantiateSingletons() throws BeansException;
}
