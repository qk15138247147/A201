package com.qk.dao;

import com.qk.po.Student;

import java.util.List;

/**
 * @author samasung
 * @create 2020-09-30-9:38
 */
public interface StudentDao {
      /*
       * 查询全部
       * */
      List<Student> selectAll();
      /*
       * 根据id查询
       * */
      Student selectOne(int StuId);
      /*
       * 添加
       * */
      int insert(Student student);
      /*
       * 删除
       * */
      int delete(int stuId);
      /*
       * 修改
       * */
      int update(Student student);
}
