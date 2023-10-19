class Employee1
{
int Employeeid;
int Employeesalary;
char Employeegrade;
Employee1 (int a,int b,char c)
{
Employeeid=a;
Employeesalary=b;
Employeegrade=c;
return;
}
public static void main(String[]args)
{
Employee1 E1=new Employee1(212,50000,'A');
System.out.println(E1.Employeeid);
System.out.println(E1.Employeesalary);
System.out.println(E1.Employeegrade);
}
}