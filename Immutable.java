import java.util.Scanner;
class Immutable
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the first  string");
      String str1=s.nextLine();
      System.out.println("enter the second string");
      String str2=s.nextLine();
      
      if(str1.equals(str2)){
        System.out.println("it is immutable");
      }
      else{
        System.out.println("it is mutable");
      }
          
        
    }
  }