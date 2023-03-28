package design.patterns.command.task;

public class MusicPlayerRemote {
    MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        musicPlayerCommand.play();
    }
}
