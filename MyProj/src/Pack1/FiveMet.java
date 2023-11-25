package Pack1;

public class FiveMet {
	public int sum(int a, int b)
	{
		int c;
		c = a + b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z = x - y;
		return z;
	}
	public int mul(int p, int q)
	{
		int r;
		r = p * q;
		return r;
	}
	public float div(float x1, float x2)
	{
		float x3;
		x3 = x1/x2;
		return x3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiveMet res = new FiveMet();
		int sumres = res.sum(10, 2);
		int sum2 = res.sum(sumres,2);
		int sub = res.sub(sum2, 2);
		int mul1 = res.mul(sub, 2);
		float div1 = res.div(mul1, 2);
		System.out.println("Final Result is " +div1);
	}

}
