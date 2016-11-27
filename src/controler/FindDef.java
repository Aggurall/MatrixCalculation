package controler;

import model.exception.ThereInNoSolution;

/**
 * Created by Михаил on 19.11.2016.
 */
public class FindDef {
    private  Matrix matrix;
    public static double findDef(Matrix matrix) throws ThereInNoSolution
    {
        try {
            matrix = (ToTriangleForm.ToTriangle(matrix));
        }
        catch(ThereInNoSolution ex)
        {

        }
        double def = matrix.getMatrix()[0][0];
        for(int i = 0; i < matrix.getMatrix().length; i++)
        {
            def *= matrix.getMatrix()[i][i];
        }
        return  def;
    }
}
