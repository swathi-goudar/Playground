import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      int count = 0;
      int a,temp;
      temp=n1;
      while(n1>0){
      a=n1%10;
        n1=n1/10;
        count=count+(a*a*a);
      }
      if(temp==count)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}