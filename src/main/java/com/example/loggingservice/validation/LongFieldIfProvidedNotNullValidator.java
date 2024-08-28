package com.example.loggingservice.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class LongFieldIfProvidedNotNullValidator implements ConstraintValidator<FieldIfProvidedNotNull, Long> {
    @Override
    public void initialize(FieldIfProvidedNotNull constraintAnnotation) {
    }

    @Override
    public boolean isValid(Long field, ConstraintValidatorContext context) {
        System.out.println(field);
        return field == null || field != 0;
    }
}
