package Radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class volume1Test {

    @Test
    @Disabled
    void shouldCalculateCurrentVolume1() {
            volume2 vol = new volume2();
            vol.increaseVolume(1);

            int expected = 1;
            int actual = vol.getCurrentVolume();
            assertEquals(expected,actual);
    }
    @Test
    void shouldSafeCurrentVolume1() {
        volume2 vol = new volume2();
        vol.safeVolume(1);

        int expected = 1;
        int actual = vol.getCurrentVolume();
        assertEquals(expected,actual);
    }
}