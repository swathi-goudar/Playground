import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
        // Type your code here
       Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      for(int i=1;i<=n1;i++){
        if(i%2!=0){
        for(int j=1;j<=n1;j++){
          if(j==n1)
            System.out.print(i+1);
          else
          System.out.print(i);}
	System.out.println();}
      
      else{
         for(int j=1;j<=n1;j++){
          if(j==1)
            System.out.print(i+1);
          else
          System.out.print(i);}
	System.out.println();}
      }
	}
}