import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
     Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
     String str2 = sc.nextLine();
    int n = str1.length();
    int n1 = str2.length();
    int match=0;
    for(int i=0;(i<n-n1+1);i++){
    for(int j=0;j<n1;j++){
      if(str1.charAt(i+j)==str2.charAt(j))
        match++;
      break;
    }
    }
    System.out.println(match);
  } 
}