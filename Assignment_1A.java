
/**
 * Write a description of class Assignment_1A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment_1A
{
   public static void main (String args[]){
    
       //Quadratic Formula
       double a=1;
       double b=5;
       double c=6;
       
       double QuaSol1=(-b+Math.sqrt(Math.pow(b,2)-4*c))/2*a;
       double QuaSol2=(-b-Math.sqrt(Math.pow(b,2)-4*c))/2*a;
       
       System.out.println("The solution for 1x^2+5x+6 are "+QuaSol1+" and "+QuaSol2);
       
       //Slope Formula
       double x1=0;
       double x2=2;
       double y1=0;
       double y2=3;
       
       double slope=(y2-y1)/(x2-x1);
       
       System.out.println("A line connecting the points (0,0) and (2,3) has a slope of "+slope);
       
       //Midpont Formula
       double midx=(x1+x2)/2;
       double midy=(y1+y2)/2;
       
       System.out.println("The midpoint between (0,0) and (2,3) is ("+midx+","+midy+")");
       
       //Sum of Arithmetic Series
       double aInitial=1;
       double ComDif=1;
       double k=5;
       double aFinal=aInitial+ComDif*(k-1);
       
       double ariSum=(aInitial+aFinal)*k/2;
       System.out.println("The sum of the first 5 terms of an arithmetic series that starts with 1.0 and increases by a rate of 2.0 is "+ariSum);
       
       //Sum of Geometric Series
       double gInitial=1;
       double ComRa=2;
       double t=3;
       
       double geoSum=gInitial*((1-Math.pow(ComRa,t))/(1-ComRa));
       
       System.out.println("The sum of the first 5 terms of an finite geometric series that starts with 1.0 and increases by a rate of 2.0 is "+geoSum);
    
       
       

    }
}
