class Person
{

	private String name;
	private String address;

	public Person(String name,String address)
	{
	this.name=name;
	this.address=address;
	}

	public String getName()
	{
	return name;
	}

	public String getAddress()
	{
	return address;
	}

	public String toString()
	{
	return "Person[name="+name+",address="+address+"]";
	}

}

class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	 Student(String name, String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	
	public String getProgram()
	{
		return program;
	}
	
	public void setProgram(String program)
	{
		this.program=program;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}

	public double getFee()
	{
		return fee;
	}
	
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	
	public String toString()
	{
		return "Student[Person[name="+getName()+",address="+getAddress()+"],Program="+getProgram()+",year="+getYear()+",fee="+getFee()+"]";
	}
}

class Staff extends Person
{
	private String school;
	private double pay;
	public Staff(String name, String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	
	public String getSchool()
	{
		return school;
	}
	
	 public void setSchool(String school)
	{
		this.school=school;
	}
	
	 public double getPay()
	{
		return pay;
	}
	
	
	
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	
	public String toString()
	{
		return "Staff[Person[name="+getName()+",address="+getAddress()+"],School="+getSchool()+",pay="+getPay()+"]";
	}
	
	
}

class PersonDemo
{
	public static void main(String[] args)
	{
		String name="M NARASIMHULU";
		String add="SRIT,ANANTAPUR";
		Person p=new Person(name,add);
		Staff s=new Staff("malli","srit","jeevani",25000);
		Student s1=new Student("ranjit", "srit","traing",2015,12000);
		System.out.println(p);	
		System.out.println(s);	
		System.out.println(s1);	



	}
}
