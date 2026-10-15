package Sensors;

public class MotionSensor extends Sensor {
    public MotionSensor() {
    }

    public MotionSensor(String sensorModel, String id, String location, boolean triggered) {
        super(sensorModel, id, location, triggered);
    }

    @Override
    public void getLabel() {

        System.out.println(" |Sensortyp: " + getSensorModel() + "\n |RörelseSensorID: " + getId() + "  \n |RörelseSensorplats: " + getLocation() + " \n |RörelseSensor utlöst?: " + isTriggered() + "\n_________________________");

    }

    @Override
    public void trigger() {
        super.trigger();

    }

    @Override
    public void reset() {
        super.reset();
    }
}
