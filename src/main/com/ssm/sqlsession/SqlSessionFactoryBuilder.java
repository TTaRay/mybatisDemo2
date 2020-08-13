package com.ssm.sqlsession;

import com.ssm.cfg.Configuration;
import com.ssm.sqlsession.defaultsqlsession.defaults.DefaultSqlSessionFactory;
import com.ssm.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author zhouhai
 * @date 2020/8/13 21:35
 * @company bbaqw
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
