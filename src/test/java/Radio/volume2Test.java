package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class volume2Test {

    @Test
    void shouldCalculateCurrentVolume10() {
        volume2 vol = new volume2();
        vol.increaseVolume(10);

        int expected = 10;
        int actual = vol.getCurrentVolume();
        assertEquals(expected,actual);
    }
}