package Radio;

public class channel {
    public int currentChannel;

    public void setCurrentChannel(int newChannel){
      int next = 9;
      int prev = 0;
      if (newChannel > next) {
          newChannel = 0;
      }
      if (newChannel < prev) {
          newChannel = 9;
      }
      currentChannel = newChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}













