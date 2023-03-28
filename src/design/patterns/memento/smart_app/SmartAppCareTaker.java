package design.patterns.memento.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCareTaker {
    private List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento memento) {
        mementos.add(memento);
        System.out.println("Zapisana wersja: " + memento.getVersion() + " znajduje sie pod indekem: " + (mementos.size() - 1));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Wczytano wersje: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
