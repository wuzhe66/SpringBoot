package com.wuzhe.example.api;

import com.wuzhe.example.model.Employee;
import com.wuzhe.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService emplSerivce = new EmployeeService();
    //get
    @GetMapping("/employee")
    public List<Employee> getAllEmploy(){
        return emplSerivce.getAllEmpl();
    }

    //get employee by id   /employee/1
    //@PathVariable
    @GetMapping("/employee/{id}")
    public Employee getEmplById(@PathVariable int id){
        return emplSerivce.getById(id);
    }

    //POST   @RequestBody
    @PostMapping("/employee")
    public Employee addEmpl(@RequestBody Employee stuff){
        emplSerivce.addEmployee(stuff);
        return stuff;
    }

}

