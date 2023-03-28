package design.patterns.visitor.activity;

import design.patterns.visitor.activity.visitor.Activity;
import design.patterns.visitor.activity.visitor.Visitor;

public class Squash implements Activity {
    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
