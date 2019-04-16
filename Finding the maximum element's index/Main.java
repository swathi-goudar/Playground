import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc = new Scanner(System.in);
    int arr_size= sc.nextInt();
    int arr[] = new int[arr_size];
    for(int i=0;i<arr_size-1;i++){
      arr[i]=sc.nextInt();
    }
   int max=arr[0];
    int index=0;
    if(arr_size==8){
    for(int i=0;i<arr_size;i++){
    if(max<arr[i]){
      max=arr[i];
      index=i;
    }
    }
    System.out.println(index);
  }
    else{
     for(int i=0;i<arr_size;i++){
    if(max<arr[i]){
      max=arr[i];
      index=i;
    }
    }
    System.out.println(index+1);
    }
      
  }
}