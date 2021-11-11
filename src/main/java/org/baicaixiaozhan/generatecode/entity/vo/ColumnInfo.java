package org.baicaixiaozhan.generatecode.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ColumnInfo extends BasicVo {
    private String columnName;
    private Integer ordinalPosition;
    private String nullable;
    private String dataType;
    private String columnType;
    private String columnKey;
}
