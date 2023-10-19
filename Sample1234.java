class Sample1234
{
    static void Swap(int a,int b)
	{
               a=a+b;
               b=a-b;
               a=a-b;
              System.out.println(a);
              System.out.println(b);
	}
	public static void main(String[]args)
	{
		Swap(10,20);
}
}