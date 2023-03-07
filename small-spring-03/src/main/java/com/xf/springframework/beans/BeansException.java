package com.xf.springframework.beans;

/**
 * Author: xsy
 * Date: 2023/3/4--04-18:36
 * Description: com.xf.springframework.com.xf.springframework.beans
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}