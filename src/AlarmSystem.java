import Sensors.Sensor;
import Sensors.DoorSensor;
import Sensors.MotionSensor;
import Sensors.SmokeSensor;

import java.util.ArrayList;

public class AlarmSystem {
    boolean armed = false;
    boolean alarming = false;

    SmokeSensor S1 = new SmokeSensor("Röksensor ", "S1", "Storage ", false);
    MotionSensor M1 = new MotionSensor("Rörelsesensor ", "M1", "Hall ", false);
    MotionSensor M2 = new MotionSensor("Rörelsesensor ", "M2", "Office ", false);
    DoorSensor D1 = new DoorSensor("Dörrsensor ", "D1", "Hall ", false);
    DoorSensor D2 = new DoorSensor("Dörrsensor ", "D2", "Garage ", false);

    ArrayList<Sensor> sensors = new ArrayList<>();

    public void addAllSensors() {
        sensors.add(S1);
        sensors.add(M1);
        sensors.add(M2);
        sensors.add(D1);
        sensors.add(D2);
    }

    public void printStatus() {
        System.out.println("Larmsystem aktiverat: " + armed);
        System.out.println("Larmar: " + alarming);
        System.out.println("Utlösta sensorer: " + countTriggered());
        if (S1.isTriggered()) {
            System.out.println("Brandlarmet TJUTER!");

        }
    }

    public void showAllSensors() {
        for (int i = 0; i < sensors.size(); i++) {
            Sensor s = sensors.get(i);
            System.out.println(s.getSensorModel() + s.getId() + "\n |Sensor NR: " + i + "\n |Sensor aktiverad?: " + armed);
            s.getLabel();
        }
    }

    public void resetAll() {
        for (Sensor s : sensors) {
            s.reset();
            alarming = false;
        }
    }

    public void arm() {
        armed = true;

    }

    public void disarm() {
        armed = false;

    }

    public int countTriggered() {
        int count = 0;
        for (Sensor s : sensors) {
            if (s.isTriggered()) {
                count++;
            }
        }
        return count;
    }

    public void triggerById(String id) {
        for (Sensor s : sensors) {
            if (s.getId().equals(id)) {
                if (s instanceof SmokeSensor) {
                    s.trigger();
                    alarming = true;
                } else if (armed) {
                    s.trigger();
                    alarming = true;
                }

                return;
            }
        }


    }
}