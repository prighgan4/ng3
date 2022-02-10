package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class volume1Test {

    @Test
    void increaseVolume() {
        volume1 vol = new volume1();
        vol.increaseVolume(1);

        int expected = 2;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
}