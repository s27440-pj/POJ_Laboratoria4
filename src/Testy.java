import Alarm.*;
import Logger.*;
import Safe.Safe;

public class Testy {

    public static void main(String[] args) {
        Logger logger_console = new ConsoleLogger(Logger.Severity.low);
        Logger logger_file = new FileLogger(Logger.Severity.high);

        Alarm alarm_sound = new SoundAlarm(logger_console);
        Alarm alarm_dog = new DogAlarm(logger_file);
        Alarm alarm_police = new PoliceAlarm(logger_console);
        Alarm alarm_bars = new BarsAlarm(logger_file);

        Safe safe1 = new Safe("1234");
        safe1.addAlarm(alarm_sound);
        safe1.addAlarm(alarm_bars);

        Safe safe2 = new Safe("2580");
        safe2.addAlarm(alarm_dog);
        safe2.addAlarm(alarm_police);

        safe1.enterPin("1235");
        safe2.enterPin("2598");

    }
}
