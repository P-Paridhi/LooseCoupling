package com.paridhi.mvc.SpringMvcArchitecture.controllers;

import com.paridhi.mvc.SpringMvcArchitecture.dto.EmployeeDTO;
import com.paridhi.mvc.SpringMvcArchitecture.entities.EmployeeEntity;
import com.paridhi.mvc.SpringMvcArchitecture.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

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
    public EmployeeDTO createNewEmployee(@RequestBody @Valid EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping(path = "/{employeeID}")
    public EmployeeDTO updateEmployeeByID(@RequestBody EmployeeDTO employeeDTO, @PathVariable Long employeeID){
        return employeeService.updateEmployeeById(employeeID, employeeDTO);
    }

    @DeleteMapping(path = "/{employeeId}")
    public void deleteEmployeeById(@PathVariable Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }

    @PatchMapping("/{employeeId}")
    public EmployeeDTO patchEmployeeById(
            @RequestBody Map<String, Object> updates,
            @PathVariable Long employeeId) {

        return employeeService.patchEmployeeById(employeeId, updates);
    }
}
