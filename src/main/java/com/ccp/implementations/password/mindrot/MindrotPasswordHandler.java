package com.ccp.implementations.password.mindrot;

import org.mindrot.jbcrypt.BCrypt;

import com.ccp.especifications.password.CcpPasswordHandler;

/**
 * {@code CcpPasswordHandler} implementation using BCrypt (cost factor 12) through the jBCrypt
 * library. Provides hash generation ({@code getHash}) and verification ({@code matches}).
 */
class MindrotPasswordHandler implements CcpPasswordHandler {

	
	public boolean matches(String password, String hash) {
		boolean passwordMatches = BCrypt.checkpw(password, hash);
		return 	passwordMatches;

	}

	
	public String getHash(String password) {
		String salt = BCrypt.gensalt(12);
		String passwordHash = BCrypt.hashpw(password, salt);
		return passwordHash;

	}
}
