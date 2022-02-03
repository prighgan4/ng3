package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class volumeTest {

    @Test
    void shouldCalculateCurrentVolume() {
        volume vol = new volume();
        vol.increaseVolume(6);

        int expected = 6;
        int actual = vol.getCurrentVolume();
        assertEquals(expected,actual);
    }
}