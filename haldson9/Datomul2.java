
package haldson9;


public class Datomul2 {
    public static double datosmultiplicacion2(double datosx[], double datosy[]){
                double r =0;                       
                for(int i = 0; i < datosy.length; i++) {
                    r +=Math.pow(datosx[i],2 )* datosy[i];
                }
                return r;
            }
}
