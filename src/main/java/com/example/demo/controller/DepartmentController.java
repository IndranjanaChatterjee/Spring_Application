package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    /* Spring wires the object already created with this referred object */
    @Autowired
    private DepartmentService departmentService;
    /* @RequestBody is used for converting the data to the json format */
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
      return departmentService.saveDepartment(department);
    }
}
