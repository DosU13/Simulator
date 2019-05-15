import javax.swing.JFrame;

public class Main2
{
    public static void main(String[] args) {
        Modeling modeling = new Modeling();
        modeling.inputCamera(20, 5, 1000);
        modeling.inputLight(80, 45);
        modeling.background(200 , 200 ,  150);


        modeling.addTriangle(0, 0, 100, 0, 71, 71, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, -71, 0, 71, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, 71, 0, 71, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, 0, -71, 71, -71, 0, 71, new double[]{0, 200, 255});

        modeling.addTriangle(-71, 71, 0, -71, 0, 71, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(71, 71, 0, 0, 71, 71, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(71, -71, 0, 71, 0, 71, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-71, -71, 0, 0, -71, 71, -71, 0, 71, new double[]{0, 200, 255});

        modeling.addTriangle(0 , 100, 0, 71, 71, 0, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , 100, 0, -71, 71, 0, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , 100, 0, -71, 71, 0, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , 100, 0, 71, 71, 0, 0, 71, -71, new double[]{0, 200, 255});

        modeling.addTriangle(100 , 0, 0, 71, 71, 0, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(100 , 0, 0, 71, -71, 0, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(100 , 0, 0, 71, -71, 0, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(100 , 0, 0, 71, 71, 0, 71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(0, 0, -100, -71, 0, -71, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 0, 71, -71, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 71, 0, -71, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 0, -71, -71, -71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(-71, 71, -0, -71, 0, -71, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(71, 71, -0, 0, 71, -71, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(71, -71, -0, 71, 0, -71, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(-71, -71, -0, 0, -71, -71, -71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(0 , -100, 0, 71, -71, 0, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , -100, 0, -71, -71, 0, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , -100, 0, -71, -71, 0, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0 , -100, 0, 71, -71, 0, 0, -71, -71, new double[]{0, 200, 255});

        modeling.addTriangle(-100 , 0, 0, -71, 71, 0, -71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-100 , 0, 0, -71, -71, 0, -71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-100 , 0, 0, -71, -71, 0, -71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(-100 , 0, 0, -71, 71, 0, -71, 0, -71, new double[]{0, 200, 255});


        modeling.addTriangle(-300 , -300, -150, -300, 300, -150, 300, -300, -150, new double[]{100, 255, 0});
        modeling.addTriangle(300 , 300, -150, -300, 300, -150, 300, -300, -150, new double[]{100, 255, 0});

        modeling.draw();


        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(modeling);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }


}

