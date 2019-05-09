import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        camera.init(45 ,45 ,1000);
        int[] cameraGetCoordinates = camera.getCoordinates();
        int CAMX = cameraGetCoordinates[0];
        int CAMY = cameraGetCoordinates[1];
        int CAMZ = cameraGetCoordinates[2];


        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Triangle triangle = new Triangle();

        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle();
        triangle.init( 100 , -100 , 100 , -100 , 50 , 0 , 0  , 0 , 0, 0, 0 ,0, CAMX , CAMY , CAMZ);


        int[] triangleGetCentroid = triangle.getCentroid();
        frame.add(triangle );


        frame.setSize(300,300);
        frame.setVisible(true);
//        double[] rFirst;
//        GetCoordinates first = new GetCoordinates();
//        rFirst = first.getCoordinates(200 , 300 , 400 , 4000 , 4000 , 4000 );
//        System.out.printf("%n%s    %s" , rFirst[0] , rFirst[1] );

    }

}

