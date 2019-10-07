package cn.yyb.mapper;

import cn.yyb.pojo.Student;
import cn.yyb.pojo.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class StudentTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()
    {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectByExampleTest()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        StudentExample studentExample = new StudentExample();
//        StudentExample.Criteria criteria = studentExample.createCriteria();
//        criteria.andNameEqualTo("韩梅梅");
        List<Student> students = studentMapper.selectByExample(studentExample);
        System.out.println(students);
    }
}
