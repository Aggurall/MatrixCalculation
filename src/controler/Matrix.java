package controler;

/**
 * Created by Михаил on 19.11.2016.
 */

public class Matrix {
    int [] strings;
    String [] columns;
    double [][] matrix;
    Matrix(double m[][])
    {
        matrix = m;
        strings = new int[m.length];
        columns = new String[m[0].length];
    }

    public int[] getStrings() {
        return strings;
    }

    public void setStrings(int[] strings) {
        this.strings = strings;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
}
