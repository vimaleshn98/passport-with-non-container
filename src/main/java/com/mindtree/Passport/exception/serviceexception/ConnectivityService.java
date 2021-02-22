package com.mindtree.Passport.exception.serviceexception;

public class ConnectivityService  extends PassportServiceException{

	public ConnectivityService() {
		super();
	}

	public ConnectivityService(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConnectivityService(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectivityService(String message) {
		super(message);
	}

	public ConnectivityService(Throwable cause) {
		super(cause);
	}

}
