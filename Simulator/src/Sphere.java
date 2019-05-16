import javax.swing.JFrame;

public class Sphere
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Modeling modeling = new Modeling();
        modeling.background(200, 201, 150);


        modeling.addTriangle(0, 0, 100, 0, 71, 71, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, -71, 0, 71, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, 71, 0, 71, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, 100, 0, -71, 71, -71, 0, 71, new double[]{0, 200, 255});

        modeling.addTriangle(-71, 71, 0, -71, 0, 71, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(71, 71, 0, 0, 71, 71, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(71, -71, 0, 71, 0, 71, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-71, -71, 0, 0, -71, 71, -71, 0, 71, new double[]{0, 200, 255});

        modeling.addTriangle(0, 100, 0, 71, 71, 0, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 100, 0, -71, 71, 0, 0, 71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 100, 0, -71, 71, 0, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 100, 0, 71, 71, 0, 0, 71, -71, new double[]{0, 200, 255});

        modeling.addTriangle(100, 0, 0, 71, 71, 0, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(100, 0, 0, 71, -71, 0, 71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(100, 0, 0, 71, -71, 0, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(100, 0, 0, 71, 71, 0, 71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(0, 0, -100, -71, 0, -71, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 0, 71, -71, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 71, 0, -71, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, 0, -100, 0, -71, -71, -71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(-71, 71, -0, -71, 0, -71, 0, 71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(71, 71, -0, 0, 71, -71, 71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(71, -71, -0, 71, 0, -71, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(-71, -71, -0, 0, -71, -71, -71, 0, -71, new double[]{0, 200, 255});

        modeling.addTriangle(0, -100, 0, 71, -71, 0, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, -100, 0, -71, -71, 0, 0, -71, 71, new double[]{0, 200, 255});
        modeling.addTriangle(0, -100, 0, -71, -71, 0, 0, -71, -71, new double[]{0, 200, 255});
        modeling.addTriangle(0, -100, 0, 71, -71, 0, 0, -71, -71, new double[]{0, 200, 255});

        modeling.addTriangle(-100, 0, 0, -71, 71, 0, -71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-100, 0, 0, -71, -71, 0, -71, 0, 71, new double[]{0, 200, 255});
        modeling.addTriangle(-100, 0, 0, -71, -71, 0, -71, 0, -71, new double[]{0, 200, 255});
        modeling.addTriangle(-100, 0, 0, -71, 71, 0, -71, 0, -71, new double[]{0, 200, 255});


        modeling.addTriangle(-500, -500, -100, -500, 500, -100, 500, -500, -100, new double[]{100, 255, 0});
        modeling.addTriangle(500, 500, -100, -500, 500, -100, 500, -500, -100, new double[]{100, 255, 0});

        double x = 0;
        while (true) {
            x +=0.4;

            try{
                Thread.sleep(  40);
            } catch (Exception exc){}

            modeling.inputCamera(x, 5, 1001);
            modeling.inputLight(45+x, 50);
            frame.repaint();

            modeling.draw();


            frame.add(modeling);
            frame.setVisible(true);
        }
    }





}

