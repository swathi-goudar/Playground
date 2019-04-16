import java.util.Scanner;
class Main{
  public static void prime(int x){
   for(int i=1;i<=x;i++){
     int cout=0;
       for(int j=i;j>=1;j--){
       if(i%j==0){
       cout=cout+1;
       }
       }
     if(cout==2)
       System.out.println(i);
   }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      prime(n1);
	}
}