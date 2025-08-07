package U1;

public class h {
    private final String a;
    public final float b;
    public final float c;

    public h(String str, float f, float f2) {
        this.a = str;
        this.c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith("\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
