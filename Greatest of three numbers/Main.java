import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n = new Scanner(System.in);
      int num1 = n.nextInt();
      int num2 = n.nextInt();
      int num3 = n.nextInt();
      if(num1>num2 && num1>num3){
       System.out.println(num1);
      }
      else if(num2>num1 && num2>num3){
       System.out.println(num2);
    }
      else
        System.out.println(num3);
    }
}