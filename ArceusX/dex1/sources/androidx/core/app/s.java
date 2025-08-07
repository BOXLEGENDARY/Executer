package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

public class s {

    CharSequence f10529a;

    IconCompat f10530b;

    String f10531c;

    String f10532d;

    boolean f10533e;

    boolean f10534f;

    static class a {
        static Person a(s sVar) {
            return new Person.Builder().setName(sVar.c()).setIcon(sVar.a() != null ? sVar.a().n() : null).setUri(sVar.d()).setKey(sVar.b()).setBot(sVar.e()).setImportant(sVar.f()).build();
        }
    }

    public static class b {

        CharSequence f10535a;

        IconCompat f10536b;

        String f10537c;

        String f10538d;

        boolean f10539e;

        boolean f10540f;

        public s a() {
            return new s(this);
        }

        public b b(CharSequence charSequence) {
            this.f10535a = charSequence;
            return this;
        }
    }

    s(b bVar) {
        this.f10529a = bVar.f10535a;
        this.f10530b = bVar.f10536b;
        this.f10531c = bVar.f10537c;
        this.f10532d = bVar.f10538d;
        this.f10533e = bVar.f10539e;
        this.f10534f = bVar.f10540f;
    }

    public IconCompat a() {
        return this.f10530b;
    }

    public String b() {
        return this.f10532d;
    }

    public CharSequence c() {
        return this.f10529a;
    }

    public String d() {
        return this.f10531c;
    }

    public boolean e() {
        return this.f10533e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        String strB = b();
        String strB2 = sVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(sVar.c())) && Objects.equals(d(), sVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(sVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(sVar.f())) : Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f10534f;
    }

    public String g() {
        String str = this.f10531c;
        if (str != null) {
            return str;
        }
        if (this.f10529a == null) {
            return BuildConfig.FLAVOR;
        }
        return "name:" + ((Object) this.f10529a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f10529a);
        IconCompat iconCompat = this.f10530b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f10531c);
        bundle.putString("key", this.f10532d);
        bundle.putBoolean("isBot", this.f10533e);
        bundle.putBoolean("isImportant", this.f10534f);
        return bundle;
    }
}
