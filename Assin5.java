import java.util.Scanner;
public class Assin5 {

    static int add(int a)
    {
        int count=0;
        while(a!=0)
        {
            int rem=a%10;
            if(rem%2==0)
            count=count+1;
            a=a/10;
            
        }
        return count;

    } 
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=add(x);
        System.out.println(b);
    }
    
}