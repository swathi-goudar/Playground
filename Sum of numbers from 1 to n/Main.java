import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner n1 = new Scanner(System.in);
      int n = n1.nextInt();
      int i,sum=0;
      for(i=0;i<=n;i++){
      sum = sum + i;
      }
      System.out.println(sum);
	}
}