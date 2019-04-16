import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      int n2;
      for (int i=n1;i>=1;i--){
        n2=i;
      for(int j=1;j<=i;j++){
        System.out.print(n2);
        n2--;}
       System.out.println(); 
      }
	}
}