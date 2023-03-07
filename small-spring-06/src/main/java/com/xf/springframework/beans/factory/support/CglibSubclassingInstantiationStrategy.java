package com.xf.springframework.beans.factory.support;


import com.xf.springframework.beans.BeansException;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import com.xf.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * cglib实例化
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        // 判断 ctor 是否为空，如果为空则是无构造函数实例化，否则就是需要有构造函数的实例化。
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);

    }
}
