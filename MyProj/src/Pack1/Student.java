package Pack1;

public class Student {
	int rollNo, age;
public void display1()
{
	System.out.println("Welcome to all of you!");
}
public void display2()
{
	System.out.println("Automation is very easy");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student smruthi1 = new Student();
		smruthi1.display1();
		smruthi1.display2();
		smruthi1.rollNo = 46;
		smruthi1.age = 29;
		System.out.println("Roll no is "+smruthi1.rollNo);
		System.out.println("age is "+smruthi1.age);

	}

}
