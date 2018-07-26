import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void test2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2", result);
    }
    @Test
    public void test3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3", result);
    }
    @Test
    public void test5() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(5);
        assertEquals("5", result);
    }
   
    
    
}
