package com.github.ankurpathak.primitive.bean.constraints.springframework.web.file;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.validator.FileTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Constraint(validatedBy = FileTypeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(FileType.List.class)
public @interface FileType {

    boolean ignoreNull() default true;

    String[] mimes() default {};

    String message() default "{com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.FileType.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        FileType[] value();
    }
}
