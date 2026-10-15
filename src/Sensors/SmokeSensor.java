package Sensors;

public class SmokeSensor extends Sensor {

    public SmokeSensor() {
    }

    public SmokeSensor(String id, String location) {
        super(id, location);
    }

    public SmokeSensor(String sensorModel, String id, String location, boolean triggered) {
        super(sensorModel, id, location, triggered);
    }

    @Override
    public void trigger() {
        super.trigger();
    }

    @Override
    public void getLabel() {
        System.out.println(" |Sensortyp: " + getSensorModel() + "\n |RökSensorID: " + getId() + "\n |RökSensorplats: " + getLocation() + " \n |RökSensor utlöst?: " + isTriggered() + "\n_________________________");

    }

    @Override
    public void reset() {
        super.reset();
    }
}
