package design.patterns.adapter.twoway;

import design.patterns.adapter.PolandDevice;
import design.patterns.adapter.UKDevice;

public class TwoWayAdapter implements UKDevice, PolandDevice {
    private UKDevice ukDevice;
    private PolandDevice polandDevice;

    public TwoWayAdapter(UKDevice ukDevice, PolandDevice polandDevice) {
        this.ukDevice = ukDevice;
        this.polandDevice = polandDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        polandDevice.on();
    }
}
