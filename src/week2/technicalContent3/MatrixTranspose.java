package week2.technicalContent3;

public class MatrixTranspose
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("Matrix:");
        print(matrix);

        int[][] transpose = transpose(matrix);

        System.out.println("Matrix Transpose:");
        print(transpose);
    }

    public static int[][] transpose(int[][] matrix)
    {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void print(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
