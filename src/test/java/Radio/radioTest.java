package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    void increaseVolume(){
        radio rad = new radio();
        rad.increaseVolume(1);

        int expected = 2;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
}


