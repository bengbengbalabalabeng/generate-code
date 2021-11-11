package org.baicaixiaozhan.generatecode.validation.constraints;

import org.baicaixiaozhan.generatecode.validation.constraintvalidators.NotContainScriptsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * DESC:
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(NotContainScripts.List.class)
@Documented
@Constraint(
        validatedBy = {NotContainScriptsValidator.class}
)
public @interface NotContainScripts {

    String message() default "{javax.validation.constraints.NotNull.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        NotContainScripts[] value();
    }
}
