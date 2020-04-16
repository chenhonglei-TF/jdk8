package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @description: optionalTest2
 * @author: TF019387 chenhonglei
 * @date: 2017/11/14 22:16
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee1 = new Employee();
        employee1.setName("lisi");

        Company company = new Company();
        company.setName("company");

        List<Employee> employees = Arrays.asList(employee, employee1);
//        company.setEmployees(employees);

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(paramCompany -> paramCompany.getEmployees()).orElse(Collections.emptyList()));
    }

    // 注意，Optional最好不要用作参数类型和成员变量，因为它没有序列化
    public void test(Optional optional) {

    }
}
