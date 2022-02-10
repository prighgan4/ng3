package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class channelTest {

    @Test
    void shouldCalculateCurrentChannel() {
        channel chan = new channel();
        chan.setCurrentChannel(6);

        int expected = 7;
        int actual = chan.getCurrentChannel();

        assertEquals(expected,actual);
    }
}