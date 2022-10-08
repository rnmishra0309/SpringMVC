package com.base.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;

import com.base.spring.annotations.CourseCode;

@Component
public class Student {

	@NotNull(message="is Required")
	@Size(min=1, message="is Required")
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1, message="is Required")
	private String lastName;
	
	@NotNull(message="is Required")
	@CourseCode()
	private String courseCode;
	
	@NotNull(message="is Required")
	@CourseCode(value="MATH", message="must start with MATH")
	private String mathCourseCode;
	
	@NotNull(message="is Required")
	private String country;
	
	@NotNull(message="is Required")
	private String favouriteLanguage;
	
	@NotNull(message="is Required")
	private String operatingSystems;

	public Student() {
		this.lastName = "Mishrea";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getMathCourseCode() {
		return mathCourseCode;
	}

	public void setMathCourseCode(String mathCourseCode) {
		this.mathCourseCode = mathCourseCode;
	}
}
