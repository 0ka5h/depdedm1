class Home1
{
String Homename;
int Homecost;
String Homecolour;
Home1 (String a,int b,String c)
{
Homename=a;
Homecost=b;
Homecolour=c;
return;
}
public static void main(String[]args)
{
Home1 H1=new Home1("pavan",1000000,"white");
System.out.println(H1.Homename);
System.out.println(H1.Homecost);
System.out.println(H1.Homecolour);
}
}