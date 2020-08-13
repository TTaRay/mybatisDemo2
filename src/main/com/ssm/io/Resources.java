package com.ssm.io;

import java.io.InputStream;

/**
 * @author zhouhai
 * @date 2020/8/13 21:24
 * @company bbaqw
 * 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
