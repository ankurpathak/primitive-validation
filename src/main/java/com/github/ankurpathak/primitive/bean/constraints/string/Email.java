package com.github.ankurpathak.primitive.bean.constraints.string;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.primitive.bean.constraints.string.validator.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = EmailValidator.class)
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Email.List.class)
public @interface Email {

    boolean ignoreBlank() default true;


    String message() default "{com.github.ankurpathak.primitive.bean.constraints.Email.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Email[] value();
    }
}
