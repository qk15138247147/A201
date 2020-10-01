import com.qk.dao.StudentDao;
import com.qk.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author samasung
 * @create 2020-09-30-9:49
 */
public class test {
    @Test
    public void test1() throws IOException {
        //1.加载配置文件
        InputStream is= Resources.getResourceAsStream("Mybatis-config.xml");
        //2.创建sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.生产sqlSession数据库会话对象  true 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取映射接口
        StudentDao sd = sqlSession.getMapper(StudentDao.class);
        //查询全部
        List<Student> list = sd.selectAll();
        for (Student student : list) {
            System.out.println(student);
        }
       //根据id查询
      /*  Student student = sd.selectOne(1);
        System.out.println(student);*/
      //添加
       /* Student student=new Student();
        student.setStuName("陈赫");
        student.setStuLoginName("chenHe");
        student.setStuLoginPassword("777777");
        student.setStuAge(30);
        student.setStuSex("男");
        int insert = sd.insert(student);
        System.out.println(insert);*/
      // 删除
      /*  int delete = sd.delete(4);
        System.out.println(delete);*/
      //修改
        Student student=new Student();
        student.setStuId(1);
        student.setStuName("邓超");
        student.setStuLoginName("dengChao");
        student.setStuLoginPassword("999999");
        student.setStuAge(26);
        student.setStuSex("男");
        int update = sd.update(student);
        System.out.println(update);
    }
}
