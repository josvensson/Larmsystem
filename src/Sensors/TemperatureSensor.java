package Sensors;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor() {
    }

    public TemperatureSensor(String id, String location) {
        super(id, location);
    }

    public TemperatureSensor(String sensorModel, String id, String location, boolean triggered) {
        super(sensorModel, id, location, triggered);
    }


    @Override
    public boolean isTriggered() {
        return super.isTriggered();
    }

    @Override
    public void trigger() {
        super.trigger();
    }

    @Override
    public void reset() {
        super.reset();
    }

    @Override
    public void getLabel() {
        System.out.println(" |Sensortyp: " + getSensorModel() + "\n |TemperaturSensorID: " + getId() + "\n |TemperaturSensorplats: " + getLocation() + " \n |TemperaturSensor utlöst?: " + isTriggered() + "\n_________________________");
    }
}
