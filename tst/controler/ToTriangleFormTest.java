package controler;

import model.Matrix;
import model.exception.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToTriangleFormTest {

    @Test
    public void toTriangle() throws NoSolution {
        double[][] inputMatrix = new double [][] {{0.01, 3.21, -3.22, 5.31},
                                                 {2.1, 0.15, 2.46, 1.42},
                                                 {0.54, -0.12, 0.79, 2.81},
                                                 {2.31, -0.61, 3.48, -3.28}};

//        double[][] expectedMatrix1 = new double [][] {  {1, -0.606, 0.605, 0.002},
//                                                        {0, 3.321, -0.708, 2.097},
//                                                        {0, 2.494, -1.819, 0.535},
//                                                        {0, 1.491, 1.373, 2.316}};
//
//
//        double[][] expectedMatrix2 = new double [][] {  {1, -0.606, 0.605, 0.002},
//                                                        {0, 1, -0.213, 0.631},
//                                                        {0, 0, 1, 0.813},
//                                                        {0, 0, 0, 1}};

//        //Тестовый вывод матрицы
//        for(int y = 0; y < testMatrix.length; y ++) {
//            for (int x = 0; x < testMatrix[0].length; x++)
//                System.err.print(testMatrix[y][x] + " | ");
//            System.err.println();
//        }





        //Вторая проверка
        final Double expectedValue = 1.0;
        final int NUMBER = 4;

        Matrix testMatrix = new Matrix(inputMatrix,null);

        final double[][] resultMatrix = ToTriangleForm.ToTriangle(testMatrix).getSolut();

        if(resultMatrix == null){ fail(" getSolut() Method return: null");}

        for (int i = 0; i < resultMatrix.length; i++) {

            Double actualValue = new BigDecimal(resultMatrix[i][i]).setScale(NUMBER, RoundingMode.UP).doubleValue();

            assertEquals(expectedValue, actualValue);
        }
    }
}