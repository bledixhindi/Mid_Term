package package1;

public class UMS {
	public static void main(String[] args)
	{
		Person p1 = new Person("Bledjon", 20);
		Staff s1 = new Staff("bledi", 30, 10, 2000);
		Staff s2 = new Staff("bledar", 21, 2, 1000);
	
		Staff[] list = {s1, s2};
		
		Department d1 = new Department("Financa", list);
		
		// Tregon informacionet per stafin
		System.out.printf("Staff 1 : %s", s1.toString());
		System.out.printf("%nStaff 2 : %s", s2.toString());
		
		
		// Duke perdoruar metoden describe();
		d1.describeStaff();
		
		// Shfaqim informacionin per personin
		System.out.printf("%nPerson 1 : %s" , p1.toString());
		
		//Ndryshojme moshen e s1
		s1.setAge(22);
		
		//Ndryshojme pagen e staffit
		
		s1.setSalary(3200);
		s2.setSalary(2450);
		
		// Shfaqim informacionin pas ndryshimeve
		System.out.printf("%nPas ndryshimeve:");
		System.out.printf("%nStaff 1 : %s", s1.toString());
		System.out.printf("%nStaff 2 : %s", s2.toString());
		
		
		
		
	}

}
