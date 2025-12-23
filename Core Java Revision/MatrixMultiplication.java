import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the dimension of first matrix");

        System.out.println("Enter the value of m");
        int m = scan.nextInt();

        System.out.println("Enter the value of n");
        int n = scan.nextInt();

        int[][] matrixA = new int[m][n];

        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                System.out.println("Entre the element of the matrix");
                matrixA[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the dimension of second matrix");

        System.out.println("Enter the value of p");
        int p = scan.nextInt();

        System.out.println("Enter the value of q");
        int q = scan.nextInt();
	int[][] matrixB = new int[p][q];

        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                System.out.println("Entre the element of the matrix");
                matrixB[i][j] = scan.nextInt();
            }
        }

        if(n != p) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            int[][] matrixC = new int[m][q];

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    for(int k = 0; k < q; k++) {
                        matrixC[i][k] += matrixA[i][j] * matrixB[j][k];
	 }
                }
            }

            System.out.println("Resultant Matrix");
            for(int i = 0; i < matrixC.length; i++) {
                for(int j = 0; j < matrixC[i].length; j++) {
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}