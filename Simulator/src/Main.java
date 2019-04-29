import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        camera.init(90,90,100);
        int[] cameraGetCoordinates = camera.getCoordinates();
        int CAMX = cameraGetCoordinates[0];
        int CAMY = cameraGetCoordinates[1];
        int CAMZ = cameraGetCoordinates[2];
        System.out.printf("%n%s  ,  %s  ,  %s" , cameraGetCoordinates[0] , cameraGetCoordinates[1] , cameraGetCoordinates[2]);


        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Triangle triangle = new Triangle();
        triangle.init(10,10,1,10,200,1, 200 , 10 , 1 ,0 , 0 , 0 , CAMX , CAMY , CAMZ);
        int[] triangleGetCentroid = triangle.getCentroid();
        frame.add(triangle);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}

