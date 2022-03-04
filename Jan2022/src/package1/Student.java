package package1;

public class Student {
	
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 28;
		s1.roll_no = 23004;
		
		System.out.println("Age is: "+s1.age);
		System.out.println("Roll Number is: "+s1.roll_no);
		s1.display1();
		s1.display2();
	}
}
