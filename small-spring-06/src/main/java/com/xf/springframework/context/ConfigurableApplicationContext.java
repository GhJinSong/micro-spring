package com.xf.springframework.context;

import com.xf.springframework.beans.BeansException;

/**
 *
 * @author LENOVO
 */
public interface ConfigurableApplicationContext extends ApplicationContext {
    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
