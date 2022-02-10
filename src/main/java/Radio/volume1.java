package Radio;

public class volume1 {
    public int currentVolume;

    public void increaseVolume(int volume) {
        if (volume < 10) {
            volume = volume + 1;
        }
        if (volume == 10) {
            volume = 10;
        }
        currentVolume = volume;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
