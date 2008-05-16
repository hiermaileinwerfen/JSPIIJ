package pascal_types;

import java.util.LinkedList;

import preprocessed.variable_declaration;

public class custom_type_declaration {
	LinkedList<variable_declaration> variable_types;

	public custom_type_declaration() {
		variable_types = new LinkedList<variable_declaration>();
	}

	public void add_variable_declaration(variable_declaration v) {
		variable_types.add(v);
	}

	public custom_type new_var() {
		return new custom_type(this);
	}
}