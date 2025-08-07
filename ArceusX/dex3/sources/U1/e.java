package U1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e {
    public static final e c = new e("COMPOSITION");
    private final List<String> a;
    private f b;

    public e(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        return this.a.get(r0.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.a.add(str);
        return eVar;
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.a.size() - 1) {
            return false;
        }
        return this.a.get(i2).equals(str);
    }

    public f d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (this.a.get(i).equals("**")) {
            return (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*");
    }

    public boolean h(String str, int i) {
        return "__container".equals(str) || i < this.a.size() - 1 || this.a.get(i).equals("**");
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    private e(e eVar) {
        this.a = new ArrayList(eVar.a);
        this.b = eVar.b;
    }
}
