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

    double [][] field  = new double[line][column];

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

    private ArrayList<String> bindingColumns = new ArrayList<>();

    public void setBindingColumns(ArrayList<String> bindingColumns) {
        this.bindingColumns = bindingColumns;
    }

    public ArrayList<String> getBindingColumns() {
        return bindingColumns;
    }

    private int[] bindingLines = new int[line];

    public void setBindingLines(int[] bindingLines) {
        this.bindingLines = bindingLines;
    }

    public int[] getBindingLines() {
        return bindingLines;
    }
}
