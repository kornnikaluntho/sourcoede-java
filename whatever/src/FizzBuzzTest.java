import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);

    }

    @Test
    public void เลข2งต้องได้ค่าเป็น2() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }

    @Test
    public void เลข3งต้องได้ค่าเป็น3() {
        FizzBuzz3 fz = new FizzBuzz3();
        String result = fz.sendAndReturn(3);
        assertEquals("fizz", result);
    }
    
   

}
