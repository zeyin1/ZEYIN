package com.example.zeyin.Exception;

/**
 * @Description: 自定义异常
 * @Author: zeyin
 * @Date: 2021年01月10日 14:50
 * @Modify:
 */
public class MyOwnException extends Exception {
    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
        System.out.println("自定义异常，构造方法2");
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("自定义异常，构造方法3");
    }

    public MyOwnException(Throwable cause) { //构造方法4
        super(cause);
        System.out.println("自定义异常，构造方法4");
    }


}
