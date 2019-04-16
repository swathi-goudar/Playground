import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int n1= n.nextInt();
      int n2;
      int sum =0;
      while(n1>0){
        n2 = n1 %10;
         sum = sum + n2;
        n1=n1/10;
      //count = count + 1;
      }
      System.out.println(sum);
	}
}