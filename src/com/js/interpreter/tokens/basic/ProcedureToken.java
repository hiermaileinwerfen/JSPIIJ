package com.js.interpreter.tokens.basic;

import com.js.interpreter.linenumber.LineInfo;

public class ProcedureToken extends BasicToken {
	public ProcedureToken(LineInfo line) {
		super(line);
	}

	@Override
	public String toString() {
		return "procedure";
	}
}
