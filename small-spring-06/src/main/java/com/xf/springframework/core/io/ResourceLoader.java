package com.xf.springframework.core.io;

/**
 * 包装资源加载器
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
