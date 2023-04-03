import java.util.Scanner;
public class Stringman
{
public static void main(String[] args)
{
System.out.println("Enter The String");
Scanner sc = new Scanner(System.in);
StringBuffer sb=new StringBuffer("Hello");
sb.append("everyone");
String str1 = sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position  = "+str1.charAt(0));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
System.out.println("append : "+sb);
System.out.println("replace "+str1.replace("h","@"));
System.out.println("indexof "+str1.indexOf("e"));
System.out.println("reverse" +"   " +sb.reverse());
}
}
