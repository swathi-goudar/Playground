import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner n = new Scanner(System.in);
    int n1 = n.nextInt();
    for(int i=1;i<=n1;i++){
      System.out.print(i);
      //for(int j=1;j<=3;j++)
      if(i%3==0)  
      System.out.print(",");
    }
  }
}