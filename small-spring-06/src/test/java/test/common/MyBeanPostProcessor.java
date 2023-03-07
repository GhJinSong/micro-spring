package test.common;

import com.xf.springframework.beans.BeansException;
import com.xf.springframework.beans.factory.config.BeanPostProcessor;
import test.bean.UserService;

/**
 * Author: xsy
 * Date: 2023/3/7--07-11:07
 * Description: test.common
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：...北京222.");
        }
        return bean;
    }

}
