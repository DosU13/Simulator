import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;

class Modeling extends JPanel {
    private double camX, camY, camZ;


    void inputCamera(double latitude, double longtitude, double distance) {

        latitude = Math.toRadians(latitude);
        longtitude = Math.toRadians(longtitude);
        camX = distance * Math.cos(longtitude) * Math.sin(latitude);
        camY = distance * Math.cos(longtitude) * Math.cos(latitude);
        camZ = distance * Math.sin(longtitude);
    }


    private double[] getCoordinates(double x, double y, double z) {


        double multiple = camX * camX + camY * camY + camZ * camZ;
        double ratio = multiple / (multiple - camX * x - camY * y - camZ * z);
        double rX = ratio * (x - camX) + camX;
        double rY = ratio * (y - camY) + camY;
        double rZ = ratio * (z - camZ) + camZ;
        double c = (rZ * rZ * camZ * camZ) / (camX * camX + camY * camY);
        double sign = -1;
        if (camX != 0) {
            sign = Math.signum(camX);
            if (rY < camY * rX / camX) sign *= -1;
        } else sign *= -1 * Math.signum(camY * rX);
        double resultX = sign * Math.sqrt(rX * rX + rY * rY - c);
        double resultY = Math.signum(rZ) * Math.sqrt(rZ * rZ + c);

//        System.out.printf("%n     %s     %s     %s     %s", x, rX, sign, resultX);
        return (new double[]{resultX, resultY});
    }


    private double[][][] triangles3d = new double[10000][1][];
    private double[][][] triangles2d = new double[10000][2][];
    private double[][][] triangleNull = new double[10000][2][];
    private int indexOfTriangles = 0;


    void addTriangle(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double[] color) {
        double[][] thisList = new double[][]{{x1, y1, z1, x2, y2, z2, x3, y3, z3}, color};
        triangles3d[indexOfTriangles] = thisList;
        indexOfTriangles += 1;


        System.out.print(indexOfTriangles);
    }


    void toScreen() {
        triangles2d = triangleNull;
        for (int i = 0; i < indexOfTriangles; i++) {
            double x1 = triangles3d[i][0][0];
            double y1 = triangles3d[i][0][1];
            double z1 = triangles3d[i][0][2];
            double x2 = triangles3d[i][0][3];
            double y2 = triangles3d[i][0][4];
            double z2 = triangles3d[i][0][5];
            double x3 = triangles3d[i][0][6];
            double y3 = triangles3d[i][0][7];
            double z3 = triangles3d[i][0][8];
            double[] color = triangles3d[0][1];

            double[] rFirst;
            rFirst = getCoordinates(x1, y1, z1);
            double[] rSecond;
            rSecond = getCoordinates(x2, y2, z2);
            double[] rThird;
            rThird = getCoordinates(x3, y3, z3);
            double rX1 = (int) rFirst[0];
            double rY1 = (int) rFirst[1];
            double rX2 = (int) rSecond[0];
            double rY2 = (int) rSecond[1];
            double rX3 = (int) rThird[0];
            double rY3 = (int) rThird[1];
            double[][] result = {{rX1, rX2, rX3}, {rY1, rY2, rY3}, color};
            triangles2d[i] = result;
        }
    }


//    void run() {
//
//
//
//    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int width = getWidth() / 2;
        int height = getHeight() / 2;

        for (int i = 0; i < indexOfTriangles; i++) {
            int x1 = (int) triangles2d[i][0][0];
            int x2 = (int) triangles2d[i][0][1];
            int x3 = (int) triangles2d[i][0][2];
            int y1 = (int) triangles2d[i][1][0];
            int y2 = (int) triangles2d[i][1][1];
            int y3 = (int) triangles2d[i][1][2];
            int red = (int) triangles2d[i][2][0];
            int green = (int) triangles2d[i][2][1];
            int blue = (int) triangles2d[i][2][2];


            int[] xValues = {x1 + width, x2 + width, x3 + width};
            int[] yValues = {-y1 + height, -y2 + height, -y3 + height};

            g.setColor(new Color(red, green, blue));
            Polygon triangle = new Polygon(xValues, yValues, 3);
            g.fillPolygon(triangle);
            System.out.printf( "%n%n%s     %s     %s     %s     %s     %s     %s     %s     %s     " , x1 ,x2 ,x3 ,y1 ,y2 ,y3 ,red ,green , blue);


        }
    }
}
