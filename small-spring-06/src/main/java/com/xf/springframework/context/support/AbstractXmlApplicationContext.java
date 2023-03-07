package com.xf.springframework.context.support;

import com.xf.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.xf.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * xml上下文
 * @author lx
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
