import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
    String str = in.nextLine();
      String str2=in.nextLine();
      String temp = " ";
      temp=str.concat(str);
      //System.out.println(temp);
      int m=str.length();
      int n=temp.length();
      int res=0;
      int j;
   /*   for(int i=0;i<=n-m;i++){
      for( j=0;j<m;j++){
       if(temp.charAt(i+j)!=str.charAt(j))
         break;
      }
        if(j==m)
          res=i;
        }*/
      boolean res1=true;
      res1=temp.contains(str2);
      if(res1==false)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}