/**
 * 
 */
package com.nt.customanotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, METHOD, CONSTRUCTOR })
@Inherited
@Constraint(validatedBy =MobileNoValidation.class)
public @interface CheckMobile {
	
	
	String message() default "mobileNumber haaaaaaaa";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    int max();

   /* @Target({ FIELD, METHOD })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        CheckCase[] value();
    }*/

}
