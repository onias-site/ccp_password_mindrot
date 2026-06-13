package com.ccp.implementations.password.mindrot;

import com.ccp.dependency.injection.CcpInstanceProvider;
import com.ccp.especifications.password.CcpPasswordHandler;

/**
 * Provedor de DI que expõe {@code MindrotPasswordHandler} como implementação de {@code CcpPasswordHandler}.
 */
public class CcpMindrotPasswordHandler implements CcpInstanceProvider<CcpPasswordHandler> {

	public CcpPasswordHandler getInstance() {
		return new MindrotPasswordHandler();
	}
}
