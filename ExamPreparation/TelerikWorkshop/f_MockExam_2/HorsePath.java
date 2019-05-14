package g_MockExam_2;

import java.util.Scanner;

public class HorsePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        int[] dRows = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] dCols = {-1, +1, -2, +2, -2, +2, -1, +1};

        int counter = 1;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                //path of horse

                int rowTemp = row;
                int colTemp = col;

                while (matrix[rowTemp][colTemp] == 0) {
                    matrix[rowTemp][colTemp] = counter;
                    counter++;

                    for (int dir = 0; dir < dRows.length; dir++) {
                        int nextRow = rowTemp + dRows[dir];
                        int nextCol = colTemp + dCols[dir];

                        if (nextRow < 0 || nextRow >= matrix.length
                                || nextCol < 0 || nextCol >= matrix.length) {
                            continue;
                        }

                        if (matrix[nextRow][nextCol] != 0) {
                            continue;
                        }

                        rowTemp = nextRow;
                        colTemp = nextCol;
                        break;
                    }
                }
            }
            
        }

        for (int[] row : matrix) {

            String result = "";

            for (int i = 0; i < row.length; i++) {
                result += row[i] + " ";
            }

            System.out.println(result.trim());
        }
    }
}
