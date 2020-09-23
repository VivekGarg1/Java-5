package com.home;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnnotationCustom {

	public abstract String developerName()  default "Vivek Garg";
	public abstract String expiryDate();
}
