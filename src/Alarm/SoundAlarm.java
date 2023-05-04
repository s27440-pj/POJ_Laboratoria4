package Alarm;

import Logger.Logger;

public class SoundAlarm implements Alarm {

    public Logger logger;

    // mogłabym zrobić klasę z polem logger i konstruktorem, ale jak mm interfejs, to nie chciałam jeszcze
    // robić klasy do dziedziczenia
    public SoundAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.logMessage();
        System.out.println("Sound alarm is on, much noise");
    }

    @Override
    public void alarmTurnOff() {
        System.out.println("Alarm is off, no more noise");
    }
}
