package G4;

import f6.ck.ZJZXBWla;
import java.util.Map;

final class b extends u {

    private Integer f1385a;

    private Map f1386b;

    b() {
    }

    @Override
    final u a(int i7) {
        this.f1385a = Integer.valueOf(i7);
        return this;
    }

    @Override
    final u b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f1386b = map;
        return this;
    }

    @Override
    final v c() {
        if (this.f1386b != null) {
            return new e(this.f1385a, this.f1386b, null);
        }
        throw new IllegalStateException(ZJZXBWla.xdJhLZfTdEQe);
    }

    @Override
    final Map d() {
        Map map = this.f1386b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
