package backtraceio.library.enums;

public enum BluetoothStatus {
    NOT_PERMITTED("NotPermitted"),
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    BluetoothStatus(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
