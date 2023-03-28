package design.patterns.strategy.chef;

//Strategy
// mozna jej uzywac podczas dzialania aplikacji. Czyli dynamicznie zmieniac strategie
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Adam");

        // Nowe zamowienie - jajka na twardo
        chef.cook(new HardBoiledEggCooker());

        // Nowe zamowienie - jajka na miekko
        chef.cook(new SoftBoiledEggCooker());
    }
}
