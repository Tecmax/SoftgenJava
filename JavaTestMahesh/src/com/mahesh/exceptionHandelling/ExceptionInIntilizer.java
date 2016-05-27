package com.mahesh.exceptionHandelling;

import java.util.UUID;

class ExceptionInIntilizer {

	private static String ID = null;

	static {
		ID = UUID.randomUUID().toString();
	}
}
