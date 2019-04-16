import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner n = new Scanner(System.in);
    int row = n.nextInt();
    int col = n.nextInt();
    int mat1[][] = new int[row][col];
   // int mat2[][] = new int[row][col];
    //int sub[][] = new int[row][col];
    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++)
      mat1[i][j] = n.nextInt();
    }
    int tan[][] = new int[col][row];
    for(int i=0;i<=row-1;i++){
    for(int j=0;j<=col-1;j++)
      tan[j][i]=mat1[i][j] ;
     }
    for(int i=0;i<=row-1;i++){
    for(int j=0;j<=col-1;j++)
     System.out.print(tan[j][i] + " ");
    System.out.println();  
     }
   }
}