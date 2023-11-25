package Pack1;
//Pillar1
public class Nov18 {
	
	public int add(int a, int b)
	{
		int c;
		c = a + b;
		System.out.println("Result sum is" +c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z = x - y;
		System.out.println("Result difference is " +z);
		return z;
	}
	public void mul(int x1,int x2)
	{
		int x3;
		x3 = x1*x2;
		System.out.println("Final Result is " +x3);
	}
//pillar 2 --> main method
	public static void main(String[] args) 
	{
	//Pillar 3 -> Obj creation
		Nov18 dc = new Nov18();
	//Pillar 4 = calling method and variables also 
		int sumresult = dc.add(10, 2);
		int subresult = dc.sub(12, 3);
		dc.mul(sumresult, subresult);
		

	}

}
