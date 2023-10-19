import java.util.Scanner;
public class Assin14 {

    static int add(int a)
    {
        int count=0;
        int sum=0;
        while(a>= 10)
        {
            int rem=a%10;
            if(count!=0 && count!=a*count)
            {
                sum=sum+rem;
                
            }
            count++;
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
