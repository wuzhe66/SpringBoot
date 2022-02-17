package com.wuzhe.example.service;

import com.wuzhe.example.model.Address;
import com.wuzhe.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> empList = new ArrayList<>();

    public EmployeeService(){
        Employee empl1 = new Employee(1,"Abby",new Address(11,"Saint-Charles","PC"));
        Employee empl2 = new Employee(2,"Ben",new Address(22,"Saint-Jean","DDO"));
        Employee empl3 = new Employee(3,"Chris",new Address(33,"Brunswick","KKL"));
        empList.add(empl1);
        empList.add(empl2);
        empList.add(empl3);
    }

    //search
    public List<Employee> getAllEmpl() {
//        Employee empl1 = new Employee(1,"Abby",new Address(11,"Saint-Charles","PC"));
//        Employee empl2 = new Employee(2,"Ben",new Address(22,"Saint-Jean","DDO"));
//        Employee empl3 = new Employee(3,"Chris",new Address(33,"Brunswick","KKL"));
//        empList.add(empl1);
//        empList.add(empl2);
//        empList.add(empl3);

        return empList;
    }

    //search
    public Employee getById(int id){
        for(Employee e : empList){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    //add
    public void addEmployee(Employee empl){
        empList.add(empl);
    }
}
