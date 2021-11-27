
package haldson9;


public class Datoxsum2 {
    public static double datosxf(double datosx[]){
                double r =0;                      // sumatoria del datox^2
                for(int i = 0; i < datosx.length; i++) {

                    r +=Math.pow(datosx[i],2);
                }
                return r;
            }
}
