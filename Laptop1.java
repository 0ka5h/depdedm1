class Laptop1
{
String Laptopname;
int Laptopcost;
String Laptopbrand;
Laptop1 (String a,int b,String c)
{
Laptopname=a;
Laptopcost=b;
Laptopbrand=c;
return;
}
public static void main(String[]args)
{
Laptop1 L1=new Laptop1("dellxp",50000,"dell");
System.out.println(L1.Laptopname);
System.out.println(L1.Laptopcost);
System.out.println(L1.Laptopbrand);
}
}