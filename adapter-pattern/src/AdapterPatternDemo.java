public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
      audioPlayer.play("mp3", "example.mp3");
      audioPlayer.play("mp4", "example.mp4");
      audioPlayer.play("vlc", "example.vlc");
      audioPlayer.play("avi", "example.avi");
   }
}