package Radio;

public class radio {
    public int currentChannel;

    public void setCurrentChannel(int newChannel){
      int next = 9;
      int prev = 0;
      if (newChannel > next) {
          newChannel = prev;
      }
      if (newChannel > prev) {
          newChannel = newChannel + 1;
      }
        if (newChannel == prev) {
            newChannel = newChannel + 1;
        }
      currentChannel = newChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int currentVolume;

    public void increaseVolume(int volume){
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














