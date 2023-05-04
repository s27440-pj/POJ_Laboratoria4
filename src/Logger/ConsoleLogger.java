package Logger;

public class ConsoleLogger implements Logger {
    public Severity logLevel;
    public String announcement;

    public ConsoleLogger(Severity loglevel) {
        this.logLevel = loglevel;
    }

    @Override
    public void logMessage() {
        System.out.println("Somebody entered wrong pin number. Alarm is now turned on. " +
                "Severity is " + this.logLevel);
    }
}
