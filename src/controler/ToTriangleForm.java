package controler;

import model.Matrix;
import model.Point;
import model.exception.*;

public class ToTriangleForm  {

    public static Matrix ToTriangle(Matrix matrix) throws NoSolution
    {
        // i - X , j - Y; матрица[Y][X];
        double[][]m;//Why write this?  = new double[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        int[] srtings = matrix.getStrings();
        String[] columns = matrix.getColumns();
        m = matrix.getMatrix();
        Point max = new Point(0,0);

        for(int i = 0; i < m[0].length; i ++)
        {
            // ищу максимальное значение в части матрицы
            for (int y = i; y < m.length; y++) {
                for (int x = i; x < m[0].length; x++) {
                    if (m[max.getY()][max.getX()] < m[y][x]) {
                        max.setX(x);
                        max.setY(y);
                    }
                }
            }
            // переношу его на главную диагональ, в то место, которое сейчас является нулевым элементом подматрицы
            //меняю местами строки;
            double[] tmpY = m [max.getY()];
            m[max.getY()] = m[i];
            m[i] = tmpY;

            int tmpStr = srtings[max.getY()];
            srtings[max.getY()] = srtings[i];
            srtings[i] = tmpStr;

            //меняю местами стлбцы;
            double tmpX;
            String tmpColumn;
            tmpColumn = columns[i];
            columns[i] = columns[max.getX()];
            columns[max.getX()] = tmpColumn;
            for (int x = i; x < m[0].length; x++) {
                tmpX = m[x][i];
                m[x][i] = m[x][max.getX()];
                m[x][max.getX()] = tmpX;
            }

            // произвожу операцию вычитания
            for (int y = i + 1; y < m.length; y++) {
                double tmp = m[y][i] / m[i][i];
                for (int x = i; x < m[0].length; x++) {
                    m[y][x] -= tmp * m[i][x];
                }
            }
        }

        matrix.setColumns(columns);
        matrix.setStrings(srtings);
        matrix.setMatrix(m);
        return matrix;

    }
}


// private Point size;

// private  Matrix matrix;
// Unusing Api, come back later
   /* private Point findMax(double[][] mat){
        Point max = new Point(0,0);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[max.x][max.y] < mat[i][j]) {
                    max.x = i;
                    max.y = j;
                }
            }
        }
        return max;
    }
    */

/*if((int)(m.length - 1) > 0 )//|| m[0][0] < 0.1E-6 )
        {
            System.err.println("!");
            Point coord;
            double[][] newMat = new double[m.length - 1][m[0].length];
            for (int i = 1; i < m.length; i++)
                for (int j = 1; j < m[0].length; j++) {
                    newMat[i - 1][j] = m[i][j];
                }
            coord = findMax(newMat );
            System.err.println(coord.x + "|" + coord.y);
            System.err.println(newMat[0].toString());
            double[] tmpX = newMat [coord.x];
            newMat [coord.x] = newMat[0];
            newMat[0] = tmpX;

            double tmpY;
            for (int i = 0; i < newMat.length; i++) {
                tmpY = newMat[i][0];
                newMat[i][0] = newMat[i][coord.y];
                newMat[i][coord.y] = tmpY;
            }
            for (int i = 0; i < newMat.length; i++) {
                for (int j = 0; j < newMat[0].length; j++) {
                    double tmp = newMat[i][0] / newMat[0][0];
                    newMat[i][j] -= tmp * newMat[0][j];
                }
            }

            newMat  = this.ToTriangle(newMat ).clone();
            for(int i = 0; i < newMat.length ; i++)
                for(int j = 0; j < newMat[0].length ; j++)
                m[i + 1][j] =  newMat[i][j];
            return newMat;
        }
        else {
            if(m[0][0] < 0.1E-6 ){
            double[][] newMat  = new double[m.length - 1][m[0].length];

            return newMat ;}
            else
            {
                double[][] newMat  = new double[m.length - 1][m[0].length];
                newMat[0][0] = m[1][1];
                return  newMat;
            }
        }*/