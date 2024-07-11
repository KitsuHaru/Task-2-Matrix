package transpose;

public class Transpose {
    public static void transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;

        System.out.println("Elements of transpose matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(data[c][r] + "\t");
            }
            System.out.println();
        }
    }
    public static void Normalize(int[][] normal) {
        int row = normal.length;
        int column = normal[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                int temp = normal[i][j];
        normal[i][j] = normal[j][i];
        normal[j][i] = temp;
            }
        }
    }
}
