package com.meli.moviesdb.advice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidationErrorDetail {
    private String field;
    private String message;
    private String rejectedValue;
}