class Car1
{
int Carcost;
String Modelname;
String Cartype;
Car1 (int a,String b,String c)
{
Carcost=a;
Modelname=b;
Cartype=c;
return;
}
public static void main(String[]args)
{
Car1 C1=new Car1(250000,"swift","petrol");
System.out.println(C1.Carcost);
System.out.println(C1.Modelname);
System.out.println(C1.Cartype);
}
}