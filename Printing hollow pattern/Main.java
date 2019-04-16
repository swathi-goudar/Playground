import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      for(int i=1;i<=n1;i++){
        for(int j=1;j<=n1;j++){
          if(j==1||j==n1||i==1||i==n1)
            System.out.print("*");
          else
          System.out.print(" ");}
	System.out.println();}
	}
}