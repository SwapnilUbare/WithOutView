package com.example.WithoutView.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	
	private String resourceName ;
	private String fieldName;
	private Object  fielsValue;
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super((String.format("% Not found with %s:'%s'",resourceName,fieldName,fieldValue)));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fielsValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFielsValue() {
		return fielsValue;
	}
	public void setFielsValue(Object fielsValue) {
		this.fielsValue = fielsValue;
	}
	
	
}
