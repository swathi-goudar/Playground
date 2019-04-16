
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
   int te=temp;
    int count = 0;
   // boolean ii=true;
    if(n<0 || temp<0 || te<0 ){
      n =-(n);
      temp=-(temp);
    }
    
    while(n > 0)
    {
        count++;
        n = n/10;
    }
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
   if(te>0)
    System.out.print(str);
    else{
      String t="-";
      System.out.print(t);
      System.out.print(str);
    }
  
}
}