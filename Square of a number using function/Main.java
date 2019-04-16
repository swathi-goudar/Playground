import java.util.Scanner;
class Main
{
  public static int square(int n){
   return(n*n);
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner n1 = new Scanner(System.in);
      int n2 = n1.nextInt();
      int n3 = square(n2);
      System.out.println(n3);
	} 
}