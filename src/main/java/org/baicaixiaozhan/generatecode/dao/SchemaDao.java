package org.baicaixiaozhan.generatecode.dao;

import lombok.RequiredArgsConstructor;
import org.baicaixiaozhan.generatecode.entity.vo.TableInfoVo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@RequiredArgsConstructor
@Repository
public class SchemaDao {

    private final JdbcTemplate jdbcTemplate;

    /**
     * 获取当前 数据库名称
     *
     * @return
     */
    public String findDatabaseName() {
        return jdbcTemplate.queryForObject("SELECT DATABASE();", String.class);
    }

    /**
     * 获取所有表信息
     *
     * @param databaseName
     * @return
     */
    public List<TableInfoVo> findAllTableInfoByDbName(String databaseName) {
        return jdbcTemplate.queryForList("SELECT TABLE_NAME AS `name`, TABLE_COMMENT AS commect \n" +
                "FROM information_schema.TABLES WHERE TABLE_SCHEMA = '" + databaseName + "'", TableInfoVo.class);
    }

    public TableInfoVo findTableInfoByDbNameAndTableName(String dbName, String tableName) {
        return jdbcTemplate.queryForObject("SELECT COLUMN_NAME AS columnName, ORDINAL_POSITION AS ordinalPosition, IS_NULLABLE AS nullable,\n" +
                "       DATA_TYPE AS dataType, COLUMN_TYPE AS columnType, COLUMN_KEY AS columnKey\n" +
                "FROM information_schema.COLUMNS\n" +
                "WHERE TABLE_NAME = '" + tableName + "'\n" +
                "  AND TABLE_SCHEMA = '" + dbName + "'", TableInfoVo.class);
    }
}
