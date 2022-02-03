package Radio;

public class volume {
        public int currentVolume;

        public void increaseVolume(int newVolume){
            if (newVolume < 10) {
                newVolume = newVolume + 1;
            }
            currentVolume = newVolume;
            if (newVolume > 1) {
                newVolume = newVolume + 1;
                currentVolume = newVolume;
            }
        }
    public int getCurrentVolume() {
        return currentVolume;
    }
}

