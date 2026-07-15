package com.paridhi.mvc.SpringMvcArchitecture.controllers;

import com.paridhi.mvc.SpringMvcArchitecture.dto.EmployeeDTO;
import com.paridhi.mvc.SpringMvcArchitecture.entities.EmployeeEntity;
import com.paridhi.mvc.SpringMvcArchitecture.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping(path = "/letssssgo")
//    public String getMessage(){
//        return "Lessssgoooo!!!";
//    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age) {
        return employeeService.getAllEmployees(age);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }
}
