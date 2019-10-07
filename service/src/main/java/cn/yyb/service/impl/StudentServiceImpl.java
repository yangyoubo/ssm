package cn.yyb.service.impl;

import cn.yyb.mapper.StudentMapper;
import cn.yyb.pojo.Student;
import cn.yyb.pojo.StudentExample;
import cn.yyb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectByExample(new StudentExample());
    }
}
