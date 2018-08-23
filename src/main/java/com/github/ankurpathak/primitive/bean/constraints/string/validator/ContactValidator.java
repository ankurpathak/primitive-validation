package com.github.ankurpathak.primitive.bean.constraints.string.validator;

import com.github.ankurpathak.primitive.bean.constraints.string.Contact;
import com.github.ankurpathak.primitive.bean.constraints.string.StringValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 27-02-2017.
 */
public class ContactValidator implements ConstraintValidator<Contact, String> {
    private Contact config;
    @Override
    public void initialize(Contact config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String contact, ConstraintValidatorContext context) {
        return StringValidator.contact(contact, config.ignoreBlank());
    }
}
