package design.patterns.visitor.activity;

import design.patterns.visitor.activity.visitor.Activity;
import design.patterns.visitor.activity.visitor.Visitor;

public class Treadmill implements Activity {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
