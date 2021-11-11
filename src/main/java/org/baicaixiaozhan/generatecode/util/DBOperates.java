package org.baicaixiaozhan.generatecode.util;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
public interface DBOperates {

    /**
     * DB 是否连接成功
     *
     * @return
     */
    Boolean isConnect();

    /**
     * 获取 {@link JdbcTemplate}
     *
     * @return {@link JdbcTemplate}
     */
    JdbcTemplate getJdbcTemplate();

}
