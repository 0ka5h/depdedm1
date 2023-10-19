class Bike1
{
int Bikecost;
String Bikebrand;
String Bikecolour;
Bike1 (int a,String b,String c)
{
Bikecost=a;
Bikebrand=b;
Bikecolour=c;
return;
}
public static void main(String[]args)
{
Bike1 B1=new Bike1(100000,"ktm","orange");
System.out.println(B1.Bikecost);
System.out.println(B1.Bikebrand);
System.out.println(B1.Bikecolour);
}
}