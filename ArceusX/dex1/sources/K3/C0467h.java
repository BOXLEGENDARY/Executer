package K3;

import java.io.IOException;
import java.util.Iterator;

public final class C0467h {

    private final String f1872a = ",\n  ";

    private C0467h(String str) {
    }

    public static C0467h a(String str) {
        return new C0467h(",\n  ");
    }

    static final CharSequence d(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final Appendable b(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(d(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f1872a);
                appendable.append(d(it.next()));
            }
        }
        return appendable;
    }
}
