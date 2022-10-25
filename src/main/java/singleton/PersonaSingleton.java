package singleton;

public class PersonaSingleton {
	
	private static PersonaSingleton personaInstance;
	
	private String name;
	
	private int age;
	
	private PersonaSingleton() {
		
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
}
