package com.mindtree.Passport.exception.daoexception;

import com.mindtree.Passport.exception.PassportException;

public class PassportDaoException  extends PassportException{

	public PassportDaoException() {
		super();
	}

	public PassportDaoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PassportDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PassportDaoException(String message) {
		super(message);
	}

	public PassportDaoException(Throwable cause) {
		super(cause);
	}

}
