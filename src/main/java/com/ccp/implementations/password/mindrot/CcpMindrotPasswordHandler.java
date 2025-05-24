package com.ccp.implementations.password.mindrot;

import com.ccp.dependency.injection.CcpInstanceProvider;
import com.ccp.especifications.password.CcpPasswordHandler;

public class CcpMindrotPasswordHandler implements CcpInstanceProvider<CcpPasswordHandler> {

	public CcpPasswordHandler getInstance() {
		return new MindrotPasswordHandler();
	}
}
