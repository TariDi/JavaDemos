package com.demo.test;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.METHOD})
public @interface Annotation1 {
	int value() default 10;
	String a() default "aaa";
	
	
}
