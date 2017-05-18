package com.jiangwei.springtest.beanwrapper;

/**
 * Created by weijiang
 * Date: 2017/5/18
 * Desc:
 */
public class Company {

    private String companyName;

    private Employee employee;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
