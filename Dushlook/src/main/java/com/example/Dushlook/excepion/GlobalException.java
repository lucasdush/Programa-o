package com.example.Dushlook.excepion;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException erro) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                             .body(Map.of("mensagem", erro.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleRuntimeException(RuntimeException erro) {
        // Pode fazer um tratamento mais fino se quiser
        if ("Email já cadastrado".equals(erro.getMessage())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                                 .body(Map.of("mensagem", erro.getMessage()));
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body(Map.of("mensagem", "Erro interno inesperado"));
    }
}
