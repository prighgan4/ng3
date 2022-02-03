package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class volume1Test {

    @Test
    void shouldCalculateCurrentVolume1() {
            volume2 vol = new volume2();
            vol.increaseVolume(1);

            int expected = 1;
            int actual = vol.getCurrentVolume();
            assertEquals(expected,actual);
    }
}