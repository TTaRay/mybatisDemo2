package com.ssm.test;

import com.ssm.dao.StudentDao;
import com.ssm.domain.Student;
import com.ssm.io.Resources;
import com.ssm.sqlsession.SqlSession;
import com.ssm.sqlsession.SqlSessionFactory;
import com.ssm.sqlsession.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产一个SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象   (对象被增强，可以实现功能！)
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        //5.使用代理对象执行方法
        //5.1 查询所有
        List<Student> list = studentDao.findAll();
        for (Student stu:list){
            System.out.println(stu);
        }
        //6.释放资源
        sqlSession.close();
        in.close();
    }
}
