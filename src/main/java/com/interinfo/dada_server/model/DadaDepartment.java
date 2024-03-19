package com.interinfo.dada_server.model;

public class DadaDepartment {

    private Integer departmentNumber;

    private String departmentName;

    private String departmentChief;

    private Integer parentDepartment;

    private String companyId;

    private String departmentCode;

    private String departmentShortName;

    private String departmentLevel;

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentChief() {
        return departmentChief;
    }

    public void setDepartmentChief(String departmentChief) {
        this.departmentChief = departmentChief;
    }

    public Integer getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(Integer parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentShortName() {
        return departmentShortName;
    }

    public void setDepartmentShortName(String departmentShortName) {
        this.departmentShortName = departmentShortName;
    }

    public String getDepartmentLevel() {
        return departmentLevel;
    }

    public void setDepartmentLevel(String departmentLevel) {
        this.departmentLevel = departmentLevel;
    }
}
