package Y1;

public enum c {
    JSON(".json"),
    ZIP(".zip");

    public final String d;

    c(String str) {
        this.d = str;
    }

    public String c() {
        return ".temp" + this.d;
    }

    @Override
    public String toString() {
        return this.d;
    }
}
