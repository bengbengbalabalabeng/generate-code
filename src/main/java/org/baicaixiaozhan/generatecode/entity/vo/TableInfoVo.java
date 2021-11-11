package org.baicaixiaozhan.generatecode.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TableInfoVo extends BasicVo {
    /**
     * 表名
     */
    private String name;
    /**
     * 表描述
     */
    private String comment;
    /**
     * 字段信息
     */
    private List<ColumnInfo> columnInfoList;
}
