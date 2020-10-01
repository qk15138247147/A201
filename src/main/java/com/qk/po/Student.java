package com.qk.po;

import org.apache.ibatis.type.Alias;

/**
 * @author samasung
 * @create 2020-09-29-10:42
 */

//@Alias("abc")  设置别名  前提必须有包
public class Student {
    private int stuId;
    private String stuName;
    private String stuLoginName;
    private String stuLoginPassword;
    private int  stuAge;
    private String stuSex;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuLoginName() {
        return stuLoginName;
    }

    public void setStuLoginName(String stuLoginName) {
        this.stuLoginName = stuLoginName;
    }

    public String getStuLoginPassword() {
        return stuLoginPassword;
    }

    public void setStuLoginPassword(String stuLoginPassword) {
        this.stuLoginPassword = stuLoginPassword;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Override
    public String toString() {
        return "com.qk.po.Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuLoginName='" + stuLoginName + '\'' +
                ", stuLoginPassword='" + stuLoginPassword + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
