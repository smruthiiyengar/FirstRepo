package Pack1;

public class Clas1 {
	int a;
	public void smruthi()
	{
		System.out.println("smruthi pillar 2");
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		// obj is created to 
		Clas1 abc = new Clas1(); //class name ref_name = new classname()
		abc.smruthi(); //call function or method using ref variable
		abc.a = 10;
		System.out.println("value of a is "+abc.a);
	}

}
