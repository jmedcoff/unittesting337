package unittesting;

import static java.lang.Math.abs;

public class NewtonSqrt {
    
    public static double newtonsqrt(double a, double e) throws Exception {
        if (a < 0 || e <= 0) {
            throw new Exception("Incorrect Input");
        }
        double x = 0.5 * a;
        double y = (x*x + a)/(2*x);
        
        while (abs(x - y) > e) {
            x = y;
            y = (x*x + a)/(2*x);
        }
        return y;            
    }
    
    public static void main(String [] args) throws Exception {
        System.out.println(newtonsqrt(16.0, 0.01));
    }
}
