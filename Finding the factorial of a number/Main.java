import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    int s = fact(a);
    System.out.println(s);
  }
  public static int fact(int n){
  if(n==0 || n==1)
    return 1;
   else
     return n*fact(n-1);
  }
}