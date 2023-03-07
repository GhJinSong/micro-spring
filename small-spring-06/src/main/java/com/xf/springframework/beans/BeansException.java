package com.xf.springframework.beans;

/**
 * 全局异常
 * Author: xsy
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}