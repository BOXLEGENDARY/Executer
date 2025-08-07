package backtraceio.library.enums;

public enum ScreenOrientation {
    PORTRAIT("Portrait"),
    LANDSCAPE("Landscape"),
    UNDEFINED("Unknown");

    private final String text;

    ScreenOrientation(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
