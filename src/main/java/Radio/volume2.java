package Radio;

public class volume2 {
        public int currentVolume;

        public void increaseVolume(int newVolume) {
            if (newVolume < 10) {
                newVolume = newVolume + 1;
            }
            currentVolume  = newVolume;
        }
        public void safeVolume(int newVolume){
            if (newVolume == 10) {
                newVolume = 10;
        }
        currentVolume = newVolume;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }
}


