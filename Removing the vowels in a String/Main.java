import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner n = new Scanner(System.in);
    String str = n.nextLine();
    str=str.replaceAll("[aeiouAEIOU]","");
    System.out.print(str);
  }
}