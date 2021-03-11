import java.util.Scanner;

class Main {
  // Input matrix
  public static int[][] mat(int a, int b){
    Scanner scanner = new Scanner(System.in);
    int matrix[][] = new int[a][b];

    for (int i = 0; i< a; ++i){
      for(int j = 0; j< b; ++j){
       matrix[i][j]= scanner.nextInt();
      }
    }
    return (matrix);
  }

  // Output matrix 
  public static void matOut(int mat[][], int a, int b){
    System.out.println("получилась матрица:");
    for (int row[]: mat){
      for(int n: row){
        System.out.print(n + " ");
      }
      System.out.println();
    }
  }

  // Summing matrix
  public static void matSum(int mat1[][], int mat2[][], int a, int b){
    int matrix[][] = new int [a][b];

    for (int i = 0; i< a; ++i){
      for(int j = 0; j< b; ++j){
       matrix[i][j]= mat1[i][j] + mat2[i][j];
      }
    }
    System.out.println();
    System.out.print("В результате сложения ");

    matOut(matrix, a, b);
  }
  
  // Minusing matrix
  public static void matMinus(int mat1[][], int mat2[][], int a, int b){
    int matrix[][] = new int [a][b];

    for (int i = 0; i< a; ++i){
      for(int j = 0; j< b; ++j){
       matrix[i][j]= mat1[i][j] - mat2[i][j];
      }
    }
    System.out.println();
    System.out.print("В результате вычитания ");

    matOut(matrix, a, b);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    
    System.out.println();
    System.out.println("Введите размер матриц:");

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    System.out.println();
    System.out.println("Введите первую матрицу:");
    int matrix1[][] = mat(a, b);
   
    System.out.println();
    System.out.println("Введите вторую матрицу:");
    int matrix2[][] = mat(a, b);

    matSum(matrix1, matrix2, a, b);

    matMinus(matrix1, matrix2, a, b);

    scanner.close();
  }
}