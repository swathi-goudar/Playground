import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
     int num = 1;
      for(int i=1;i<=n1;i++){
        for(int k=i;k<=n1-1;k++)
          System.out.print(" ");
        for(int j=1;j<=i;j++){
          System.out.print(num+" ");
        num++;
        }
      System.out.print("\n");
      }
    }    
}