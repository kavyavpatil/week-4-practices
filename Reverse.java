import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
System.out.println(str.charAt(i));
}
}
}