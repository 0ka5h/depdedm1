class Demo1
{
	void area()
	{
		int r=10;
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		Demo1 s1=new Demo1();
		 s1.area();
	}
}