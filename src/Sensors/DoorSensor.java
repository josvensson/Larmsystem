package Sensors;

public class DoorSensor extends Sensor {
    public DoorSensor() {
    }

    public DoorSensor(String sensorModel, String id, String location, boolean triggered) {
        super(sensorModel, id, location, triggered);
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
        System.out.println(" |Sensortyp: " + getSensorModel() + "\n |DörrSensorID: " + getId() + "  \n |DörrSensorplats: " + getLocation() + " \n |DörrSensor utlöst?: " + isTriggered() + "\n_________________________");

    }
}
