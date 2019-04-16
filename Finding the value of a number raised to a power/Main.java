import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner n = new Scanner(System.in);
      int base=n.nextInt();
      int exp=n.nextInt();
      int a=1;
      while(exp!=0){
        a=a*base;
        --exp;
      }
      System.out.println(a);
    }
}