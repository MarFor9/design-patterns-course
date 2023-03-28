package design.patterns.visitor.activity;

// Visitor - uzywamy gdy chcemy oddzielic strukture obiektu od operacji ktore beda na nim wykonywane
// wzorzec behavioralny

import design.patterns.visitor.activity.visitor.Activity;
import design.patterns.visitor.activity.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Squash squash = new Squash(50);
        Treadmill treadmill = new Treadmill(500);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();
        squash.accept(visitor);
        treadmill.accept(visitor);
        weights.accept(visitor);

        System.out.println("=========================================");
        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
