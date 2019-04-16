import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,sum=0,r,t;
      Scanner n1 = new Scanner(System.in);
      n = n1.nextInt();
      t=n;
      while(n!=0){
      r=n%10;
        int f=1;
        for(int i=1;i<=r;i++)
          f=f*i;
        sum=sum+f;
        n=n/10;
      }
      if(sum==t)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}