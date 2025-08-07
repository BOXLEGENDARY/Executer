package androidx.emoji2.text;

import U.Gw.oeVkjmfPcLbWm;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import g0.C2458b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class f {

    private static final Object f10812n = new Object();

    private static final Object f10813o = new Object();

    private static volatile f f10814p;

    private final Set<e> f10816b;

    private final b f10819e;

    final g f10820f;

    final boolean f10821g;

    final boolean f10822h;

    final int[] f10823i;

    private final boolean f10824j;

    private final int f10825k;

    private final int f10826l;

    private final d f10827m;

    private final ReadWriteLock f10815a = new ReentrantReadWriteLock();

    private volatile int f10817c = 3;

    private final Handler f10818d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        private volatile androidx.emoji2.text.i f10828b;

        private volatile n f10829c;

        class C0094a extends h {
            C0094a() {
            }

            @Override
            public void a(Throwable th) {
                a.this.f10831a.m(th);
            }

            @Override
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override
        void a() {
            try {
                this.f10831a.f10820f.a(new C0094a());
            } catch (Throwable th) {
                this.f10831a.m(th);
            }
        }

        @Override
        CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z7) {
            return this.f10828b.h(charSequence, i7, i8, i9, z7);
        }

        @Override
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f10829c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f10831a.f10821g);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f10831a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f10829c = nVar;
            n nVar2 = this.f10829c;
            i iVar = new i();
            d dVar = this.f10831a.f10827m;
            f fVar = this.f10831a;
            this.f10828b = new androidx.emoji2.text.i(nVar2, iVar, dVar, fVar.f10822h, fVar.f10823i);
            this.f10831a.n();
        }
    }

    private static class b {

        final f f10831a;

        b(f fVar) {
            this.f10831a = fVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z7) {
            throw null;
        }

        void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        final g f10832a;

        boolean f10833b;

        boolean f10834c;

        int[] f10835d;

        Set<e> f10836e;

        boolean f10837f;

        int f10838g = -16711936;

        int f10839h = 0;

        d f10840i = new androidx.emoji2.text.e();

        protected c(g gVar) {
            x0.g.h(gVar, "metadataLoader cannot be null.");
            this.f10832a = gVar;
        }

        protected final g a() {
            return this.f10832a;
        }

        public c b(int i7) {
            this.f10839h = i7;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i7, int i8, int i9);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class RunnableC0095f implements Runnable {

        private final List<e> f10841d;

        private final Throwable f10842e;

        private final int f10843i;

        RunnableC0095f(e eVar, int i7) {
            this(Arrays.asList((e) x0.g.h(eVar, "initCallback cannot be null")), i7, null);
        }

        @Override
        public void run() {
            int size = this.f10841d.size();
            int i7 = 0;
            if (this.f10843i != 1) {
                while (i7 < size) {
                    this.f10841d.get(i7).a(this.f10842e);
                    i7++;
                }
            } else {
                while (i7 < size) {
                    this.f10841d.get(i7).b();
                    i7++;
                }
            }
        }

        RunnableC0095f(Collection<e> collection, int i7) {
            this(collection, i7, null);
        }

        RunnableC0095f(Collection<e> collection, int i7, Throwable th) {
            x0.g.h(collection, "initCallbacks cannot be null");
            this.f10841d = new ArrayList(collection);
            this.f10843i = i7;
            this.f10842e = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    static class i {
        i() {
        }

        j a(androidx.emoji2.text.h hVar) {
            return new p(hVar);
        }
    }

    private f(c cVar) {
        this.f10821g = cVar.f10833b;
        this.f10822h = cVar.f10834c;
        this.f10823i = cVar.f10835d;
        this.f10824j = cVar.f10837f;
        this.f10825k = cVar.f10838g;
        this.f10820f = cVar.f10832a;
        this.f10826l = cVar.f10839h;
        this.f10827m = cVar.f10840i;
        C2458b c2458b = new C2458b();
        this.f10816b = c2458b;
        Set<e> set = cVar.f10836e;
        if (set != null && !set.isEmpty()) {
            c2458b.addAll(cVar.f10836e);
        }
        this.f10819e = new a(this);
        l();
    }

    public static f b() {
        f fVar;
        synchronized (f10812n) {
            fVar = f10814p;
            x0.g.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        return androidx.emoji2.text.i.c(inputConnection, editable, i7, i8, z7);
    }

    public static boolean f(Editable editable, int i7, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.d(editable, i7, keyEvent);
    }

    public static f g(c cVar) {
        f fVar = f10814p;
        if (fVar == null) {
            synchronized (f10812n) {
                try {
                    fVar = f10814p;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f10814p = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    public static boolean h() {
        return f10814p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f10815a.writeLock().lock();
        try {
            if (this.f10826l == 0) {
                this.f10817c = 0;
            }
            this.f10815a.writeLock().unlock();
            if (d() == 0) {
                this.f10819e.a();
            }
        } catch (Throwable th) {
            this.f10815a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f10825k;
    }

    public int d() {
        this.f10815a.readLock().lock();
        try {
            return this.f10817c;
        } finally {
            this.f10815a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f10824j;
    }

    public void k() {
        x0.g.j(this.f10826l == 1, oeVkjmfPcLbWm.YupdTYQrMd);
        if (j()) {
            return;
        }
        this.f10815a.writeLock().lock();
        try {
            if (this.f10817c == 0) {
                return;
            }
            this.f10817c = 0;
            this.f10815a.writeLock().unlock();
            this.f10819e.a();
        } finally {
            this.f10815a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f10815a.writeLock().lock();
        try {
            this.f10817c = 2;
            arrayList.addAll(this.f10816b);
            this.f10816b.clear();
            this.f10815a.writeLock().unlock();
            this.f10818d.post(new RunnableC0095f(arrayList, this.f10817c, th));
        } catch (Throwable th2) {
            this.f10815a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f10815a.writeLock().lock();
        try {
            this.f10817c = 1;
            arrayList.addAll(this.f10816b);
            this.f10816b.clear();
            this.f10815a.writeLock().unlock();
            this.f10818d.post(new RunnableC0095f(arrayList, this.f10817c));
        } catch (Throwable th) {
            this.f10815a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i7, int i8) {
        return q(charSequence, i7, i8, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i7, int i8, int i9) {
        return r(charSequence, i7, i8, i9, 0);
    }

    public CharSequence r(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        boolean z7;
        x0.g.j(j(), "Not initialized yet");
        x0.g.e(i7, "start cannot be negative");
        x0.g.e(i8, "end cannot be negative");
        x0.g.e(i9, "maxEmojiCount cannot be negative");
        x0.g.b(i7 <= i8, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        x0.g.b(i7 <= charSequence.length(), "start should be < than charSequence length");
        x0.g.b(i8 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        if (i10 != 1) {
            z7 = i10 != 2 ? this.f10821g : false;
        } else {
            z7 = true;
        }
        return this.f10819e.b(charSequence, i7, i8, i9, z7);
    }

    public void s(e eVar) {
        x0.g.h(eVar, "initCallback cannot be null");
        this.f10815a.writeLock().lock();
        try {
            if (this.f10817c == 1 || this.f10817c == 2) {
                this.f10818d.post(new RunnableC0095f(eVar, this.f10817c));
            } else {
                this.f10816b.add(eVar);
            }
            this.f10815a.writeLock().unlock();
        } catch (Throwable th) {
            this.f10815a.writeLock().unlock();
            throw th;
        }
    }

    public void t(e eVar) {
        x0.g.h(eVar, "initCallback cannot be null");
        this.f10815a.writeLock().lock();
        try {
            this.f10816b.remove(eVar);
        } finally {
            this.f10815a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f10819e.c(editorInfo);
    }
}
