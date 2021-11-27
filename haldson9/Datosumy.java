
package haldson9;



public class Datosumy {
    public static double datosyi(double datosy[]){
                double r =0;                         //sumatoria y
                for(int i = 0; i < datosy.length; i++) {

                    r +=datosy[i];
                }
                return r;
            }
}