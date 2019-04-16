import java.util.Scanner;
class Main{
  public static int fun(int x,int y){
  
    if(x<y)
      return(y);
    else
      return(x);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int n1=n.nextInt();
      int n2=n.nextInt();
      int n3=n.nextInt();
      int n4=fun(n1,n2);
      if(n4<n3)
        System.out.println(n3);
      else
        System.out.println(n4);
	}
}