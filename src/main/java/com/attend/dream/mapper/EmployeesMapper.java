package com.attend.dream.mapper;

import com.attend.dream.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmployeesMapper {
    //查询所有的雇员
    @Select("select empId,empCode,empName,empSex,empAge,empNation,empIdCard,empSalary,empTel,empContact,empCTel,empJobId,empNote\n" +
            "from employees")
    List<Employee> getEmployees();

    //通过员工的名字查询
    @Select("select empId,empCode,empName,empSex,empAge,empNation,empIdCard,empSalary,empTel,empContact,empCTel,empJobId,empNote\n" +
            "from employees where empName = #{empName}")
    Employee getEmployeesByName(String empName);

    //添加员工
    @Insert("insert into employees(empId,empCode,empName,empSex,empAge,empNation,empIdCard,empSalary,empTel,empContact,empCTel,empJobId,empNote)\n" +
            "values(#{empId},#{empCode},#{empName},#{empSex},#{empAge},#{empNation},#{empIdCard},#{empSalary},#{empTel},#{empContact},#{empCTel},#{empJobId},#{empNote})")
    @Options(useGeneratedKeys = true, keyProperty = "empId")
    Boolean insertEmployee(Employee e);

    //通过员工的id 修改员工的信息
    @Update("update employees set empId=#{empId},empCode=#{empCode},empName=#{empName},empSex=#{empSex},empAge=#{empAge},empNation=#{empNation},empIdCard=#{empIdCard},\n" +
            "empSalary=#{empSalary},empTel=#{empTel},empContact=#{empContact},empCTel=#{empCTel},empJobId=#{empJobId},empNote=#{empNote}\n" +
            "where empId = #{empId}")
    Boolean updateEmployee(Employee e);

    //单条数据删除
    @Delete("delete from employees where empId=#{empId}")
    Boolean deleteEmployee(int empId);
}