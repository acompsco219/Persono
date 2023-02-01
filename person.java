package csi213.lab02;

/**
 * A {@code Person} instance represents a person.
 * 
 * 
 */
public class Person {

	/**
	 * The name of this {@code Person}.
	 */
	String name;

	/**
	 * Constructs a {@code Person} instance.
	 * 
	 * @param name
	 *            the name of the {@code Person}
	 */
	public Person(String name) {
	 name = name;
		
	//	public name (string name)
		
	 	@Override
  	    public String toString() {
		return name.toString();
			
		}
		
	}

	/**
	 * The main method of the {@code Person} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		new Person("John"); // construct a Person instance whose name is "John"
		Person p = new Person("Emily"); // construct a Person instance whose name is "Emily"
		System.out.println(p); // output the name of the last Person instance (i.e., "Emily")
	}

}
