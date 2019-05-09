class Camera
{
    private double latitude , longtitude , dis;
    void init(double latitude , double longtitude , double dis)
    {

        this.latitude = latitude;
        this.longtitude = longtitude;
        this.dis = dis;

    }


    int[] getCoordinates()
    {
        double doubleX , doubleY , doubleZ ;
        latitude = Math.toRadians(latitude);
        longtitude = Math.toRadians(longtitude);
        doubleX = dis*Math.cos(longtitude)*Math.sin(latitude);
        doubleY = dis*Math.cos(longtitude)*Math.cos(latitude);
        doubleZ = dis*Math.sin(longtitude);
        int x = (int) doubleX;
        int y = (int) doubleY;
        int z = (int) doubleZ;
        int[] result = {x , y , z};
        System.out.printf("%s   %s   %S" , x , y , z);


        return result;
    }

}
