package com.github.ankurpathak.primitive.bean.constraints.string.validator;

import com.github.ankurpathak.primitive.string.StringValidator;
import com.github.ankurpathak.primitive.bean.constraints.string.Url;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 27-02-2017.
 */
public class UrlValidator implements ConstraintValidator<Url, String> {
    private Url config;
    @Override
    public void initialize(Url config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String url, ConstraintValidatorContext context) {
        return StringValidator.url(url, config.ignoreBlank());
    }
}
