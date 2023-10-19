import java.util.ArrayList;
import java.util.Arrays;
class Tester1
{
  public static void main(String[] args)
  {
    ArrayList a=new ArrayList();
    a.add(25);
    a.add("hi");
    a.add(2.25);
    Object[] arr=new Object[a.size()];
    for(int i=0;i<a.size();i++)
    {
      arr[i]=a.get(i);
    }
    System.out.println(Arrays.toString(arr));
  }
}