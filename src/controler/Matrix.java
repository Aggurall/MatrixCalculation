package controler;

/**
 * Created by Михаил on 19.11.2016.
 */

public class Matrix {
    private int [] strings;
    private String [] columns;
    private double [][] matrix;
    Matrix(double m[][])
    {
        matrix = m;
        strings = new int[m.length];
        columns = new String[m[0].length];
    }

    public void setStrings(int[] strings) {
        this.strings = strings;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int[] getStrings() {
        return strings;
    }

    public String[] getColumns() {
        return columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }
}
