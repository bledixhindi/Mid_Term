package package1;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>18)
		this.age = age;
	}
	

	public String toString() {
		return "name = " + name + ", age = " + age + "";
	}

}
 