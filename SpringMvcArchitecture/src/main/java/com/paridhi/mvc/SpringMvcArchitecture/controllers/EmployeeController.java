package com.paridhi.mvc.SpringMvcArchitecture.controllers;

import com.paridhi.mvc.SpringMvcArchitecture.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class EmployeeController {
//    @GetMapping(path = "/letssssgo")
//    public String getMessage(){
//        return "Lessssgoooo!!!";
//    }

    @GetMapping("/employees/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id){
        return new EmployeeDTO(id, "PB", "xyz@gmail.com", 27, LocalDate.of(2026, 7, 10), true);
    }
}
