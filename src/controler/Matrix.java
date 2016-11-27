package controler;

/**
 * Created by Михаил on 19.11.2016.
 */

public class Matrix {
    int [] strings;
    int [] columns;
    int [][] matrix;
    Matrix(int m[][])
    {
        matrix = m;
        strings = new int[m.length];
        columns = new int[m[0].length];
    }
}
