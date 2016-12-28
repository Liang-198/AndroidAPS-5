package info.nightscout.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoundTest {

    @Test
    public void roundTo() {
        assertEquals( 0.55d, Round.roundTo(0.54d, 0.05d), 0.00000001d );
        assertEquals( 1d, Round.roundTo(1.49d, 1d), 0.00000001d );
    }

    @Test
    public void floorTo() {
        assertEquals( 0.5d, Round.floorTo(0.54d, 0.05d), 0.00000001d );
        assertEquals( 1d, Round.floorTo(1.59d, 1d), 0.00000001d );
    }

    @Test
    public void ceilTo() {
        assertEquals( 0.6d, Round.ceilTo(0.54d, 0.1d), 0.00000001d );
        assertEquals( 2d, Round.ceilTo(1.49999d, 1d), 0.00000001d );
    }

}