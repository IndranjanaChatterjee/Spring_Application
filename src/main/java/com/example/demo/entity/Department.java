package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
/* We have to add the annotation Entity to the class so that it can interact with the H2 database */
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Add dept name")
    private String departmentName;
    private String departmentCode;
    private String departmentAddress;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public Department(Long departmentId,String departmentAddress,String departmentCode,String departmentName)
    {
        this.departmentId=departmentId;
        this.departmentCode=departmentCode;
        this.departmentAddress=departmentAddress;
        this.departmentName=departmentName;
    }

    public Department(){
    }

    @Override
    public String toString(){
        return "Department{"+departmentName+" "+departmentAddress+" "+departmentCode+"of id "+departmentId+"}";
    }
}
