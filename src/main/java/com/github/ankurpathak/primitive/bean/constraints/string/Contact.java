package com.github.ankurpathak.primitive.bean.constraints.string;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.primitive.bean.constraints.string.validator.ContactValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = ContactValidator.class)
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Contact.List.class)
public @interface Contact {

    boolean ignoreBlank() default true;

    String message() default "{com.github.ankurpathak.primitive.bean.constraints.Contact.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Contact[] value();
    }
}
