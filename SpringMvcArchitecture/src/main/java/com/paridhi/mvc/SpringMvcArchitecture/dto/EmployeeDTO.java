package com.paridhi.mvc.SpringMvcArchitecture.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotEmpty(message = "Required Non empty Name")
    @Size(min = 3, max = 15, message = "Number of character should be in range 3 - 15")
    private String name;

    @Email(message = "Email should be a valid email")
    private String email;

    @Min(value = 21, message = "employee should be atleast 21 yrs old")
    private Integer age;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private Boolean isActive;
}
