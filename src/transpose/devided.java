package transpose;

public class devided {
    public static int[][] dep(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] dep = new int[row][column];

        System.out.println("\ndevided of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                dep[r][c] = first[r][c] / second[r][c];

        Print2dArray.print2dArray(dep);
        System.out.println("\n");
        return dep;
    }
}
