import javax.swing.JFrame;
//import java.awt.Color;
//import java.util.Scanner;

public class Draw
{
    public void draw()
    {

//        Scanner input = new Scanner(System.in);

        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Triangle triangle = new Triangle();
        triangle.insert(10,10,1,10,200,1, 200 , 10 , 1 ,0 , 0 , 0);
        int[] triangleGetCentroid = triangle.getCentroid();
        frame.add(triangle);
        frame.setSize(300,300);
        frame.setVisible(true);



        System.out.printf("%n%s,%s,%S" , triangleGetCentroid[0] , triangleGetCentroid[1] , triangleGetCentroid[2]);
    }

}
