package com.ssm.utils;


import com.ssm.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 用于创建数据源的工具类
 */
public class DataSourceUtil {

    /**
     * 用于获取一个连接
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg){
        try {
            //加载驱动
            Class.forName(cfg.getDriver());
            //获取连接
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
