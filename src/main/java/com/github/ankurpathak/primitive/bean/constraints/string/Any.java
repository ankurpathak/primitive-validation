package com.github.ankurpathak.primitive.bean.constraints.string;

/**
 * Created by ankur on 04-02-2017.
 */

import com.github.ankurpathak.primitive.bean.constraints.string.validator.AnyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = AnyValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Any.List.class)
public @interface Any {


    boolean ignoreBlank() default true;

    String[] value() default {};
    String message() default "{com.github.ankurpathak.primitive.bean.constraints.Any.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Any[] value();
    }
}
