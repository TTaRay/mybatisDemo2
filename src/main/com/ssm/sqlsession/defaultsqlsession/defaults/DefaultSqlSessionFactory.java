package com.ssm.sqlsession.defaultsqlsession.defaults;

import com.ssm.cfg.Configuration;
import com.ssm.sqlsession.SqlSession;
import com.ssm.sqlsession.SqlSessionFactory;

/**
 * @author zhouhai
 * @date 2020/8/13 21:58
 * @company bbaqw
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg=cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
