import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner n1 = new Scanner(System.in);
      int n = n1.nextInt();
      int sum2 = n%10;
      int count1 = n;
      int sum = 0;
      while(n>=10){
        n = n/10;
      }
      count1 = n;
      sum = count1 + sum2;
      System.out.println(sum);
	}
}