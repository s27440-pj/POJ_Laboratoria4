package Logger;

public interface Logger {

    // nie dałam tu pola logLevel typu Severity, ponieważ w interfejsach można dodać tylko pole, które jest statyczne i
    // finalne, a zgodnie z zadaniem (z tego co zrozumiałam) loger może być wywołany dla różnego poziomu ważności
    // i chodziło o to, aby móc go ustawić w zależności od obiektu, a nie na stałe.
    public enum Severity {
        high, medium, low
    }

    public void logMessage();
}
