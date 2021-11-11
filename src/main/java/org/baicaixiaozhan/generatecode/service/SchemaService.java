package org.baicaixiaozhan.generatecode.service;

import org.baicaixiaozhan.generatecode.entity.vo.TableInfoVo;

import java.util.List;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
public interface SchemaService {

    /**
     * 根据数据库名称找到所有表信息
     *
     * @param databaseName 数据库名称
     * @return {@link List}<{@link TableInfoVo}>
     */
    List<TableInfoVo> findAllTableInfoByDbName(String databaseName);

}
