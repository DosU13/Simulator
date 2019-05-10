import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Modeling modeling = new Modeling();
        modeling.inputCamera(0 ,0 ,1000);



        modeling.addTriangle( 0 , 0 , 100 , 71 , 0 , 71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( 100 , 0 , 0 , 71 , 0 , 71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( 100 , 0 , 0 , 71 , 0 , -71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( 0 , 0 , -100 , 71 , 0 , -71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( 0 , 0 , 100 , -71 , 0 , 71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( -100 , 0 , 0 , -71 , 0 , 71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( -100 , 0 , 0 , -71 , 0 , -71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.addTriangle( 0 , 0 , -100 , -71 , 0 , -71 , 0  , 0 , 0 , new double[] {0, 0 ,0});
        modeling.toScreen();




        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(modeling);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}

