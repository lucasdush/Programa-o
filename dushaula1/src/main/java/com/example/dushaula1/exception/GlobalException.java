package com.example.dushaula1.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentConversionNotSupportedException;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity
                .badRequest()
                .body(Map.of(
                    "mensagem", ex.getMessage(),
                    "sucesso", false
                ));
    }

    @ExceptionHandler(MethodArgumentConversionNotSupportedException.class)
    public ResponseEntity<Map<String, Object>> handleMethodArgumentConversionNotSupportedException(
            MethodArgumentConversionNotSupportedException ex) {

        return ResponseEntity
                .badRequest()
                .body(Map.of(
                    "mensagem", "Tipo de parâmetro inválido: " + ex.getName(),
                    "sucesso", false
                ));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> runtimeException(RuntimeException erro){
        return ResponseEntity
        .badRequest()
        .body(Map.of(
            "mensagem", erro.getMessage(),
            "sucesso", false
        ));
    }
}
