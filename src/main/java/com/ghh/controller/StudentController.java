package com.ghh.controller;

import com.ghh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller("Test")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("t")
    public String Testt(){
        System.out.println("输出打印");
        return "123";
    }

    @RequestMapping("test")
    @ResponseBody
    Map getList(){
        return studentService.getList();
    }
}
