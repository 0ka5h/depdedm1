import java.util.Scanner;
class Main3
{
  public static void main(String[]args)
  {
    Scanner SC=new Scanner(System.in);
    System.out.println("enter the number");
    int no=SC.nextInt();
    int x=numberreverse(no);
    System.out.println(x);
  }  
      static int numberreverse(int no)
   {
    int no=121;
    int copy=no;
    int reverse=0;
    while(no!=0)
   }  
      int rem=no%10;
      reverse=(reverse*10)+rem;
      no=no/10;
	  if(copy==reverse)
    {
      System.out.println("palindrome");
    }else{
           System.out.println("not a palindrome");
         }
	 return(reverse);
   }
}