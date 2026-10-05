package com.ccp.implementations.password.mindrot;

import org.mindrot.jbcrypt.BCrypt;

import com.ccp.especifications.password.CcpPasswordHandler;

/**
 * {@code CcpPasswordHandler} implementation using BCrypt (cost factor 12) through the jBCrypt
 * library. Provides hash generation ({@code getHash}) and verification ({@code matches}).
 */
class MindrotPasswordHandler implements CcpPasswordHandler {

	
	/**
	 * Checks the plain password against the BCrypt hash.
	 * @param password the plain password
	 * @param hash the BCrypt hash
	 * @return {@code true} when the password matches
	 */
	public boolean matches(String password, String hash) {
		boolean passwordMatches = BCrypt.checkpw(password, hash);
		return 	passwordMatches;

	}

	
	/**
	 * Hashes the password with a new salt of cost factor 12.
	 * @param password the plain password
	 * @return the BCrypt hash
	 */
	public String getHash(String password) {
		String salt = BCrypt.gensalt(12);
		String passwordHash = BCrypt.hashpw(password, salt);
		return passwordHash;

	}
}
