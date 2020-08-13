package com.ssm.sqlsession;

/**
 * @author zhouhai
 * @date 2020/8/13 21:29
 * @company bbaqw
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
