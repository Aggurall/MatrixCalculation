package model;

public class Matrix {
    private int [] strings;
    private String [] columns;
    private double [][] matrix;
    private double [][] solut;
    public Matrix(double matrix[][], double[][] solut)
    {
        this.solut = solut;
        this.matrix = matrix;
        strings = new int[matrix.length];
        columns = new String[matrix[0].length];
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

    public double[][] getSolut() {
        return solut;
    }

    public void setSolut(double[][] solut) {
        this.solut = solut;
    }

}
