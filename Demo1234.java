class Demo1234
{
   static String str="hello";
   static String rev ="";
  public static void main(String[]args)
  {
  for(int i=str.length()-1; i>=0;i--)
  {
  rev=rev+str.charAt(i);
  }
  System.out.println(rev);
  }
}