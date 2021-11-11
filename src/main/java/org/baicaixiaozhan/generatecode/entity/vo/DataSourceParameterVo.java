package org.baicaixiaozhan.generatecode.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.baicaixiaozhan.generatecode.validation.constraints.NotContainScripts;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataSourceParameterVo extends BasicVo {
    /**
     * 数据库连接 URL
     */
    @NotContainScripts
    private String url;
    /**
     * 数据库驱动
     */
    @NotContainScripts
    private String driver;
    /**
     * 用户名
     */
    @NotContainScripts
    private String username;
    /**
     * 密码
     */
    @NotContainScripts
    private String password;

    public DataSourceProperties toDataSourceProperties() {
        final DataSourceProperties properties = new DataSourceProperties();
        properties.setUrl(this.url);
        properties.setDriverClassName(this.driver);
        properties.setUsername(this.username);
        properties.setPassword(this.password);
        return properties;
    }
}
