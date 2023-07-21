package matrixProduct;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of column: ");
        int column = scanner.nextInt();
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter scalar to multiply: ");
        int scalar = scanner.nextInt();
        scanner.close();
        product(array, row, column, scalar);

    }

    public static void product(int array[][], int row, int column, int scalar) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] *= scalar;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

}
