class Student
{
int javamock;
static String inst_name="jspiders";
public static void main(String[]args)
{
System.out.println("Institue name is"+inst_name);
Student Std1=new Student();
Std1.javamock=1;
System.out.println(Std1.javamock);
Student Std2=new Student();
Std2.javamock=2;
System.out.println(Std2.javamock);
Std2.javamock=1;
System.out.println(Std2.javamock);
}
}