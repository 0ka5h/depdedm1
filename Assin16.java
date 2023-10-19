import java.util.Scanner;
public class Assin16{

    static int add(int a)
    {
        int lastD=a%10;
        int firstD=a;
        while(firstD>= 10)
        {
            firstD=firstD /10;
            
        }
        return firstD * lastD;

    } 
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=add(x);
        System.out.println(b);
    }
    
}