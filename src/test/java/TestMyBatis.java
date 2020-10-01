import com.qk.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author samasung
 * @create 2020-09-29-10:56
 */
public class TestMyBatis {
    @org.junit.Test
    public void testSelectAll() throws IOException {
        //1.加载mybatis的配置文件
        InputStream is= Resources.getResourceAsStream("Mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        // 3.生产SqlSession 数据库会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4操作数据库的各种  增删改查
//        List<Object> list = sqlSession.selectList("StudentMapper.selectAll");
//        for (Object o : list) {
//            System.out.println("o="+o);
//        }
        //4.2根据id查询
      /*  Object o = sqlSession.selectOne("StudentMapper.selectOne","李四");
        System.out.println("o="+o);*/
       /* com.qk.po.Student student=new com.qk.po.Student();
        student.setStuName("123");
        student.setStuLoginName("1");
        student.setStuLoginPassword("000000");
        student.setStuSex("男");
        student.setStuAge(12);
        int insert = sqlSession.insert("StudentMapper.insert", student);
        System.out.println(insert);*/
        /*int delete = sqlSession.delete("StudentMapper.delete", 5);
        System.out.println(delete);*/
        Student student=new Student();
         student.setStuId(1);
         student.setStuName("邓超");
         student.setStuLoginName("dengCao");
         student.setStuLoginPassword("110110");
         student.setStuAge(12);
         student.setStuSex("男");
        int update = sqlSession.update("StudentMapper.update", student);
        System.out.println(update);
    }
}
