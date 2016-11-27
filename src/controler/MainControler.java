package controler;

import model.exception.ThereInNoSolution;

/**
 * Created by Михаил on 19.11.2016.
 */
public class MainControler {
    public static void main(String args[])
    {
        double[][] matrix = new double [2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 4;
        matrix[1][1] = 9;
        Matrix mat = new Matrix(matrix);
        //Тестовый вывод матрицы
        System.err.println();
        for(int y = 0; y < matrix.length; y ++) {
            for (int x = 0; x < matrix[0].length; x++)
                System.err.print(matrix[y][x] + " | ");
            System.err.println();
        }
        double result = 0;
        try{result = FindDef.findDef(mat);}
        catch (ThereInNoSolution ex){}
        System.err.println(result);
    }
}

