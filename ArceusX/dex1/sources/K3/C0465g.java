package K3;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class C0465g {
    public static final Appendable a(Appendable appendable, Iterator it, C0467h c0467h, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(C0467h.d(entry.getKey()));
            appendable.append(" : ");
            appendable.append(C0467h.d(entry.getValue()));
            while (it.hasNext()) {
                appendable.append(c0467h.f1872a);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(C0467h.d(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(C0467h.d(entry2.getValue()));
            }
        }
        return appendable;
    }
}
