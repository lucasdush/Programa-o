package com.example.ATV08._0.GlobalException;


import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globalexceptionn {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(RuntimeException erro) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Map.of("message", erro.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> runtimException (RuntimeException erro){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("message", erro.getMessage()));
    }


}



