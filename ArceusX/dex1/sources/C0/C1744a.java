package c0;

import java.util.Objects;
import z.T;

public class C1744a {

    private final EnumC0141a f12675a;

    private final T.i f12676b;

    public enum EnumC0141a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public C1744a(EnumC0141a enumC0141a, T.i iVar) {
        this.f12675a = enumC0141a;
        this.f12676b = iVar;
    }

    public EnumC0141a a() {
        return this.f12675a;
    }

    public T.i b() {
        return this.f12676b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1744a)) {
            return false;
        }
        C1744a c1744a = (C1744a) obj;
        return this.f12675a == c1744a.f12675a && Objects.equals(this.f12676b, c1744a.f12676b);
    }

    public int hashCode() {
        return Objects.hash(this.f12675a, this.f12676b);
    }
}
