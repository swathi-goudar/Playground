import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
      arr[i]=in.nextInt();
   // int nor = in.nextInt();
    zero(arr_size,arr);
   // rotateold(arr_size,arr,nor);
    for(int i=0;i<=arr_size-1;i++)
      System.out.print(arr[i]+" ");
  	}
  public static void zero(int arr_size,int arr[]){
   int count = 0;
    for(int i=0;i<=arr_size-1;i++){
    if(arr[i]!=0){
    int temp=arr[i];
      arr[i]=arr[count];
      arr[count]=temp;
      count++;
    }
    }
  }
}