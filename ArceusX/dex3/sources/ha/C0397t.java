package ha;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.personasdk.R;
import e.c;
import ha.c0;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"LL8/t;", "Lf8/o;", "LL8/t$a;", "Le/c;", "", "", "openDocumentLauncher", "Landroid/content/Context;", "context", "<init>", "(Le/c;Landroid/content/Context;)V", "", "d", "()V", "Landroid/net/Uri;", "file", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "Landroid/content/Context;", "a", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0397t implements o<a> {

    @NotNull
    private final c<String[]> openDocumentLauncher;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LL8/t$a;", "", "<init>", "()V", "a", "b", "LL8/t$a$a;", "LL8/t$a$b;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL8/t$a$a;", "LL8/t$a;", "<init>", "()V", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0030a extends a {

            @NotNull
            public static final C0030a a = new C0030a();

            private C0030a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LL8/t$a$b;", "LL8/t$a;", "", "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends a {

            @NotNull
            private final String absoluteFilePath;

            private final String fileName;

            public b(@NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
                this.absoluteFilePath = str;
                this.fileName = str2;
            }

            @NotNull
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }

            public final String getFileName() {
                return this.fileName;
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements g<a> {
        final g d;
        final C0397t e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a<T> implements h {
            final h d;
            final C0397t e;

            @f(c = "com.withpersona.sdk2.inquiry.launchers.DocumentSelectWorker$run$$inlined$map$1$2", f = "DocumentSelectWorker.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class C0031a extends d {
                Object d;
                int e;

                public C0031a(Continuation continuation) {
                    super(continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(h hVar, C0397t c0397t) {
                this.d = hVar;
                this.e = c0397t;
            }

            public final java.lang.Object c(java.lang.Object r11, kotlin.coroutines.Continuation r12) throws java.io.FileNotFoundException {
                throw new UnsupportedOperationException("Method not decompiled: ha.C0397t.b.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(g gVar, C0397t c0397t) {
            this.d = gVar;
            this.e = c0397t;
        }

        public Object a(h hVar, Continuation continuation) {
            Object objA = this.d.a(new a(hVar, this.e), continuation);
            return objA == S9.b.c() ? objA : Unit.a;
        }
    }

    public C0397t(@NotNull c<String[]> cVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(cVar, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.openDocumentLauncher = cVar;
        this.context = context;
    }

    @Override
    public boolean a(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    public final String c(@NotNull Uri file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Cursor cursorQuery = this.context.getContentResolver().query(file, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        String string = cursorQuery != null ? cursorQuery.getString(Math.max(cursorQuery.getColumnIndex("_display_name"), 0)) : null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public final void d() {
        this.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
    }

    @Override
    @NotNull
    public g<a> run() {
        return i.x(new b(new C0396s(), this), c0.b());
    }
}
