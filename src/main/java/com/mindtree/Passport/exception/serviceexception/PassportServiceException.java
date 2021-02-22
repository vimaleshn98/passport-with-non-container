package com.mindtree.Passport.exception.serviceexception;

import com.mindtree.Passport.exception.PassportException;

public class PassportServiceException extends PassportException {

	public PassportServiceException() {
		super();
	}

	public PassportServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PassportServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PassportServiceException(String message) {
		super(message);
	}

	public PassportServiceException(Throwable cause) {
		super(cause);
	}

}
