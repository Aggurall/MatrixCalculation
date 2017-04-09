package controler;

import model.Matrix;
import model.exception.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToTriangleFormTest {
    @Test
    public void toTriangle() throws MatrixCalculationException {
        double[][] matrix = new double [2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2.1;
        matrix[1][0] = 10;
        matrix[1][1] = 9;
        Matrix mat = new Matrix(matrix,null);
        //Тестовый вывод матрицы
        System.err.println();
        for(int y = 0; y < matrix.length; y ++) {
            for (int x = 0; x < matrix[0].length; x++)
                System.err.print(matrix[y][x] + " | ");
            System.err.println();
        }
        double result = 0;
        try {
            result = FindDef.findDef(mat);
        }
        catch (NoSolution ex){};

        System.err.println(result);
    }

}