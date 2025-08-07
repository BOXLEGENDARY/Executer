package C4;

import java.io.File;

final class c extends u {

    private final File f827a;

    private final String f828b;

    c(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f827a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f828b = str;
    }

    @Override
    final File a() {
        return this.f827a;
    }

    @Override
    final String b() {
        return this.f828b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f827a.equals(uVar.a()) && this.f828b.equals(uVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f827a.hashCode() ^ 1000003) * 1000003) ^ this.f828b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f827a.toString() + ", splitId=" + this.f828b + "}";
    }
}
