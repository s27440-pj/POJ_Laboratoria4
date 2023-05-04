package Alarm;

import Logger.Logger;

public class BarsAlarm implements Alarm {

    public Logger logger;

    public BarsAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.logMessage();
        System.out.println("Bars are down");
    }

    @Override
    public void alarmTurnOff() {
        System.out.println("Bars are up");
    }

}
