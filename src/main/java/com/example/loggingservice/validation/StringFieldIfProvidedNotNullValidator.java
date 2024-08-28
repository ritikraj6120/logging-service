package com.example.loggingservice.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StringFieldIfProvidedNotNullValidator implements ConstraintValidator<FieldIfProvidedNotNull, String> {
    @Override
    public void initialize(FieldIfProvidedNotNull constraintAnnotation) {
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext context) {
        return field == null || !field.isEmpty();
    }
}
