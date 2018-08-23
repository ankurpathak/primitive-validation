package com.github.ankurpathak.primitive.bean.constraints.string;

import com.github.ankurpathak.primitive.bean.constraints.util.Strings;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.UrlValidator;

import java.util.Objects;
import java.util.stream.Stream;

public class StringValidator {
    public static boolean any(String any, String[] value, boolean ignoreBoolean){
        if(Strings.isBlank(any)){
            return ignoreBoolean;
        }else {
            return Stream.of(value).anyMatch(x -> Objects.equals(x, any));
        }
    }

    public static boolean contact(String contact, boolean ignoreBlank){
        if(Strings.isBlank(contact)) {
            return ignoreBlank;
        }else {
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            try {
                Phonenumber.PhoneNumber result = phoneNumberUtil.parse(contact, "");
                return phoneNumberUtil.isValidNumber(result);
            } catch (NumberParseException e) {
                return false;
            }
        }
    }

    public static boolean email(String email, boolean ignoreBlank){
        if(Strings.isBlank(email)) {
            return ignoreBlank;
        }else {
            return EmailValidator.getInstance().isValid(email);

        }
    }
    public static boolean url(String url, boolean ignoreBlank){
        if(Strings.isBlank(url)) {
            return ignoreBlank;
        }else {
            String[] schemes = {"http","https"};
            return new UrlValidator(schemes).isValid(url);
        }
    }
}
