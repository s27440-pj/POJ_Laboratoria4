package Alarm;

import Logger.Logger;

public class PoliceAlarm implements Alarm {

    public Logger logger;

    public PoliceAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.logMessage();
        System.out.println("Police is coming");
    }

    @Override
    public void alarmTurnOff() {
        System.out.println("Bars are up, police cancelled");
    }

}
