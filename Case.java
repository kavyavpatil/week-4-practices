import java.util.Scanner;
class Case
{
public static void main(String[] args)
{
int uppcount=0,lowcount=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)>='A' && str.charAt(i)<='Z')
{
uppcount++;
}
else
{
lowcount++;
}
}
System.out.println("count of uppercase" +uppcount);
System.out.println("count of lowercase" +lowcount);
}
} 
