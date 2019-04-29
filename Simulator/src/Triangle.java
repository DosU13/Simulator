import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
import java.awt.Color;

public class Triangle extends JPanel
{
    private int  x1 , x2 , x3 , y1 , y2 , y3 , z1 , z2, z3 , red , green , blue , centroidX , centroidY , centroidZ;
    public void insert(int x1 , int y1, int z1 , int x2 , int y2 , int z2 , int x3 , int y3 , int z3 , int red , int green , int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
        centroidX = (x1 + x2 + x3)/3;
        centroidY = (y1 + y2 + y3)/3;
        centroidZ = (z1 + z2 + z3)/3;


    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);


            int[] xValues = {x1/z1, x2/z2, x3/z3};
            int[] yValues = {y1/z1 , y2/z2 , y3/z3};

            Color color = new Color(red , green , blue);
            g.setColor(color);
            Polygon triangle1 = new Polygon(xValues, yValues, 3);
            g.fillPolygon(triangle1);


    }

    public int[] getCentroid()
    {
        int[] result = {centroidX , centroidY , centroidZ};
        return (result);
    }
}
