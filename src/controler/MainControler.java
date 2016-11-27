package controler;

/**
 * Created by Михаил on 19.11.2016.
 */
public class MainControler {
    public static void main(String args[])
    {
        FindDef t = new FindDef();
        double[][] matrix = new double [2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 4;
        matrix[1][1] = 9;
        //Тестовый вывод матрицы
        System.err.println();
        for(int y = 0; y < matrix.length; y ++) {
            for (int x = 0; x < matrix[0].length; x++)
                System.err.print(matrix[y][x] + " | ");
            System.err.println();
        }
        double result = 0;
        result = t.findDef(matrix);
        System.err.println(result);
    }
}

