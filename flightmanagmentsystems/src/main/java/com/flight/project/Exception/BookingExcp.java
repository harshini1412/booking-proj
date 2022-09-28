package com.flight.project.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class BookingExcp extends RuntimeException {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rename;
	private String fdname;
	private Object fvalue;
	public BookingExcp(String rename, String fdname, Object fvalue) {
		super();
		this.rename = rename;
		this.fdname = fdname;
		this.fvalue = fvalue;
	}
	public String getRename() {
		return rename;
	}
	public String getFdname() {
		return fdname;
	}
	public Object getFvalue() {
		return fvalue;
	}
	
	
	
}
