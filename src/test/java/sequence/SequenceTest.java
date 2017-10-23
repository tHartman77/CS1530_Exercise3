import org.junit.Test;
import static org.junit.Assert.*;

import sequence.Sequence;

public class SequenceTest {

    @Test
    public void testTriangle0(){
        assertEquals(Sequence.triangle(0),0);
    }

    @Test
    public void testTriangle1(){
        assertEquals(Sequence.triangle(1),1);
    }

    @Test
    public void testTriangle10(){
        assertEquals(Sequence.triangle(10),49);
    }

    @Test
    public void testLazyCaterer0(){
        assertEquals(Sequence.lazyCaterer(0),1);
    }

    @Test
    public void testLazyCaterer1(){
        assertEquals(Sequence.lazyCaterer(1),2);
    }

    @Test
    public void testLazyCaterer10(){
        assertEquals(Sequence.lazyCaterer(10),56);
    }
}
