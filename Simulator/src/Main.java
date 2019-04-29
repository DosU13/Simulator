import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        camera.insert(90,90,100);
        int[] cameraGetCoordinates = camera.getCoordinates();
        System.out.printf("%n%s  ,  %s  ,  %s" , cameraGetCoordinates[0] , cameraGetCoordinates[1] , cameraGetCoordinates[2]);


        Draw D = new Draw();
        D.draw();

    }

}
