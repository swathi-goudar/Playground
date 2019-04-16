import java.util.Scanner;
public class Main{
	public static int fun(int x,int y){
     int small=x<y?y:x;
      int s=0;
     for(int i=small;i>=1;i--){
     if((x%i==0)&&(y%i==0)){
       s=i;
       break;
     }
     }
   return(s);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int n1=n.nextInt();
      int n2=n.nextInt();
      int n3=n.nextInt();
      int n4=fun(n1,n2);
      int n5=fun(n4,n3);
      System.out.println(n5);
	}
}