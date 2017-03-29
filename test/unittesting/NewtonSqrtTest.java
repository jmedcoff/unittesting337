package unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class NewtonSqrtTest {

    @Test(expected=Exception.class)
    public void testNewtonsqrt() throws Exception {
        System.out.println("newtonsqrt");
        double[] a = {4.0, 9.0, 16.0, 25.0, 36.0};
        double e = 0.01;
        double[] expected = {2.0, 3.0, 4.0, 5.0, 6.0};
        double actual;
        for (int i = 0; i < 5; i++) {
            actual = NewtonSqrt.newtonsqrt(a[i], e);
            assertEquals(expected[i], actual, e);
        }
        
        double err = NewtonSqrt.newtonsqrt(-16.0, e);
        err = NewtonSqrt.newtonsqrt(16.0, -0.1);
        err = NewtonSqrt.newtonsqrt(16.0, 0.0);
        
    }
    
}
