package backtraceio.library.enums;

public enum GpsStatus {
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    GpsStatus(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
