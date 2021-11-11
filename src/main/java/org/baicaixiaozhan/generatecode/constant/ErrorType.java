package org.baicaixiaozhan.generatecode.constant;

import lombok.Getter;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Getter
public enum ErrorType {
    SUCCESS("00000", "访问成功");

    String code;
    String desc;

    ErrorType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
