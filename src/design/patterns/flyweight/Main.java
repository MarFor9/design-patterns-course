package design.patterns.flyweight;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

// we use that pattern to save the space in our memory
// in the enumapproach folder I use enum instead of using two different classes. UnitTatRepository and UnitStat
// I use only enum UnitStatsEnum because this two class I can replace with enum
public class Main {
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        System.out.println("start loop execution: " + LocalTime.now());
        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslaTank( 0, 0));
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Destroyer(0, 0));
        }
        System.out.println("finished loop execution: " + LocalTime.now());
    }
}
