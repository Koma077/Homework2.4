public class ErrorBus extends Exception {
    public ErrorBus() {
    }

    public ErrorBus(String message) {
        super(message);
    }
}
