package design.patterns.adapter;

// here we indicate which interface we want to use and which device we want to adapt to our interface
// our class has to have the the field with the device (class) which we want to addapt to new interface

// tutaj wskazuje na interfejs ktorych chce uzyc i urzadzenie ktore chce zaadaptowac/przystosowac do tego interfejsu
// nasza klasa musi miec pole z urządzeniem (klasa), ktora chcemy przystosowac do nowego interfejsu
public class UKToPolandAdapter implements PolandDevice {

    private UKDevice device;

    public UKToPolandAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.powerOn();
    }
}
