package com.liust.utils;

/**
 * @program: Clothes
 * @description: 业务异常
 * @author: liust
 * @create: 2018-05-31 15:38
 **/
public class BusinessException extends RuntimeException{
    public BusinessException() {
        super();
    }

    public BusinessException(String errorMessage) {
        super(errorMessage);
    }
}
