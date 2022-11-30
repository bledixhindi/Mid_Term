package package1;

public class Department {
	private String name;
	private Staff[] list = new Staff[25];
	
	public Department(String name, Staff[] list) {
		this.name = name;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Staff[] getList() {
		return list;
	}

	
	public void describeStaff() {
		int junior = 0;
		int senior = 0;
		for(int i=0; i<list.length; i++)
		{
			if(list[i].getYearsOfExperience()<5)
			{
				junior++;
			}
			else
			{
				senior++;
			}
		}
		
		System.out.printf("%n Ne deparatamentin me emer %s jane %d staf junior.", getName(), junior);
		System.out.printf("%n Ne departamentin me emer %s jane %d staf senior.", getName(), senior);
	}

}
