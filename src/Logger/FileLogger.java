package Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    public Severity logLevel;

    public FileLogger(Severity loglevel) {
        this.logLevel = loglevel;
    }

    @Override
    public void logMessage() {
        String text = ("Somebody entered wrong pin number. Alarm is now turned on." +
                "Severity is " + this.logLevel);
        try {
            File logout = new File("logout.txt");
            FileWriter writer = new FileWriter(logout);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            //ignore
        }
    }
}