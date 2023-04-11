import java.util.Scanner;
class Swapwithoutthird
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the first string");
      String str1=s.nextLine();
      System.out.println("enter the second string");
      String str2=s.nextLine();
      str1 = str1 + str2;// kavya spoorthi =kavyaspoorthi length=13
      str2 = str1.substring(0,str1.length() - str2.length());//13-8 =5=kavya
      str1 = str1.substring(str2.length());//
      System.out.println("Swaping the string");
      System.out.println(str1);
      System.out.println(str2);
    }
  }
      
    
      
        
    
  