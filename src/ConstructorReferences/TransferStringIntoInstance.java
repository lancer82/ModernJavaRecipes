package ConstructorReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Example 1-15. Transforming strings into Person instances
public class TransferStringIntoInstance {

	public static void main(String[] args) {
		List<String> names =
				Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
				"Karen Spärck Jones");
		List<Person> people1 = names.stream()
				.map(name -> new Person())
				.collect(Collectors.toList());
		
		List<Person> people2 = names.stream()
				.map(Person::new)
				.collect(Collectors.toList());		
	}

}
