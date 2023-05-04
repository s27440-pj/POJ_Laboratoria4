package Alarm;

import Safe.Safe;

import java.util.Date;

public class PinEvent {
    private Safe safe;
    public Date eventDate;

    public PinEvent(Safe safe) {
        Date todayDate = new Date();
        this.safe = safe;
        this.eventDate = todayDate;
    }

    public Safe getSafe() {
        return this.safe;
    }
}
