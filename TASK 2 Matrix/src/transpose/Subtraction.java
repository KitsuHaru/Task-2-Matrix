package transpose;

class Subtraction{
    public static int[][] Sub(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] Sub = new int[row][column];

        System.out.println("\nSubtraction of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                Sub[r][c] = first[r][c] + second[r][c];

        Print2dArray.print2dArray(Sub);
        return Sub;
    }
}
