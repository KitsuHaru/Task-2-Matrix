package transpose;

class Multiplication{
    public static int[][] Mult(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] Mult = new int[row][column];

        System.out.println("\nMultiplication of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                Mult[r][c] = first[r][c] + second[r][c];

        Print2dArray.print2dArray(Mult);
        return Mult;
    }
}
