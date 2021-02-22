package com.mindtree.Passport.exception.daoexception;

public class ConnectivityException extends PassportDaoException {

	public ConnectivityException() {
		super();
	}

	public ConnectivityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConnectivityException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectivityException(String message) {
		super(message);
	}

	public ConnectivityException(Throwable cause) {
		super(cause);
	}

}
