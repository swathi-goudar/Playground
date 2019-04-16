import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner n = new Scanner(System.in);
      int n1= n.nextInt();
      switch(n1){
        case 1:int a=n.nextInt();
               a=a*a;
               System.out.println(a);
               break;
        case 2:int l=n.nextInt();
               int b=n.nextInt();
               int r=l*b;
               System.out.println(r);
               break;
        case 3:int b1=n.nextInt();
               int h=n.nextInt();
               int r1=(b1*h)/2;
               System.out.println(r1);
               break;
        case 4:int r2=n.nextInt();
               double a2=3.14*r2*r2;
               System.out.println(a2);
               break;
        default:break;
      }
    }
}