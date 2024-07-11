package transpose;

class Division{
    public static int[][] Div(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] Div = new int[row][column];

        System.out.println("\nDivision of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                Div[r][c] = first[r][c] + second[r][c];

        Print2dArray.print2dArray(Div);
        return Div;
    }
}
