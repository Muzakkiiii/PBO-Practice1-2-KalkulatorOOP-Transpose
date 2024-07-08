package transpose;
public class Subtraction {
    public static int[][] subt(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] subt = new int[row][column];

        System.out.println("\nSubtraction of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                subt[r][c] = first[r][c] + second[r][c];

        Print2dArray.print2dArray(subt);
        System.out.println("\n");
        return subt;
    }
}
