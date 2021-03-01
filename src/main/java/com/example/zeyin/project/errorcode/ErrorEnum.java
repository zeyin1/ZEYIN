package com.example.zeyin.project.errorcode;

/**
 * @Description: 测试枚举
 * @Author: zeyin
 * @Date: 2020年03月29日 23:23:41
 * @Modify:
 */

public enum ErrorEnum {

    ERR001("ERR001", "输入报错"),
    ERR002("ERR002", "输出报错"),

    ;
    private String code;
    private String message;

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorEnum parse(String code) throws Exception {
        for (ErrorEnum errorEnum : values()) {
            if (errorEnum.code.equals(code)) {
                return errorEnum;
            }
        }
        throw new Exception("错误");
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
