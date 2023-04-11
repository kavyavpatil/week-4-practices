import java.util.Scanner;
public class Concate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the first string");
String str1=s.nextLine();
System.out.println("enter the second string");
String str2=s.nextLine();
 String str3=str1.concat(str2);  
System.out.println(str3);
}
}