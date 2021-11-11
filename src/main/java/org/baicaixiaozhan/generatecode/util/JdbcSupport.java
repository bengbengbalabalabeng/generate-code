package org.baicaixiaozhan.generatecode.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
public class JdbcSupport implements DBOperates, InitializingBean {

    private JdbcTemplate jdbcTemplate;

    private static final String IS_CONNECT_SQL = "SELECT 1";

    @Override
    public void afterPropertiesSet() throws Exception {
        this.jdbcTemplate = AppContexts.getBean("jdbcTemplate", JdbcTemplate.class);
    }

    @Override
    public Boolean isConnect() {
        return this.jdbcTemplate.queryForObject(IS_CONNECT_SQL, Boolean.class);
    }

    @Override
    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

}
