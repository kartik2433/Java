import java.util.Scanner;
class Pra_19{
    public static void get_matrix(int matrix[][], int row, int col){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void display(int matrix[][], int row, int col){
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Matrix (Row & Column Respectively) ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        System.out.println("Enter Matrix-1: ");
        get_matrix(matrix1,row,col);
        System.out.println("Enter Matrix-2: ");
        get_matrix(matrix2,row,col);
        System.out.println("Matrix-1 Elements: ");
        display(matrix1, row,col);
        System.out.println("Matrix-2 Elements: ");
        display(matrix2, row,col);
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                sum[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum Matrix Elements: ");
        display(sum,row,col);
    }
}

