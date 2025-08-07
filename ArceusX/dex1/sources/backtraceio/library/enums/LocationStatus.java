package backtraceio.library.enums;

import Q6.QtA.QXojhh;

public enum LocationStatus {
    DISABLED(QXojhh.YjuEYnxYsIak),
    ENABLED("Enabled");

    private final String text;

    LocationStatus(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
