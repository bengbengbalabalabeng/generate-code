package org.baicaixiaozhan.generatecode.service.impl;

import lombok.RequiredArgsConstructor;
import org.baicaixiaozhan.generatecode.dao.SchemaDao;
import org.baicaixiaozhan.generatecode.entity.vo.TableInfoVo;
import org.baicaixiaozhan.generatecode.service.SchemaService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@RequiredArgsConstructor
@Service
public class SchemaServiceImpl implements SchemaService {

    private final SchemaDao schemaDao;

    /**
     * 根据数据库名称找到所有表信息
     *
     * @param databaseName 数据库名称
     * @return {@link List}<{@link TableInfoVo}>
     */
    @Override
    public List<TableInfoVo> findAllTableInfoByDbName(String databaseName) {
        return schemaDao.findAllTableInfoByDbName(databaseName);
    }
}
