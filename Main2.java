class Main2
{
  public static void main(String[]args)
  {
    int no=121;
    int copy=no;
    int reverse=0;
    while(no!=0)
    {  
      int rem=no%10;
      reverse=(reverse*10)+rem;
      no=no/10;
    }
    if(copy==reverse)
    {
      System.out.println("palindrome");
    }else{
           System.out.println("not a palindrome");
         }
   }
}