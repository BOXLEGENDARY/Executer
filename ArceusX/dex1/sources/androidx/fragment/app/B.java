package androidx.fragment.app;

import android.view.AbstractC1694h;
import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class B {

    private final l f10901a;

    private final ClassLoader f10902b;

    int f10904d;

    int f10905e;

    int f10906f;

    int f10907g;

    int f10908h;

    boolean f10909i;

    String f10911k;

    int f10912l;

    CharSequence f10913m;

    int f10914n;

    CharSequence f10915o;

    ArrayList<String> f10916p;

    ArrayList<String> f10917q;

    ArrayList<Runnable> f10919s;

    ArrayList<a> f10903c = new ArrayList<>();

    boolean f10910j = true;

    boolean f10918r = false;

    static final class a {

        int f10920a;

        Fragment f10921b;

        boolean f10922c;

        int f10923d;

        int f10924e;

        int f10925f;

        int f10926g;

        AbstractC1694h.b f10927h;

        AbstractC1694h.b f10928i;

        a() {
        }

        a(int i7, Fragment fragment) {
            this.f10920a = i7;
            this.f10921b = fragment;
            this.f10922c = false;
            AbstractC1694h.b bVar = AbstractC1694h.b.RESUMED;
            this.f10927h = bVar;
            this.f10928i = bVar;
        }

        a(int i7, Fragment fragment, boolean z7) {
            this.f10920a = i7;
            this.f10921b = fragment;
            this.f10922c = z7;
            AbstractC1694h.b bVar = AbstractC1694h.b.RESUMED;
            this.f10927h = bVar;
            this.f10928i = bVar;
        }
    }

    B(l lVar, ClassLoader classLoader) {
        this.f10901a = lVar;
        this.f10902b = classLoader;
    }

    public B b(int i7, Fragment fragment, String str) {
        l(i7, fragment, str, 1);
        return this;
    }

    B c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public B d(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f10903c.add(aVar);
        aVar.f10923d = this.f10904d;
        aVar.f10924e = this.f10905e;
        aVar.f10925f = this.f10906f;
        aVar.f10926g = this.f10907g;
    }

    public B f(String str) {
        if (!this.f10910j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f10909i = true;
        this.f10911k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public B k() {
        if (this.f10909i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f10910j = false;
        return this;
    }

    void l(int i7, Fragment fragment, String str, int i8) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            N0.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.mFragmentId;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i7);
            }
            fragment.mFragmentId = i7;
            fragment.mContainerId = i7;
        }
        e(new a(i8, fragment));
    }

    public B m(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public B n(int i7, Fragment fragment) {
        return o(i7, fragment, null);
    }

    public B o(int i7, Fragment fragment, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i7, fragment, str, 2);
        return this;
    }

    public B p(boolean z7) {
        this.f10918r = z7;
        return this;
    }

    public B q(Fragment fragment) {
        e(new a(5, fragment));
        return this;
    }
}
