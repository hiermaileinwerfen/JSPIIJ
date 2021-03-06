package com.js.interpreter.ast.instructions.returnsvalue;

import com.js.interpreter.ast.ExpressionContext;
import com.js.interpreter.exceptions.ParsingException;
import com.js.interpreter.linenumber.LineInfo;
import com.js.interpreter.pascaltypes.RuntimeType;
import com.js.interpreter.runtime.VariableContext;
import com.js.interpreter.runtime.codeunit.RuntimeExecutable;
import com.js.interpreter.runtime.exception.RuntimePascalException;

public interface ReturnsValue {
	public abstract Object getValue(VariableContext f, RuntimeExecutable<?> main)
			throws RuntimePascalException;

	public abstract RuntimeType get_type(ExpressionContext f)
			throws ParsingException;

	public abstract LineInfo getLineNumber();

	/*
	 * returns null if not a compile-time constant.
	 */
	public Object compileTimeValue() throws ParsingException;
}
