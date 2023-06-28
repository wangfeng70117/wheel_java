package com.wheel_contrast_java.enums;

import lombok.Getter;

@Getter
public enum StatusCodeExtendEnum {
    CREATE_VERIFY_FAILURE(100000, "添加失败，无用户信息");

    private Integer code;
    private String message;

    StatusCodeExtendEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
