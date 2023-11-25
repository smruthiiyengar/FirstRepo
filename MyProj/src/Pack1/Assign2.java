package Pack1;

public class Assign2 
 {
	public int mul(int a, int b)
	{
		int c = a * b;
		return c;
	}
	public int sub(int d, int e)
	{
		int f = d - e;
		return f;
	}
	public int add(int m, int n)
	{
		int o = m + n;
		return o;
	}
	public int sub1(int r, int s)
	{
		int t = r - s;
		return t;
	}
	public float div(float x, float y)
	{
		float z = x/y;
		return z;
	}

	public static void main(String[] args)
	{
		Assign2 res = new Assign2();
		int res1 = res.mul(10,2);
		int res2 = res.sub(res1, 2);
		int res3 = res.add(res2, 2);
		int res4 = res.sub1(res3, 2);
		float res5 = res.div(res4, 2);
		System.out.println("Final Result is " +res5);

	}

}
