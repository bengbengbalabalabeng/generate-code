package org.baicaixiaozhan.generatecode.service.impl;

import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.baicaixiaozhan.generatecode.entity.vo.DataSourceParameterVo;
import org.baicaixiaozhan.generatecode.service.DBService;
import org.baicaixiaozhan.generatecode.util.AppContexts;
import org.baicaixiaozhan.generatecode.util.JdbcSupport;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@RequiredArgsConstructor
@Service
public class DBServiceImpl implements DBService {

    @Override
    public void initDB(DataSourceParameterVo dataSourceParameterVo) {
        DataSourceProperties properties = dataSourceParameterVo.toDataSourceProperties();
        HikariDataSource dataSource = properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();

        dataSource.setReadOnly(true);

        AppContexts.registerBean("dataSource", dataSource);
        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        AppContexts.registerBean("jdbcTemplate", jdbcTemplate);
        JdbcSupport jdbcSupport = new JdbcSupport();
        AppContexts.registerBean("jdbcSupport", jdbcSupport);
    }
}
