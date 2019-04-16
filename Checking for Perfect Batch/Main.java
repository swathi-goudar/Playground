import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc = new Scanner(System.in);
    int arr_size= sc.nextInt();
    int arr[] = new int[arr_size];
    for(int i=0;i<arr_size;i++){
      arr[i]=sc.nextInt();
    }
    find(arr,arr_size);
  }
  public static void find(int arr1[],int n){
  boolean ispb=true;
    int bsum=arr1[0]+arr1[1]+arr1[2];
    
   for(int i=3;i<=n-1;i=i+3){
    int c = arr1[i]+arr1[i+1]+arr1[i+2];
     if(c!=bsum){
       ispb=false;
   }
   }
    if(ispb == true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  
  }
}