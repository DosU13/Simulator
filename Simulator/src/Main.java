import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Modeling modeling = new Modeling();
        modeling.inputCamera(10 , 10 ,700);
        modeling.inputLight(90 , 60);



        modeling.addTriangle( 0 , 0 , 300 , 400 , 0 , -200 , -400  , 0 , -200 , new double[] {0, 200 ,255});
        modeling.toScreen();




        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(modeling);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

}

