package org.baicaixiaozhan.generatecode.entity.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.baicaixiaozhan.generatecode.constant.ErrorType;

import static org.baicaixiaozhan.generatecode.constant.ErrorType.SUCCESS;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Getter
@EqualsAndHashCode(callSuper = false)
public class ResultTemplate<T> {
    /**
     * 状态码
     */
    private final String statusCode;
    /**
     * 消息
     */
    private final String message;
    /**
     * 数据体
     */
    private final T data;

    private ResultTemplate(String statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public static <T> ResultTemplate<T> ok() {
        return new ResultTemplate<>(SUCCESS.getCode(), SUCCESS.getDesc(), null);
    }

    public static <T> ResultTemplate<T> ok(T data) {
        return new ResultTemplate<>(SUCCESS.getCode(), SUCCESS.getDesc(), data);
    }

    public static <T> ResultTemplate<T> fail(ErrorType errorType) {
        return new ResultTemplate<>(errorType.getCode(), errorType.getDesc(), null);
    }
}
