import java.util.Scanner;
class Main{
	 public static int sum(int n){
      int n4;
       if(n==1)
         return(1);
       else{
         n4 = n + sum(n-1);
       return(n4);
       }
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner n1 = new Scanner(System.in);
      int n2 = n1.nextInt();
      int n3 = sum(n2);
      System.out.println(n3);
	} 
}