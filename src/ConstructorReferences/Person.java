package ConstructorReferences;

//Example 1-14. A Person class
public class Person {
	private String name;
	
	public Person() {}
	
	public Person(Person p) {
		this.name=p.name;
	}
	
	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {		
		return name;
	}
	
	// getters and setters ...
	// equals, hashCode, and toString methods ...

}
