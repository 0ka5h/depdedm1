class Demo12
{
String Coursename;
String Universityname;
int Examcost;
Demo12 (String a,String b,int c)
{
Coursename=a;
Universityname=b;
Examcost=c;
return;
}
public static void main(String[]args)
{
Demo12 D1=new Demo12("engineering","vtu",1000);
System.out.println(D1.Coursename);
System.out.println(D1.Universityname);
System.out.println(D1.Examcost);
}
}