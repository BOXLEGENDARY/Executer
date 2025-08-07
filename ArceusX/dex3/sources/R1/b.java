package R1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public class b {
    private final List<s> a = new ArrayList();

    void a(s sVar) {
        this.a.add(sVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            b2.h.b(path, this.a.get(size));
        }
    }
}
