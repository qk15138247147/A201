1.什么是框架？
2什么是MyBatis
  1.是一款优秀的持久化层框架
   什么是持久化层：
   把数据从瞬时状态转换为持久化状态的过程  称之为持久化
  2.是一个半自动的ORM框架
    什么是ORM：
    Object Relation Mapping 对象关系映射
    orm可以像操作对象一样操作数据库
    什么是对象关系映射：
    可以让数据库中的字段和java中对象的属性一一对应
  3.它支持自定义SQL、储存过程以及高级映射 MyBatis 几乎免除了所有的JDBC代码
   以及设置参数和获取结果集的工作  MyBatis可以通过简单的XML文件或者是注解来配置和映射原始类型、接口和实体类(JavaBean)
--入门
   安装
   1.使用MyBatis 只需要将 mybatis-x.x.x.jar 导入项目即可
   2.使用maven构建项目 只需要将下面的依赖放入pom.xml文件中
   从XML文件中构建SqlSessionFactory
   1.编写mybatis的配置文件
   2.编写实体类对应的映射文件
   使用
   1.加载mybatis的配置文件
   2.创建SqlSessionFactory工厂
   3.生产SqlSession 数据库会话对象
   4.进行对数据库的操作