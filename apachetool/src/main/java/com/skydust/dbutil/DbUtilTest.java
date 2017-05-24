package com.skydust.dbutil;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by laoliangliang on 2017/5/24.
 */
public class DbUtilTest {
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/xxxxx");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        QueryRunner run = new QueryRunner(dataSource);
        Map query = run.query("select * from t_uls_assets_termbond",new MapHandler());
        System.out.println(query);
    }
}
