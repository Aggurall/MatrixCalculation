package controler;

/**
 * Created by Михаил on 19.11.2016.
 */
public class FindDef {
    private  Matrix matrix;
    public double findDef(double[][] matrix)
    {
        ToTriangleForm t = new ToTriangleForm();
        matrix = (t.ToTriangle(matrix)).clone();
        double def = matrix[0][0];
        for(int i = 0; i < matrix.length; i++)
        {
            def *= matrix[i][i];
        }
        return  def;
    }
}
