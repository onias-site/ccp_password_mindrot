package com.ccp.implementations.password.mindrot;

import org.mindrot.jbcrypt.BCrypt;

import com.ccp.especifications.password.CcpPasswordHandler;

class MindrotPasswordHandler implements CcpPasswordHandler {

	
	public boolean matches(String password, String hash) {
		boolean checkpw = BCrypt.checkpw(password, hash);
		return 	checkpw;

	}

	
	public String getHash(String password) {
		String gensalt = BCrypt.gensalt(12);
		String hashpw = BCrypt.hashpw(password, gensalt);
		return hashpw;

	}
}
