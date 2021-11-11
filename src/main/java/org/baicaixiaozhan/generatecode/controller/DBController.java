package org.baicaixiaozhan.generatecode.controller;

import lombok.RequiredArgsConstructor;
import org.baicaixiaozhan.generatecode.entity.model.ResultTemplate;
import org.baicaixiaozhan.generatecode.entity.vo.DataSourceParameterVo;
import org.baicaixiaozhan.generatecode.service.DBService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@RequiredArgsConstructor
@RequestMapping("/v1/db")
@RestController
public class DBController {

    private final DBService dbService;

    /**
     * 初始化 DataSource 建立连接
     *
     * @param dataSourceParameterVo
     */
    @PostMapping("/init")
    public ResultTemplate<Object> initDatabase(@RequestBody @Validated DataSourceParameterVo dataSourceParameterVo) {
        // dbService.initDB(dataSourceParameterVo);
        return ResultTemplate.ok();
    }

}
