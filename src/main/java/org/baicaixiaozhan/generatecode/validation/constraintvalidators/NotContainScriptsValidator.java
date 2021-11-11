package org.baicaixiaozhan.generatecode.validation.constraintvalidators;

import org.baicaixiaozhan.generatecode.validation.constraints.NotContainScripts;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
public class NotContainScriptsValidator implements ConstraintValidator<NotContainScripts, String> {

    private static final String REGEX = "[0-9a-zA-Z:/\\-_?&=.]+";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return Pattern.compile(REGEX)
                .matcher(value)
                .matches();
    }

}
