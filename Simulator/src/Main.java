import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Modeling modeling = new Modeling();
        modeling.inputCamera(6 , -40 ,300);
        modeling.inputLight(30 , -45);


        modeling.addTriangle( 0 , 100 , 0 , -100 , 0 , 0 , 0  , 0 , 100 , new double[] {0, 200 ,255});
        modeling.addTriangle( 0 , 100 , 0 , -100 , 0 , 0 , 0  , 0 , -100 , new double[] {0, 200 ,255});
        modeling.addTriangle( 0 , 100 , 0 , 100 , 0 , 0 , 0  , 0 , -100 , new double[] {0, 200 ,255});
        modeling.addTriangle( 0 , 100 , 0 , 100 , 0 , 0 , 0  , 0 , 100 , new double[] {0, 200 ,255});
        modeling.toScreen();




        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(modeling);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

}

