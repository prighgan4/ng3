package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class channelTest {

    @Test
    void shouldCalculateCurrentChannel() {
        radio rad = new radio();
        rad.setCurrentChannel(6);

        int expected = 7;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }
}

