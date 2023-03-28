package design.patterns.fasada.deliverybox;

// Fasada
// zapewnia uproszczony intefrejs dla danego systemu lub podsystemu
// izolacja klienta od wewnetrznych metod i logiki biznesowej
// uzytkownik widzi tylko wybrane funkcjonalnosci,
// nie musi znac ani wiedziec jak dziala wewnetrznie system.
// chowamy pewna czesc kodu przed klientem
// rodzielamy klienta od logiki i podsystemu.

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }


}
