import java.util.Scanner;
public class Upper
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string");
      String str=s.nextLine();
      String arr[]=str.split(" ");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1));
          System.out.print(" ");
        }
    }
  }