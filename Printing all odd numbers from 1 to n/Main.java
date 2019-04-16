import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int i;
      for(i=0;i<=n1;i++){
      if(i%2==1)
        System.out.println(i);
      }
	}
}