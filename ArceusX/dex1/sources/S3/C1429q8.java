package S3;

import n3.C2649g;

public final class C1429q8 {

    private final EnumC1407o8 f7100a;

    private final Boolean f7101b = null;

    private final String f7102c = null;

    C1429q8(C1396n8 c1396n8, C1418p8 c1418p8) {
        this.f7100a = c1396n8.f7041a;
    }

    public final EnumC1407o8 a() {
        return this.f7100a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1429q8) && C2649g.b(this.f7100a, ((C1429q8) obj).f7100a) && C2649g.b(null, null) && C2649g.b(null, null);
    }

    public final int hashCode() {
        return C2649g.c(this.f7100a, null, null);
    }
}
