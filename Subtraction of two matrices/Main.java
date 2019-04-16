import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner n = new Scanner(System.in);
    int row = n.nextInt();
    int col = n.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    int sub[][] = new int[row][col];
    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++)
      mat1[i][j] = n.nextInt();
    }
     for(int i=0;i<row;i++){
    for(int j=0;j<col;j++)
      mat2[i][j] = n.nextInt();
    }
    for(int i=0;i<=sub.length - 1;i++){
    for(int j=0;j<=sub[i].length - 1;j++)
      sub[i][j] = mat1[i][j] - mat2[i][j];
    }
    for(int i = 0; i <= sub.length - 1; i++){
      for(int j = 0; j <= sub[i].length - 1; j++)
      {
        System.out.print(sub[i][j] + " ");
      }
      System.out.println();
    }
  }
}