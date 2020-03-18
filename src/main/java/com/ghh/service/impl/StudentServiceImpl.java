package com.ghh.service.impl;

import com.ghh.mapper.StudentMapper;
import com.ghh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Map getList() {
        return studentMapper.getUserList();
    }
}
