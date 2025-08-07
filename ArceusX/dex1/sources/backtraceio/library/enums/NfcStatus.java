package backtraceio.library.enums;

public enum NfcStatus {
    NOT_AVAILABLE("NotAvailable"),
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    NfcStatus(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
