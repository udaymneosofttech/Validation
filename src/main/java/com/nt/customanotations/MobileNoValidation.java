package com.nt.customanotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileNoValidation implements ConstraintValidator<CheckMobile, String> {

	
	static{
		System.out.println("static block executed");
	}
    private int max;

    @Override
    public void initialize(CheckMobile constraintAnnotation) {
    	
    	System.out.println("entered  into the if block");
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String mobile, ConstraintValidatorContext constraintContext) {
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	if ( mobile == null ) {
        	System.out.println("entered  into the if block");
            return true;
        }

        if ( mobile.length()==max ) {
        	System.out.println("entered  into the if block");
            return true;
        }
        else {
        	System.out.println("entered  into the if block");
            return false;
        }
    }
}
