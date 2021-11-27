
package haldson9;


public class Datoxsum3 {
     public static double datosxf3(double datosx[]){
                double r =0;                      // sumatoria del datox^2
                for(int i = 0; i < datosx.length; i++) {

                    r +=Math.pow(datosx[i],3);
                }
                return r;
            }
}
