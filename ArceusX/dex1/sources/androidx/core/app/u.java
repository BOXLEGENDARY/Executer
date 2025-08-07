package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class u {

    private final String f10543a;

    private final CharSequence f10544b;

    private final CharSequence[] f10545c;

    private final boolean f10546d;

    private final int f10547e;

    private final Bundle f10548f;

    private final Set<String> f10549g;

    static class a {
        public static RemoteInput a(u uVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(uVar.i()).setLabel(uVar.h()).setChoices(uVar.e()).setAllowFreeFormInput(uVar.c()).addExtras(uVar.g());
            Set<String> setD = uVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, uVar.f());
            }
            return builderAddExtras.build();
        }

        static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z7) {
            return builder.setAllowDataType(str, z7);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i7) {
            return builder.setEditChoicesBeforeSending(i7);
        }
    }

    public static final class d {

        private final String f10550a;

        private CharSequence f10553d;

        private CharSequence[] f10554e;

        private final Set<String> f10551b = new HashSet();

        private final Bundle f10552c = new Bundle();

        private boolean f10555f = true;

        private int f10556g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f10550a = str;
        }

        public u a() {
            return new u(this.f10550a, this.f10553d, this.f10554e, this.f10555f, this.f10556g, this.f10552c, this.f10551b);
        }

        public d b(CharSequence charSequence) {
            this.f10553d = charSequence;
            return this;
        }
    }

    u(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z7, int i7, Bundle bundle, Set<String> set) {
        this.f10543a = str;
        this.f10544b = charSequence;
        this.f10545c = charSequenceArr;
        this.f10546d = z7;
        this.f10547e = i7;
        this.f10548f = bundle;
        this.f10549g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(u uVar) {
        return a.a(uVar);
    }

    static RemoteInput[] b(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[uVarArr.length];
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            remoteInputArr[i7] = a(uVarArr[i7]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f10546d;
    }

    public Set<String> d() {
        return this.f10549g;
    }

    public CharSequence[] e() {
        return this.f10545c;
    }

    public int f() {
        return this.f10547e;
    }

    public Bundle g() {
        return this.f10548f;
    }

    public CharSequence h() {
        return this.f10544b;
    }

    public String i() {
        return this.f10543a;
    }

    public boolean k() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
