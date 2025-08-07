package W3;

import android.os.Bundle;

public final class a {

    public static final a f7645c = new a(null, null);

    private final Boolean f7646a;

    private final Boolean f7647b;

    public a(Boolean bool, Boolean bool2) {
        this.f7646a = bool;
        this.f7647b = bool2;
    }

    public static a a(Bundle bundle) {
        return bundle == null ? f7645c : new a(o(bundle.getString("ad_storage")), o(bundle.getString("analytics_storage")));
    }

    public static a b(String str) {
        Boolean boolP;
        if (str != null) {
            Boolean boolP2 = str.length() >= 3 ? p(str.charAt(2)) : null;
            boolP = str.length() >= 4 ? p(str.charAt(3)) : null;
            bool = boolP2;
        } else {
            boolP = null;
        }
        return new a(bool, boolP);
    }

    static Boolean g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z7 = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || o(string2) != null) {
            return null;
        }
        return string2;
    }

    public static boolean l(int i7, int i8) {
        return i7 <= i8;
    }

    static final int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean p(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final char q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final a c(a aVar) {
        return new a(g(this.f7646a, aVar.f7646a), g(this.f7647b, aVar.f7647b));
    }

    public final a d(a aVar) {
        Boolean bool = this.f7646a;
        if (bool == null) {
            bool = aVar.f7646a;
        }
        Boolean bool2 = this.f7647b;
        if (bool2 == null) {
            bool2 = aVar.f7647b;
        }
        return new a(bool, bool2);
    }

    public final Boolean e() {
        return this.f7646a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n(this.f7646a) == n(aVar.f7646a) && n(this.f7647b) == n(aVar.f7647b);
    }

    public final Boolean f() {
        return this.f7647b;
    }

    public final int hashCode() {
        return ((n(this.f7646a) + 527) * 31) + n(this.f7647b);
    }

    public final String i() {
        return "G1" + q(this.f7646a) + q(this.f7647b);
    }

    public final boolean j() {
        Boolean bool = this.f7646a;
        return bool == null || bool.booleanValue();
    }

    public final boolean k() {
        Boolean bool = this.f7647b;
        return bool == null || bool.booleanValue();
    }

    public final boolean m(a aVar) {
        Boolean bool = this.f7646a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || aVar.f7646a == bool2) {
            return this.f7647b == bool2 && aVar.f7647b != bool2;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f7646a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f7647b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool2.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
