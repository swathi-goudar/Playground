import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
        arr[i]=in.nextInt();
      int temp=arr[0];
      for(int i=0;i<=arr_size-1;i++){
      if(temp<=arr[i])
        temp=arr[i];
      }
      System.out.println(temp);
    }
}