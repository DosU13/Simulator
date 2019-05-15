import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args) {
        Modeling modeling = new Modeling();
        modeling.inputCamera(270, 0, 1000);
        modeling.inputLight(0, 45);



        modeling.addTriangle(-10, -90, -10, -110, -10, -30, 0, 0, 0, new double[]{50, 200, 60});
        modeling.addTriangle(-10, -90, -10, 100, 10, 0, 0, 0, 0, new double[]{50, 200, 60});
        modeling.addTriangle(-10, -90, -10, 100, 10, 0, 200, 5, -20, new double[]{50, 200, 60});
        modeling.addTriangle(20, 110, 0, 100, 10, 0, 0, 0, 0, new double[]{50, 200, 60});
        modeling.addTriangle(20, 110, 0, -80, 90, -20, 0, 0, 0, new double[]{50, 200, 60});
        modeling.addTriangle(-110, -10, -30, -80, 90, -20, 0, 0, 0, new double[]{50, 200, 60});
        modeling.addTriangle(20, 110, 0, -80, 90, -20, 20, 110, 0, new double[]{50, 200, 60});
        modeling.addTriangle(20, 110, 0, 200, 5, -20, 20, 110, 0, new double[]{50, 200, 60});
        modeling.addTriangle(100, 10, 0, 200, 5, -20, 20, 110, 0, new double[]{50, 200, 60});




        modeling.addTriangle(43, 43, 0, 50, 44, 0, 44, 44, 50, new double[]{100, 40, 20});
        modeling.addTriangle(43, 43, 0, 50, 44, 0, 49, 44, 50, new double[]{100, 40, 20});
        modeling.addTriangle(43, 43, 0, 44, 50, 0, 44, 44, 50, new double[]{100, 40, 20});
        modeling.addTriangle(43, 43, 0, 44, 50, 0, 44, 49, 50, new double[]{100, 40, 20});
        modeling.addTriangle(50, 44, 0, 44, 50, 0, 45, 49, 50, new double[]{100, 40, 20});
        modeling.addTriangle(50, 44, 0, 44, 50, 0, 49, 45, 50, new double[]{100, 40, 20});




        modeling.addTriangle(45, 45, 130, 22, 44, 100, 46, 27, 89, new double[]{100, 200, 20});
        modeling.addTriangle(45, 45, 130, 64, 44, 111, 46, 27, 89, new double[]{100, 200, 20});
        modeling.addTriangle(45, 45, 130, 64, 44, 111, 47, 67, 108, new double[]{100, 200, 20});
        modeling.addTriangle(45, 45, 130, 22, 44, 100, 47, 67, 108, new double[]{100, 200, 20});
        modeling.addTriangle(20, 25, 60, 22, 44, 100, 46, 27, 89, new double[]{100, 200, 20});
        modeling.addTriangle(67, 23, 55, 64, 44, 111, 46, 27, 89, new double[]{100, 200, 20});
        modeling.addTriangle(69, 70, 60, 64, 44, 111, 47, 67, 108, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 56, 22, 44, 100, 47, 67, 108, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 56, 22, 44, 100, 20, 25, 60, new double[]{100, 200, 20});
        modeling.addTriangle(67, 23, 55, 46, 27, 89, 20, 25, 60, new double[]{100, 200, 20});
        modeling.addTriangle(67, 23, 55, 64, 44, 111, 69, 70, 60, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 56, 47, 67, 108, 69, 70, 60, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 39, 48, 41, 100, 20, 25, 60, new double[]{100, 200, 20});
        modeling.addTriangle(67, 23, 55, 47, 36,45 , 20, 25, 60, new double[]{100, 200, 20});
        modeling.addTriangle(67, 23, 55, 54, 40, 40, 69, 70, 60, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 56, 44, 53, 43, 69, 70, 60, new double[]{100, 200, 20});
        modeling.addTriangle(21, 68, 56, 44, 53, 43, 39, 48, 41, new double[]{100, 200, 20});
        modeling.addTriangle(20, 25, 60, 47, 36, 45, 39, 48, 41, new double[]{100, 200, 20});
        modeling.addTriangle(67 , 23, 55, 47, 36, 45, 54, 40, 40, new double[]{100, 200, 20});
        modeling.addTriangle(69 , 70, 60, 44, 53, 43, 54, 40, 40, new double[]{100, 200, 20});

        modeling.draw();


        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(modeling);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }


}

