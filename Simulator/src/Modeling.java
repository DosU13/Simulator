import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
import java.awt.Color;
//import javax.swing.JFrame;

class Modeling extends JPanel {
    private double camX, camY, camZ ,camSquare ,  lightX , lightY , lightZ;

    int bred , bgreen , bblue;

    void background(int bred , int bgreen , int bblue){
        this.bblue = bblue;
        this.bgreen = bgreen;
        this.bred = bred;
    }

    void inputCamera(double latitude, double longtitude, double distance) {

        latitude = Math.toRadians(latitude);
        longtitude = Math.toRadians(longtitude);
        camX = distance * Math.cos(longtitude) * Math.sin(latitude);
        camY = distance * Math.cos(longtitude) * Math.cos(latitude);
        camZ = distance * Math.sin(longtitude);
        camSquare = camX * camX + camY * camY + camZ * camZ;
    }




    void inputLight(double latitude, double longtitude) {

        latitude = Math.toRadians(latitude);
        longtitude = Math.toRadians(longtitude);
        lightX = Math.cos(longtitude) * Math.sin(latitude);
        lightY = Math.cos(longtitude) * Math.cos(latitude);
        lightZ = Math.sin(longtitude);
    }


    private double[] getCoordinates(double x, double y, double z) {
        double ratio = (camSquare - camX * x - camY * y - camZ * z)/camSquare  ;
        double distance = ratio*Math.sqrt(camSquare);
        double rX = (x - camX)/ratio + camX;
        double rY = (y - camY)/ratio + camY;
        double rZ = (z - camZ)/ratio + camZ;
        double c = (rZ * rZ * camZ * camZ) / (camX * camX + camY * camY);
        double sign = -1;
        if (camX != 0) {
            sign = Math.signum(camX);
            if (rY < camY * rX / camX) sign *= -1;
        } else sign *= -1 * Math.signum(camY * rX);
        double resultX = sign * Math.sqrt(rX * rX + rY * rY - c);
        double resultY = Math.signum(rZ) * Math.sqrt(rZ * rZ + c);

        return (new double[]{resultX, resultY , distance});
    }


    private double[][][] triangles3d = new double[10000][1][];
    private int[][][] triangles2d = new int[10000][3][];
    private int[][][] triangleNull = new int[10000][3][];
    private int indexOfTriangles = 0;


    void addTriangle(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double[] color) {


        double[][] thisList = new double[][]{{x1, y1, z1, x2, y2, z2, x3, y3, z3}, color};
        triangles3d[indexOfTriangles] = thisList;
        indexOfTriangles += 1;


    }


    void draw() {
        triangles2d = triangleNull;
        for (int i = 0; i < indexOfTriangles; ++i) {
            double x1 = triangles3d[i][0][0];
            double y1 = triangles3d[i][0][1];
            double z1 = triangles3d[i][0][2];
            double x2 = triangles3d[i][0][3];
            double y2 = triangles3d[i][0][4];
            double z2 = triangles3d[i][0][5];
            double x3 = triangles3d[i][0][6];
            double y3 = triangles3d[i][0][7];
            double z3 = triangles3d[i][0][8];
            int[] color = new int[triangles3d[i][1].length];
            for (int j = 0 ; j < triangles3d[i][1].length ; j++ ) color[j] = (int) triangles3d[i][1][j];
            int red = color[0];
            int green = color[1];
            int blue = color[2];

            double ax = x2 - x1;
            double bx = x2 - x3;
            double ay = y2 - y1;
            double by = y2 - y3;
            double az = z2 - z1;
            double bz = z2 - z3;
            double normalX = ay*bz - az*by;
            double normalY = az*bx - ax*bz;
            double normalZ = ax*by - ay*bx;
            double cos = (camX*normalX + camY*normalY + camZ*normalZ);
            if (cos < 0){
                normalX *= -1;
                normalY *= -1;
                normalZ *= -1;}
            double normLight = (normalX*lightX + normalY*lightY + normalZ*lightZ)/Math.sqrt((normalX*normalX + normalY*normalY + normalZ*normalZ)*(lightX*lightX + lightY*lightY + lightZ*lightZ));
            double halfX = lightX + camX/camSquare;
            double halfY = lightY + camY/camSquare;
            double halfZ = lightZ + camZ/camSquare;
            double specular = (halfX*normalX + halfY*normalY + halfZ*normalZ)/Math.sqrt((halfX*halfX + halfY*halfY + halfZ*halfZ)*(normalX*normalX + normalY*normalY + normalZ*normalZ));
            double scalar = (1 + Math.max(normLight , 0) + Math.pow(specular,5))/3;
            double finalRed =  red*scalar;
            double finalGreen = green*scalar;
            double finalBlue = blue*scalar;
            int[] finalColor = new int[3];
            finalColor[0] = (int) finalRed;
            finalColor[1] = (int) finalGreen;
            finalColor[2] = (int) finalBlue;

            double[] rFirst;
            rFirst = getCoordinates(x1, y1, z1);
            double[] rSecond;
            rSecond = getCoordinates(x2, y2, z2);
            double[] rThird;
            rThird = getCoordinates(x3, y3, z3);
            int rX1 = (int) rFirst[0];
            int rY1 = (int) rFirst[1];
            int distance1 = (int) rFirst[2];
            int rX2 = (int) rSecond[0];
            int rY2 = (int) rSecond[1];
            int distance2 = (int) rSecond[2];
            int rX3 = (int) rThird[0];
            int rY3 = (int) rThird[1];
            int distance3 = (int) rThird[2];
            int distance = distance1 + distance2 + distance3;
            int[][] result = {{rX1, rX2, rX3}, {rY1, rY2, rY3}, finalColor, {distance}};



            int k = 0;
            for (int kVary = 0 ; kVary < i ; kVary++ ){
                int distanceVary = triangles2d[kVary][3][0];
                if (distance < distanceVary) k = kVary+1; }
            for ( int l = i  ; l > k ; l-- ) triangles2d[l] = triangles2d[l-1];
            triangles2d[k] = result;
        }
    }


    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] xValue = {0 , 2*width , 2*width , 0};
        int[] yValue = {0 , 0 , 2*height , 2*height};
        g.setColor(new Color(bred , bgreen , bblue));
        Polygon b = new Polygon(xValue, yValue, 4);
        g.fillPolygon(b);

        for (int i = 0; i < indexOfTriangles; i++) {
            int x1 =  triangles2d[i][0][0];
            int x2 =  triangles2d[i][0][1];
            int x3 =  triangles2d[i][0][2];
            int y1 =  triangles2d[i][1][0];
            int y2 =  triangles2d[i][1][1];
            int y3 =  triangles2d[i][1][2];
            int red =  triangles2d[i][2][0];
            int green =  triangles2d[i][2][1];
            int blue =  triangles2d[i][2][2];


            int[] xValues = {x1 + width, x2 + width, x3 + width};
            int[] yValues = {-y1 + height, -y2 + height, -y3 + height};

            g.setColor(new Color(red, green, blue));
            Polygon triangle = new Polygon(xValues, yValues, 3);
            g.fillPolygon(triangle);


        }
    }



}
