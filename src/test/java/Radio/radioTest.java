package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    void setCurrentChannel1() {
        radio rad = new radio();
        rad.setCurrentChannel1(9);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        radio rad = new radio();
        rad.setCurrentChannel2(0);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        radio rad = new radio();
        rad.setCurrentVolume1(1);

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        radio rad = new radio();
        rad.setCurrentVolume2(10);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}

