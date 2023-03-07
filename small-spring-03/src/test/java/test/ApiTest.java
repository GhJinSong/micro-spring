package test;


import org.junit.jupiter.api.Test;
import test.bean.UserService;

import com.xf.springframework.beans.factory.config.BeanDefinition;
import com.xf.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 测试
 */
public class ApiTest {
    @Test
    public void testBeanFactory3(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");
        userService.queryUserInfo();

    }

//    @Test
//    public void testBeanFactory2() {
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        // 2.注册 bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//        // 3.第一次获取 bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
//        // 4.第二次获取 bean from Singleton
//        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
//        userService_singleton.queryUserInfo();
//    }

    //    @Test
//    public void testBeanFactory1(){
//        // 1.初始化BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//        // 2.注册Bean
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        beanFactory.registerBeanDefinition("userService",beanDefinition);
//        // 3.获取Bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
//
//    }
}
