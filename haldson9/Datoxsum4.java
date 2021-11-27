
package haldson9;
public class Datoxsum4 {
     public static double datosxf4(double datosx[]){
               double r =0;                      // sumatoria del datox^2
                for(int i = 0; i < datosx.length; i++) {

                    r +=Math.pow(datosx[i],4);
                }
                return r;
            }
}
