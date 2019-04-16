import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
     	//Try your code here
    Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
      arr[i]=in.nextInt();
    int nor = in.nextInt();
    rotateeven(arr_size,arr,nor);
    rotateold(arr_size,arr,nor);
    for(int i=0;i<=arr_size-1;i++)
      System.out.print(arr[i]+" ");
  	}
  public static void rotateeven(int arr_size,int arr[],int nor){
  int tempeven=1;
  int tempold;
    if(arr_size%2==0)
      tempold=arr_size-1;
    else
      tempold=arr_size-2;
    for(int i=1;i<=nor;i++)
    {
      int temp=arr[tempeven];
      for(int j=3;j<arr_size;j=j+2)
        arr[j-2]=arr[j];
      arr[tempold]=temp;
       }
  }
   public static void rotateold(int arr_size,int arr[],int nor){
  int tempeven=0;
  int tempold;
    if(arr_size%2==1)
      tempold=arr_size-1;
    else
      tempold=arr_size-2;
    for(int i=1;i<=nor;i++)
    {
      int temp=arr[tempold];
      for(int j=(tempold-2);j>=0;j=(j-2))
        arr[j+2]=arr[j];
      arr[tempeven]=temp;
       }
  } 	
}