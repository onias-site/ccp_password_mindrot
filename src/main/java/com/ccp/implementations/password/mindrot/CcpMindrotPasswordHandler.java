package com.ccp.implementations.password.mindrot;

import com.ccp.dependency.injection.CcpInstanceProvider;
import com.ccp.especifications.password.CcpPasswordHandler;

/**
 * DI provider that exposes {@code MindrotPasswordHandler} as the {@code CcpPasswordHandler} implementation.
 */
public class CcpMindrotPasswordHandler implements CcpInstanceProvider<CcpPasswordHandler> {

	/**
	 * Builds the BCrypt implementation of {@code CcpPasswordHandler}.
	 * @return a new {@code MindrotPasswordHandler}
	 */
	public CcpPasswordHandler getInstance() {
		MindrotPasswordHandler mindrotPasswordHandler = new MindrotPasswordHandler();
		return mindrotPasswordHandler;
	}
}
