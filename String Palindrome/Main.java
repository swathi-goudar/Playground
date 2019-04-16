import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      int n = str1.length();
      String temp1="";
      for(int i=n-1;i>=0;i--)
        temp1=temp1+str1.charAt(i);
      if(str1.equalsIgnoreCase(temp1))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}