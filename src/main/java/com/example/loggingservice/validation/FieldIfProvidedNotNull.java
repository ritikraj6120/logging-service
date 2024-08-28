package com.example.loggingservice.validation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =  {StringFieldIfProvidedNotNullValidator.class, LongFieldIfProvidedNotNullValidator.class})
public @interface FieldIfProvidedNotNull {
    String message() default "Field, if provided, cannot be null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
