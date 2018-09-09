package com.github.ankurpathak.primitive.bean.constraints.string.validator;

import com.github.ankurpathak.primitive.bean.constraints.string.Any;
import com.github.ankurpathak.primitive.string.StringValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class AnyValidator implements ConstraintValidator<Any, String>{

    private Any config;

    @Override
    public void initialize(Any config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String any, ConstraintValidatorContext constraintValidatorContext) {
        return StringValidator.any(any, config.value(), config.ignoreBlank());
    }

}
