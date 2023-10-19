import java.util.Scanner;
public class Assin2 {

    static int add(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int rem=a%10;
            if(rem%2!=0)
            sum=sum+rem;
            a=a/10;
            
        }
        return sum;

    } 
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=add(x);
        System.out.println(b);
    }
    
}