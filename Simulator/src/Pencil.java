import javax.swing.JFrame;

public class Pencil
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Modeling modeling = new Modeling();
        modeling.background(200, 201, 150);


        modeling.addTriangle(0,  -200, 0,-100 , -200, 0, -50, -200 , 87, new double[]{255, 200, 100});
        modeling.addTriangle(0,  -200, 0,-100 , -200, 0, -50, -200 , -87, new double[]{255, 200, 100});
        modeling.addTriangle(0,  -200, 0,100 , -200, 0, 50, -200 , 87, new double[]{255, 200, 100});
        modeling.addTriangle(0,  -200, 0,100 , -200, 0, 50, -200 , -87, new double[]{255, 200, 100});
        modeling.addTriangle(0,  -200, 0,-50 , -200, 87, 50, -200 , 87, new double[]{255, 200, 100});
        modeling.addTriangle(0,  -200, 0,-50 , -200, -87, 50, -200 , -87, new double[]{255, 200, 100});


        modeling.addTriangle(-100,  200, 0,-100 , -200, 0, -50, -200 , 87, new double[]{100, 50,0});
        modeling.addTriangle(-100,  200, 0,-100 , -200, 0, -50, -200 , -87, new double[]{100, 50,0});
        modeling.addTriangle(100,  200, 0,100 , -200, 0, 50, -200 , 87, new double[]{100, 50, 0});
        modeling.addTriangle(100,  200, 0,100 , -200, 0, 50, -200 , -87, new double[]{100, 50, 0});
        modeling.addTriangle(-50,  200, 87,-50 , -200, 87, 50, -200 , 87, new double[]{100, 50, 0});
        modeling.addTriangle(-50,  200, -87,-50 , -200, -87, 50, -200 , -87, new double[]{100, 50, 0});


        modeling.addTriangle(-50,  -200, 87,-100 , 200, 0, -50, 200 , 87, new double[]{100, 50, 0});
        modeling.addTriangle(-50,  -200, -87,-100 , 200, 0, -50, 200 , -87, new double[]{100, 50, 0});
        modeling.addTriangle(50,  -200, 87,100 , 200, 0, 50, 200 , 87, new double[]{100, 50, 0});
        modeling.addTriangle(50,  -200, -87,100 , 200, 0, 50, 200 , -87, new double[]{100, 50, 0});
        modeling.addTriangle(50,  -200, 87,-50 , 200, 87, 50, 200 , 87, new double[]{100, 50, 0});
        modeling.addTriangle(50,  -200, -87,-50 , 200, -87, 50, 200 , -87, new double[]{100, 50, 0});


        modeling.addTriangle(-20,  300, 0,-100 , 200, 0, -50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(-20,  300, 0,-100 , 200, 0, -50, 200 , -87, new double[]{255, 200, 0});
        modeling.addTriangle(20,  300, 0,100 , 200, 0, 50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(20,  300, 0,100 , 200, 0, 50, 200 , -87, new double[]{255, 200, 0});
        modeling.addTriangle(-10,  300, 17,-50 , 200, 87, 50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(-10,  300, -17,-50 , 200, -87, 50, 200 , -87, new double[]{255, 200, 0});

        modeling.addTriangle(-20,  300, 0,-10 , 300, 17, -50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(-20,  300, 0,-10 , 300, -17, -50, 200 , -87, new double[]{255, 200, 0});
        modeling.addTriangle(20,  300, 0,10 , 300, 17, 50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(20,  300, 0,10 , 300, -17, 50, 200 , -87, new double[]{255, 200, 0});
        modeling.addTriangle(-10,  300, 17,10 , 300, 17, 50, 200 , 87, new double[]{255, 200, 0});
        modeling.addTriangle(-10,  300, -17,10 , 300, -17, 50, 200 , -87, new double[]{255, 200, 0});

        modeling.addTriangle(-20,  300, 0,-10 , 300, 17, 0, 350 , 0, new double[]{20, 20, 20});
        modeling.addTriangle(-20,  300, 0,-10 , 300, -17, 0, 350 , 0, new double[]{20, 20, 20});
        modeling.addTriangle(20,  300, 0,10 , 300, 17, 0, 350 , 0, new double[]{20, 20, 20});
        modeling.addTriangle(20,  300, 0,10 , 300, -17, 0, 350 , 0, new double[]{20, 20, 20});
        modeling.addTriangle(-10,  300, 17,10 , 300, 17, 0, 350 , 0, new double[]{20, 20, 20});
        modeling.addTriangle(-10,  300, -17,10 , 300, -17, 0, 350 , 0, new double[]{20, 20, 20});


        double x = 0;
        while (true) {
            x +=0.4;

            try{
                Thread.sleep(  40);
            } catch (Exception exc){}

            modeling.inputCamera(x, 20, 1001);
            modeling.inputLight(45+x, 60);
            frame.repaint();

            modeling.draw();


            frame.add(modeling);
            frame.setVisible(true);
        }
    }





}

