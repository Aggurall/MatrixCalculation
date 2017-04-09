package model;

import java.util.ArrayList;
import java.util.Date;

public class Field {

    private int line;
    private int column;

    public Field(final int line, final int column) {
        this.line = line;
        this.column = column;
    }

    public int[] getSize() {
        int[] size = {line, column};
        return size;
    }

    public void setNumber (final Point point, final double userNumber){
        field[point.getX()][point.getY()] = userNumber;
    }

    public double getNumber (final Point point){
        return  field[point.getX()][point.getY()];
    }
    public void setBindingColumns(ArrayList<String> bindingColumns) {
        this.bindingColumns = bindingColumns;
    }

    public ArrayList<String> getBindingColumns() {
        return bindingColumns;
    }

    public void setBindingLines(int[] bindingLines) {
        this.bindingLines = bindingLines;
    }

    public int[] getBindingLines() {
        return bindingLines;
    }

    private double [][] field  = new double[line][column];

    private ArrayList<String> bindingColumns = new ArrayList<>();

    private int[] bindingLines = new int[line];

}
