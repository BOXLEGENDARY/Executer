package backtraceio.library.enums;

public enum WifiStatus {
    NOT_PERMITTED("NotPermitted"),
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    WifiStatus(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
