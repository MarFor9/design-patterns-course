package design.patterns.command.task;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    final List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;

    public void playFirstTack() {
        System.out.println("Gram pierwszy utrow: " + tracks.get(0));
        currentTrackNumber = 1;
    }

    public void playNextTrack() {
        System.out.println("Gram nastepny utwor: " + tracks.get(currentTrackNumber));
        if (tracks.size() -1 > currentTrackNumber) {
            currentTrackNumber++;
        } else {
            currentTrackNumber = 0;
        }
    }

    public void playRandomTrack() {
        Random random = new Random();
        System.out.println("Gran losowy utwor: " + tracks.get(random.nextInt(tracks.size())));
    }

}
