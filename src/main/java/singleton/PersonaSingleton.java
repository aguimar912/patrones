package singleton;

public class PersonaSingleton {
	
	private static PersonaSingleton personaInstance;
	
	private String name;
	
	private int age;
	
	public PersonaSingleton() {
		
	}
	
	public static PersonaSingleton getInstance() {
		if(personaInstance == null) {
			personaInstance = new PersonaSingleton();
		}
		
		return personaInstance;
	}

	public void singletonOperation() {
		System.out.println("Mi nombre es " + name + " y mi edad es " + age);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
