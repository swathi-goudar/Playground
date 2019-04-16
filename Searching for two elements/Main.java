import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
        arr[i]=in.nextInt();
      int search1= in.nextInt();
      int search2 = in.nextInt();
      int m1=0;
      int m2=0;
      for(int i=0;i<=arr_size-1;i++){
      if(search1==arr[i]){
        System.out.println(i);
        m1=1;
      break;
      }//else
          //System.out.println("-1");
      }
       for(int i=0;i<=arr_size-1;i++){
      if(search2==arr[i]){
        System.out.println(i);
        m2=1;
        break;
      } //else
          //System.out.println("-1");
       }
      if(m1!=1 || m2!=1)
        System.out.println("-1");
     }
}