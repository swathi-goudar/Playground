import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner n = new Scanner(System.in);
      String n1=n.nextLine();
      String n2=n.nextLine();
      int n3=n.nextInt();
      n2.replaceAll(n1,n2);
      //System.out.println(n2);
      String[] str=n2.split(" ",n3);
      for(String a:str)
        System.out.println(a);

    }
}