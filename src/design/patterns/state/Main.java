package design.patterns.state;

// thanks for that pattern we can depend on the state of the object in which it is located
// dzieki temu wzorcowi mozemy uzaleznic zachowanie obieku od stanu w jakim sie znajduje

// poprawia czytelnosc kodu
// daje mozliwosc testowania jednostkowego kazdego stanu
// warto trzymac contex i stan w specjalnie stworzonej paczce
// warto zrobić ze stanów singletony badź pulle obiektow by uniknac tworzenia nowej instancji stanu za kazdym razem gdy ten sie zmieni

// wzorzec state jest czesto porownywany ze wzorcem strategy. Oba zmieniaja dynamicznie stan obiektu
// Jednak w state z gory okreslamy jakie zachowanie ma wystapic
// tak w strategy implementacja jest wstrzykiwana z zewnatrz i nigdy nie wiemy co moze sie wydarzyc

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();


    }
}
