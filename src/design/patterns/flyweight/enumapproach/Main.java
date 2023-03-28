package design.patterns.flyweight.enumapproach;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

// we use that pattern to save the space in our memory
// enum approach I think is better than two classes with UnitStat and UnitStatRepository
public class Main {
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        System.out.println("start loop execution: " + LocalTime.now());
        for (int i = 0; i < 100000; i++) {
            activeUnits.add(new TeslaTank( 0, 0));
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Destroyer(0, 0));
        }
        TeslaTank teslaTank = new TeslaTank(0, 0);
        System.out.println("finished loop execution: " + LocalTime.now());
        System.out.println(teslaTank);
    }
}
