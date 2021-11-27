
package haldson9;

public class Beltas {
      public double ds(int n,double sux,double sux2, double sux3,double sux4,double suy1,double suxy,double sux2y){
          double Ds =0;
          Ds = ((n*sux2*sux4)+(sux*sux3*sux2)+(sux2*sux*sux3)-(sux*sux*sux4)-(n*sux3*sux3)-(sux2*sux2*sux2));
          return Ds;
      }
      public double b0(int n,double sux,double sux2, double sux3,double sux4,double suy1,double suxy,double sux2y){
         
     double Db0 = 0;
             Db0 = ((suy1*sux2*sux4)+(sux*sux3*sux2y)+(suxy*sux3*sux2)-(sux2*sux2*sux2y)-(sux3*sux3*suy1)-(suxy*sux*sux4));
             return Db0;
      }
      public double b1(int n,double sux,double sux2, double sux3,double sux4,double suy1,double suxy,double sux2y){
          double db1 =0;
     
          db1 = ((n*suxy*sux4)+(suy1*sux3*sux2)+(sux*sux2y*sux2)-(sux2*suxy*sux2)-(sux3*sux2y*n)-(sux*suy1*sux4));
          return db1;
      }
      public double b2(int n,double sux,double sux2, double sux3,double sux4,double suy1,double suxy,double sux2y){
          double db2 =0;
     
          db2 = ((n*sux2*sux2y)+(sux*suxy*sux2)+(sux*sux3*suy1)-(suy1*sux2*sux2)-(suxy*sux3*n)-(sux*sux*sux2y));
          return db2;
      }
      
           }

