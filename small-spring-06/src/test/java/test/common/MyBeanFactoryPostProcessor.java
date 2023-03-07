package test.common;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.beans.PropertyValue;
import com.xf.springframework.beans.PropertyValues;
import com.xf.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.xf.springframework.beans.factory.config.BeanDefinition;
import com.xf.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * Author: lx
 * Date: 2023/3/7--07-11:06
 * Description: test.common
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：测试。。。字节跳动"));
    }
}
