//class GetCoordinates {
//
//
//    double[] getCoordinates(int ix, int iy, int iz, int iCAMX, int iCAMY, int iCAMZ) {
//        double x = (double) ix;
//        double y = (double) iy;
//        double z = (double) iz;
//        double CAMX = (double) iCAMX;
//        double CAMY = (double) iCAMY;
//        double CAMZ = (double) iCAMZ;
//
//
//        double multiple = CAMX * CAMX + CAMY * CAMY + CAMZ * CAMZ;
//        double ratio = multiple / (multiple - CAMX * x - CAMY * y - CAMZ * z);
//        double rX = ratio * (x - CAMX) + CAMX;
//        double rY = ratio * (y - CAMY) + CAMY;
//        double rZ = ratio * (z - CAMZ) + CAMZ;
//        double c = (rZ * rZ * CAMZ * CAMZ) / (CAMX * CAMX + CAMY * CAMY);
//        double sign = -1;
//        if (CAMX != 0)
//        {
//            sign =  Math.signum(CAMX);
//            if (rY < CAMY*rX/CAMX) sign *= -1;
//        }
//        else
//        {
//            sign *= -1*Math.signum(CAMY*rX);
//        }
//        double resultX = sign*Math.sqrt(rX * rX + rY * rY - c);
//        double resultY = Math.signum(rZ)*Math.sqrt(rZ * rZ + c);
//
//        System.out.printf("%n     %s     %s     %s     %s" , x , rX , sign , resultX);
//        return (new double[]{resultX , resultY});
//    }
//}
