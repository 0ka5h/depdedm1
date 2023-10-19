class Cloth1
{
String Clothcolour;
int Clothcost;
char Clothsize;
Cloth1 (String a,int b,char c)
{
Clothcolour=a;
Clothcost=b;
Clothsize=c;
return;
}
public static void main(String[]args)
{
Cloth1 C1=new Cloth1("white",1000,'L');
System.out.println(C1.Clothcolour);
System.out.println(C1.Clothcost);
System.out.println(C1.Clothsize);
}
}