package ConstructorReferences;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyConstructor {
	
	public static void main(String[] args) {
		Person before = new Person("Tom Cross");
		
		List<Person> people = Stream.of(before)
				.map(Person::new)
				.collect(Collectors.toList());
		Person after = people.get(0);
		
		assertFalse(before==after);
		assertEquals(after.getName(),before.getName());
		
		System.out.println(before.getName());
		System.out.println(after.getName());
		
		before.setName("Lancer Rote");
		assertFalse(before.equals(after));
		
		System.out.println(before.getName());
		System.out.println(after.getName());
	}
}
