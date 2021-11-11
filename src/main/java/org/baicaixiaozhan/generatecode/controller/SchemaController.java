package org.baicaixiaozhan.generatecode.controller;

import lombok.RequiredArgsConstructor;
import org.baicaixiaozhan.generatecode.entity.vo.TableInfoVo;
import org.baicaixiaozhan.generatecode.service.SchemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@RequiredArgsConstructor
@RequestMapping("/v1/schema")
@RestController
public class SchemaController {

    private final SchemaService schemaService;

    /**
     * 根据数据库名称找到所有表信息
     *
     * @param dbName 数据库名称
     * @return {@link List}<{@link TableInfoVo}>
     */
    @GetMapping("/{dbName}/tableInfos")
    public List<TableInfoVo> getTableInfoListByDbName(@PathVariable String dbName) {
        return schemaService.findAllTableInfoByDbName(dbName);
    }

}
