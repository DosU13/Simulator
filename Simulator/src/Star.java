import javax.swing.JFrame;

public class Star
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Modeling modeling = new Modeling();
        modeling.background(100, 200, 255);


        modeling.addTriangle(0,  60, 0,0 , 0, 200, 59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,190 , 0, 62, 59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,190 , 0, 62, 95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,118 , 0, -162, 95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,118 , 0, -162, 0, 0 , -100, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,0 , 0, 200, -59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,-190 , 0, 62, -59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,-190 , 0, 62, -95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,-118 , 0, -162, -95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  60, 0,-118 , 0, -162, 0, 0 , -100, new double[]{255, 240, 0});


        modeling.addTriangle(0,  -60, 0,0 , 0, 200, 59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,190 , 0, 62, 59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,190 , 0, 62, 95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,118 , 0, -162, 95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,118 , 0, -162, 0, 0 , -100, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,0 , 0, 200, -59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,-190 , 0, 62, -59, 0 , 81, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,-190 , 0, 62, -95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,-118 , 0, -162, -95, 0 , -31, new double[]{255, 240, 0});
        modeling.addTriangle(0,  -60, 0,-118 , 0, -162, 0, 0 , -100, new double[]{255, 240, 0});


        double x = 0;
        while (true) {
            x +=0.4;

            try{
                Thread.sleep(  40);
            } catch (Exception exc){}

            modeling.inputCamera(x, 20, 1001);
            modeling.inputLight(10+x, 45);
            frame.repaint();

            modeling.draw();


            frame.add(modeling);
            frame.setVisible(true);
        }
    }





}

