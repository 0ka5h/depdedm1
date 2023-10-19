class Sample1
{
      void disp()
      {
        System.out.println("hello");
      }
}
  class Cool extends Sample1
  {
    int x=10;
  }


class Mainclass
{
  public static void main(String[] args)
  {
    System.out.println("*****upcasting*****");
    Sample1 S1=new Cool();
    S1.disp();
       System.out.println("****downcasting****");
       Cool C1=(Cool)S1;
           System.out.println(C1.x);
           C1.disp();
  }
}