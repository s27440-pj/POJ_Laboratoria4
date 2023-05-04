package Alarm;

import Logger.Logger;

public class DogAlarm implements Alarm {

    public Logger logger;

    public DogAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.logMessage();
        System.out.println("Dogs released! Run!");
    }

    @Override
    public void alarmTurnOff() {
        System.out.println("Bars are up");
    }

}
