package transpose;

import java.util.Scanner;
import static transpose.Transpose.Normalize;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }
        Normalize(first);
        Normalize(second);
        // close the scanner
        sc.close();

        // print both matrices
        System.out.println("First Matrix:\n");
        Print2dArray.print2dArray(first);

        System.out.println("Second Matrix:\n");
        Print2dArray.print2dArray(second);

        // sum and transpose of matrices
        Transpose.transpose(Subtraction.Sub(first,second));
        Transpose.transpose(Multiplication.Mult(first,second));
        Transpose.transpose(Division.Div(first,second));
        Transpose.transpose(Sum.sum(first,second));
        System.out.println("\nBaris Normal Pertama:");
        Print2dArray.print2dArray(first);

        System.out.println("\nBaris Normal Kedua:");
        Print2dArray.print2dArray(second);
    }
}