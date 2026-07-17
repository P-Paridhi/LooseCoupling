package com.paridhi.mvc.SpringMvcArchitecture.advices;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {
    private T data;

    private LocalDateTime timeStamp;
//    private ApiError error;

    private ApiResponse(){
        this.timeStamp = LocalDateTime.now();
    }

    public ApiResponse(T data){
        this();
        this.data = data;
    }

//    public ApiResponse(ApiError error){
//        this();
//        this.error = error;
//    }
}
