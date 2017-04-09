package controler;

import model.Matrix;
import model.exception.NoSolution;

public class FindDef {
    private Matrix matrix;
    public static  double findDef(Matrix matrix) throws NoSolution
    {
            matrix = (ToTriangleForm.ToTriangle(matrix));

        double def = matrix.getMatrix()[0][0];
        for(int i = 0; i < matrix.getMatrix().length; i++)
        {
            def *= matrix.getMatrix()[i][i];
        }
        return  def;
    }
}
