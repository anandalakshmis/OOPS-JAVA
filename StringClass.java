import java.util.Scanner;
class StringClass
{
  public static void main(String[] args){
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your String : ");
    s = sc.nextLine();
    int length =s.length();
    System.out.println("The Length Of The String : "+length);
    System.out.println("The Middle Character element of the string is: "+s.charAt(length/2));
    System.out.println("Enter another String to be Concatenated to the previous one: ");
    String b=sc.next();
    System.out.println("The Concatenated Strings are : "+s.concat(b));
  }
}

