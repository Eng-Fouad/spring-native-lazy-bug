package io.fouad.springnativelazybug;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CodedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
    public ResponseEntity<String> handleMethodArgumentTypeMismatchException(CodedException exception) {
        return ResponseEntity.badRequest().body("{\"error_code\":%d}".formatted(exception.getCode()));
    }
}



