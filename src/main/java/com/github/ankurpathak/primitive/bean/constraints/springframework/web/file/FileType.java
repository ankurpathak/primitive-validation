package com.github.ankurpathak.primitive.bean.constraints.springframework.web.file;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.validator.FileTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = FileTypeValidator.class)
@Documented
public @interface FileType {

    boolean ignoreNull() default true;

    String[] mimes() default  {};

    String message() default "{com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.FileType.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
