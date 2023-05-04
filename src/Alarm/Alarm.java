package Alarm;

public interface Alarm {

    // tutaj tak samo jak w interfejsie Logger, nie dałam pola logger klasy Logger, bo pola w interfejsach są finalne
    // i statycznie, przez co nie mogłabym wywołać alarmu z wybranym logerem, tylko zawsze wykonywałby się jeden
    // stały, przypisany tutaj.
    public void alarmTurnOn(PinEvent pinEvent);

    public void alarmTurnOff();

}
