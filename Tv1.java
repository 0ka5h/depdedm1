class Tv1
{
int Tvcost;
String Tvbrand;
String Tvtype;
Tv1 (int a,String b,String c)
{
Tvcost=a;
Tvbrand=b;
Tvtype=c;
return;
}
public static void main(String[]args)
{
Tv1 T1=new Tv1(20000,"Samsung","LED");
System.out.println(T1.Tvcost);
System.out.println(T1.Tvbrand);
System.out.println(T1.Tvtype);
}
}