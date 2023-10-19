class Mobile1
{
int mobilecost;
String modlename;
String mobilecolour;
Mobile1 (int a,String b,String c)
{
mobilecost=a;
modlename=b;
mobilecolour=c;
return;
}
public static void main(String[]args)
{
Mobile1 M1=new Mobile1(100000,"iphone","white");
System.out.println(M1.mobilecost);
System.out.println(M1.modlename);
System.out.println(M1.mobilecolour);
}
}