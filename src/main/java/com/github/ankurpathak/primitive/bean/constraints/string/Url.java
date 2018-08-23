package com.github.ankurpathak.primitive.bean.constraints.string;

/**
 * Created by ankur on 04-02-2017.
 */

import com.github.ankurpathak.primitive.bean.constraints.string.validator.UrlValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = UrlValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Url.List.class)
public @interface Url {
    boolean ignoreBlank() default true;
    String message() default "{com.github.ankurpathak.primitive.bean.constraints.Url.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Url[] value();
    }
}
