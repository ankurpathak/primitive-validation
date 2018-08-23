package com.github.ankurpathak.primitive.bean.constraints.string.validator;

import com.github.ankurpathak.primitive.bean.constraints.string.Email;
import com.github.ankurpathak.primitive.bean.constraints.string.StringValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class EmailValidator implements ConstraintValidator<Email, String> {
    private Email config;
    @Override
    public void initialize(Email config) {
        this.config = config;
    }
    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
       return StringValidator.email(email, config.ignoreBlank());
    }

}
