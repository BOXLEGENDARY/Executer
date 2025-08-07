package u0;

import android.os.LocaleList;
import java.util.Locale;

final class k implements j {

    private final LocaleList f23893a;

    k(Object obj) {
        this.f23893a = (LocaleList) obj;
    }

    @Override
    public String a() {
        return this.f23893a.toLanguageTags();
    }

    @Override
    public Object b() {
        return this.f23893a;
    }

    public boolean equals(Object obj) {
        return this.f23893a.equals(((j) obj).b());
    }

    @Override
    public Locale get(int i7) {
        return this.f23893a.get(i7);
    }

    public int hashCode() {
        return this.f23893a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f23893a.isEmpty();
    }

    @Override
    public int size() {
        return this.f23893a.size();
    }

    public String toString() {
        return this.f23893a.toString();
    }
}
