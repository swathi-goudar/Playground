import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner in = new Scanner(System.in);
    String str = in.nextLine();
      String sub=in.nextLine();
      String rep=in.nextLine();
      str=str.replace(sub,rep);
      System.out.println(str);
    }
}