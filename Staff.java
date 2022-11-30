package package1;

public class Staff extends Person{

	private int yearsOfExperience;
	private double salary;
	
	public Staff(String name, int age, int yearsOfExperience, int salary) {
		super(name, age);
		setYearsOfExperience(yearsOfExperience);
		setSalary(salary);
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if(yearsOfExperience>0 && yearsOfExperience<42)
		this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(yearsOfExperience<10)
		{
			this.salary = salary*1.2;
		}
		else if(yearsOfExperience>=10 && yearsOfExperience<=25)
		{
			this.salary = salary * 1.5;
		}
		else
		{
			this.salary = salary * 2;
		}
	}
		
		
		 public String toString() {
		        return "Staff{" +
		                "years of experience = " + yearsOfExperience +
		                ", salary = " + salary + ",\t"+
		                super.toString() +
		                '}';
		        }

		
	}
	
