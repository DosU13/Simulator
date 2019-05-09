import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
import java.awt.Color;

public class Triangle extends JPanel
{
    private int  red , green , blue , centroidX , centroidY , centroidZ;
    private int rX1 , rX2 , rX3 , rY1 , rY2 , rY3  ;
    void init(int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3, int red, int green, int blue, int CAMX, int CAMY, int CAMZ)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        centroidX = (x1 + x2 + x3)/3;
        centroidY = (y1 + y2 + y3)/3;
        centroidZ = (z1 + z2 + z3)/3;
        GetCoordinates first = new GetCoordinates();
        double[] rFirst;
        rFirst = first.getCoordinates(x1 , y1 , z1 , CAMX , CAMY , CAMZ );
        double[] rSecond ;
        rSecond = first.getCoordinates(x2 , y2 , z2 , CAMX , CAMY , CAMZ);
        double[] rThird ;
        rThird = first.getCoordinates(x3 , y3 , z3 , CAMX , CAMY , CAMZ);
        rX1 = (int) rFirst[0];
        rY1 = (int) rFirst[1];
        rX2 = (int) rSecond[0];
        rY2 = (int) rSecond[1];
        rX3 = (int) rThird[0];
        rY3 = (int) rThird[1];
    }



    public void paintComponent  (Graphics g)
    {
        super.paintComponent(g);
            int width = getWidth() / 2;
            int height = getHeight() / 2;


            int[] xValues = {rX1 + width , rX2 + width ,rX3 + width };
            int[] yValues = {-rY1 + height , -rY2 + height , -rY3 + height};

            g.setColor(new Color(red , green , blue));
            Polygon triangle1 = new Polygon(xValues, yValues, 3);
            g.fillPolygon(triangle1);


    }

    int[] getCentroid()
    {
        return (new int[]{centroidX , centroidY , centroidZ});
    }
}
