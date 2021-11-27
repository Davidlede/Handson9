
package haldson9;

public class Datomul {
    public static double datosmultiplicacion(double datosx[], double datosy[]){
                double r =0;                       
                for(int i = 0; i < datosy.length; i++) {
                    r +=(datosx[i] * datosy[i]);
                }
                return r;
            }
}
