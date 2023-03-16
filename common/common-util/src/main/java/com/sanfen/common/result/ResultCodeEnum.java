package com.sanfen.common.result;

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 22:40
 */
@Getter
public enum ResultCodeEnum {

    /**
     * 枚举对象
     */
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),

    LOGIN_AUTH(208, "未登陆"),
    PERMISSION(209, "没有权限")
    ;

    private final Integer code;

    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
