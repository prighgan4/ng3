package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class channelTest {

    @Test
    void shouldCalculateCurrentChannel() {
        channel chan = new channel();
        chan.setCurrentChannel(9);

        int expected = 9;
        int actual = chan.getCurrentChannel();

        assertEquals(expected,actual);
    }
}