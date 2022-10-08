package com.base.spring.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.base.spring.annotations.CourseCode;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value != null) {
			return value.startsWith(coursePrefix);
		}
		return true;
	}

}
