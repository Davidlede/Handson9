
package haldson9;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;
public class Haldson9 extends Agent{

  @Override
    public void setup()
    {
        System.out.println("Agent's action method executed"+"\n");
        addBehaviour(new MyOneShotBehaviour());
        }
    private class MyOneShotBehaviour extends OneShotBehaviour{
         @Override
         public void action(){
         double x []= {-3,-2,-1,0,1,2,3};
         double y []= {7.5,3,0.5,1,3,6,14};
        
        /*  double x []= {50, 50, 50, 70, 70, 70, 80,80,80,90,90,90,100,100,100};
            double y []={3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5,2.9,2.4,3.0,3.1,2.8,3.3,3.5,3.0};
         
            double x []= {0,20,40,60,80,100};
            double y []={0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};
         */
            int n = x.length;
            int xi,yi,yf,xf,i;
            Datoxsu datoxsu =new Datoxsu();
            Datoxsum2 datoxsum2 =new Datoxsum2();
            Datoxsum3 datoxsum3 =new Datoxsum3();
            Datoxsum4 datoxsum4 =new Datoxsum4();
            Datosumy datoxsumy =new Datosumy();
            Datomul datoxsuml =new Datomul ();
            Datomul2 datoxsuml2 =new Datomul2 ();
            Beltas beltas =new Beltas ();
            Scanner entrada = new Scanner(System.in);
           
            

            double suxy=datoxsuml.datosmultiplicacion(x, y);
            double sux2y=datoxsuml2.datosmultiplicacion2(x, y);
            double sux=datoxsu.datosxi(x);
            double sux2=datoxsum2.datosxf(x);
            double sux3=datoxsum3.datosxf3(x);
            double sux4=datoxsum4.datosxf4(x);
            double suy1=datoxsumy.datosyi(y);
            double ds= beltas.ds(n,sux, sux2,  sux3, sux4, suy1, suxy, sux2y);
            double b0= beltas.b0(n,sux, sux2,  sux3, sux4, suy1, suxy, sux2y);
            double b1= beltas.b1(n,sux, sux2,  sux3, sux4, suy1, suxy, sux2y);
            double b2= beltas.b2(n,sux, sux2,  sux3, sux4, suy1, suxy, sux2y);
            
            double B0 = b0 / ds;
            double B1 = b1 / ds;
            double B2 = b2 / ds;
            
            System.out.print("suma x * y   "+suxy+"\n");
            System.out.print("suma x^2 * y: "+sux2y+"\n");
            System.out.print("suma x: "+sux+"\n");
            System.out.print("suma x^2 : "+sux2+"\n");
            System.out.print("suma x^3 : "+sux3+"\n");
            System.out.print("suma x^4 : "+sux4+"\n");
            System.out.print("suma y: "+suy1+"\n");
            System.out.print("b0 sumatoria el valor es: "+b2+"\n");
            System.out.print("b1 sumatoria el valor es:  "+b1+"\n");
            System.out.print("b2 sumatoria el valor es: "+b0+"\n");
            System.out.print("b0  el valor es: "+B0+"\n");
            System.out.print("b1  el valor es: "+B1+"\n");
            System.out.print("b2  el valor es: "+B2+"\n");
                 addBehaviour(new MyOneShotBehaviour());
         }
        @Override
        public int onEnd(){
           System.out.println("\n Agent'Dead");
           myAgent.doDelete();
           return super.onEnd();
        }
    }
}
