package cn.yyb.controller;

import cn.yyb.pojo.Student;
import cn.yyb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("success")
    public String success()
    {
        List<Student> students = studentService.getAllStudents();
        System.out.println(students);
        return "success";
    }
}
