import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
        Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    int s = fact(a);
    System.out.println(s);
  }
  public static int fact(int n){
    int sum=0;
    if(n==0)
      return 0;
    else
      return n+fact(n-1);
    }
}