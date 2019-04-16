import java.util.Scanner;
class Main{
  public static long fun(int x,int y){
    long result=1;
    while(y!=0){
    result*=x;
    --y;
    }
    return(result);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int base=n.nextInt();
      int exponent=n.nextInt();
      long n1;
         n1=fun(base,exponent);
      
      System.out.println(n1);
	}
}