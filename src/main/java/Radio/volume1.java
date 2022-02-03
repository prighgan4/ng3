package Radio;

public class volume1 {
    public int currentVolume;

    public void increaseVolume(int newVolume) {
        if (newVolume > 1) {
            newVolume = newVolume + 1;
        }
        currentVolume  = newVolume;
    }
    public void safeVolume(int newVolume){
        if (newVolume == 1) {
            newVolume = 1;
        }
        currentVolume = newVolume;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }
}
