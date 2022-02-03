package Radio;

public class volume1 {
    public int currentVolume;

    public void increaseVolume(int newVolume) {
        if (newVolume > 1) {
            newVolume = newVolume + 1;
        }
        currentVolume  = newVolume;
    }
    public void safeVolume(int safevolume){
        if (safevolume == 1) {
            safevolume = 1;
        }
        currentVolume = safevolume;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }
}
