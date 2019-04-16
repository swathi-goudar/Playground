import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
     
      for(int i=1;i<=n1;i++){
        for(int k=i;k<n1;k++)
          System.out.print(" ");
        for(int j=1;j<=2*i-1;j++)
          System.out.print("*");
      System.out.print("\n");
      }
	}
}