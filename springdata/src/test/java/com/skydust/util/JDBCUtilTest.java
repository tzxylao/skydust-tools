package com.skydust.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by laoliangliang on 17/5/23.
 */
public class JDBCUtilTest {
    @Test
    public void getConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }

}