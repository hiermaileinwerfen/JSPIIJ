package preprocessed.instructions;

import java.util.LinkedList;
import java.util.ListIterator;

import pascalTypes.custom_type;
import preprocessed.interpreting_objects.function_on_stack;
import preprocessed.interpreting_objects.returns_value;

public class variable_set implements executable {
	LinkedList<String> name = new LinkedList<String>();
	returns_value value;

	public variable_set(LinkedList<String> name, returns_value value) {
		this.name = name;
		this.value = value;
	}

	public void execute(function_on_stack f) {
		ListIterator<String> i = name.listIterator();
		Object p = f.variables.get(i.next());
		for (String s = null; i.hasNext(); s = i.next()) {
			p = ((custom_type) p).values.get(s);
		}
	}

}