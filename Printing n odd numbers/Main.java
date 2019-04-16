import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner n1 = new Scanner(System.in);
      int n = n1.nextInt();
      int i;
      for(i=0;i<=2*n;i++)
      {
        if(i%2==1)
          System.out.println(i);
      }
	}
}