package Safe;

import Alarm.Alarm;
import Alarm.PinEvent;

import java.util.ArrayList;
import java.util.List;

public class Safe {
    private String pin;
    List<Alarm> alarms = new ArrayList<>();

    public Safe(String pin) {
        this.pin = pin;
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String pin) {
        if (pin == this.pin) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    public void wrongPin() {
        PinEvent pinEvent = new PinEvent(this);
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(pinEvent);
        }

    }

    public void correctPin() {
        System.out.println("Pin correct - safe is open");
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public List<Alarm> getAlarms() {
        return alarms;
    }
}
