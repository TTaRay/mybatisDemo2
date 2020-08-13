# mybatisDemo2
自定义简单mybatis，不需要mybatis依赖！
1. 原项目删除mybatis依赖；
2. 新建:
   - Resources类：一个使用类加载器读取配置文件的类
   - SqlSessionFactory接口：用于打开新的SqlSession对象
   - SqlSession接口：和数据库交互核心类，可以创建dao接口的代理对象
   - SqlSessionFactoryBuilder类：用于创建一个SqlSessionFactory对象
   - Configuration类：自定义的mybatis配置类
   - XMLConfigBuilder类(工具类导入)：用于解析配置文件
   - Mapper类：用于封装执行的SQL语句和结果类型的全限定类名
   - DefaultSqlSessionFactory类：SqlSessionFactory接口的实现类
   - DefaultSqlSession类：SqlSession接口的实现类
   - DataSourceUtil类(工具类导入)：创建数据源-获取数据库连接
   - MapperProxy类：代理增强具体实现
   - Executor(工具类导入)：负责执行SQL语句，并且封装结果集

3. 如果是使用注解开发打开配置：
   - 注解开发配置1
   - 注解开发配置2