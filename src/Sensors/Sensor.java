package Sensors;


public abstract class Sensor {
    private String sensorModel;
    private String id;
    private String Location;
    private boolean triggered;

    public Sensor() {
    }

    public Sensor(String id, String location) {
        this.id = id;
        this.Location = location;

    }

    public Sensor(String sensorModel, String id, String location, boolean triggered) {
        this.sensorModel = sensorModel;
        this.id = id;
        this.Location = location;
        this.triggered = triggered;
    }

    //GETTERS OCH SETTERS

    public String getSensorModel() {
        return sensorModel;
    }

    public String getId() {
        return id;
    }


    public String getLocation() {
        return Location;
    }


    public boolean isTriggered() {
        return triggered;
    }


    public void trigger() {
        triggered = true;


    }

    public void reset() {
        triggered = false;


    }

    public void getLabel() {

        System.out.println(" |Sensortyp: " + sensorModel + "\n |SensorID: \" " + getId() + "  \n |Sensorplats: " + getLocation() + " \n |Sensor utlöst?: " + isTriggered() + "\n_________________________");

    }
}
