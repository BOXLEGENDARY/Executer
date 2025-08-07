package ha;

import P9.p;
import android.content.Context;
import android.net.Uri;
import com.roblox.client.personasdk.R;
import e.g;
import f.h;
import ha.c0;
import java.io.FileNotFoundException;
import java.util.List;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0019\u001bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0010\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LL8/v;", "Lf8/o;", "LL8/v$c;", "", "key", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "Lka/h;", "", "Landroid/net/Uri;", "documentSelectResult", "d", "(Lka/h;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function0;", "", "e", "I", "index", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0399v implements o<c> {

    @NotNull
    private final String key;

    @NotNull
    private final Context context;

    @NotNull
    private final Function0<Unit> launchPicker;

    private int index;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LL8/v$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static final a d = new a("FileNotFound", 0);
        public static final a e = new a("PermissionDenied", 1);
        private static final a[] i;
        private static final T9.a v;

        static {
            a[] aVarArrC = c();
            i = aVarArrC;
            v = T9.b.a(aVarArrC);
        }

        private a(String str, int i2) {
        }

        private static final a[] c() {
            return new a[]{d, e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LL8/v$b;", "", "Le/c;", "", "", "openDocumentLauncher", "Le/g;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", "context", "<init>", "(Le/c;Le/c;Landroid/content/Context;)V", "LL8/v;", "c", "()LL8/v;", "d", "a", "Le/c;", "b", "Landroid/content/Context;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {

        @NotNull
        private final e.c<String[]> openDocumentLauncher;

        @NotNull
        private final e.c<g> selectFromPhotoLibraryLauncher;

        @NotNull
        private final Context context;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends l implements Function0<Unit> {
            a() {
                super(0);
            }

            public Object invoke() {
                m9invoke();
                return Unit.a;
            }

            public final void m9invoke() {
                b.this.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0032b extends l implements Function0<Unit> {
            C0032b() {
                super(0);
            }

            public Object invoke() {
                m10invoke();
                return Unit.a;
            }

            public final void m10invoke() {
                b.this.selectFromPhotoLibraryLauncher.b(e.h.b(h.d.a, 0, false, (h.b) null, 14, (Object) null));
            }
        }

        public b(@NotNull e.c<String[]> cVar, @NotNull e.c<g> cVar2, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(cVar, "openDocumentLauncher");
            Intrinsics.checkNotNullParameter(cVar2, "selectFromPhotoLibraryLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            this.openDocumentLauncher = cVar;
            this.selectFromPhotoLibraryLauncher = cVar2;
            this.context = context;
        }

        @NotNull
        public final C0399v c() {
            return new C0399v("DocumentPicker", this.context, new a());
        }

        @NotNull
        public final C0399v d() {
            return new C0399v("PhotoLibraryPicker", this.context, new C0032b());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LL8/v$c;", "", "<init>", "()V", "a", "b", "c", "LL8/v$c$a;", "LL8/v$c$b;", "LL8/v$c$c;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LL8/v$c$a;", "LL8/v$c;", "<init>", "()V", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends c {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LL8/v$c$b;", "LL8/v$c;", "", "", "absoluteFilePaths", "LL8/v$a;", "reason", "<init>", "(Ljava/util/List;LL8/v$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LL8/v$a;", "getReason", "()LL8/v$a;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Failure extends c {

            @NotNull
            private final List<String> absoluteFilePaths;

            @NotNull
            private final a reason;

            public Failure(@NotNull List<String> list, @NotNull a aVar) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "absoluteFilePaths");
                Intrinsics.checkNotNullParameter(aVar, "reason");
                this.absoluteFilePaths = list;
                this.reason = aVar;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.b(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public int hashCode() {
                return (this.absoluteFilePaths.hashCode() * 31) + this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LL8/v$c$c;", "LL8/v$c;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends c {

            @NotNull
            private final List<String> absoluteFilePaths;

            public Success(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "absoluteFilePaths");
                this.absoluteFilePaths = list;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.b(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.launchers.DocumentsSelectWorker$run$1", f = "DocumentsSelectWorker.kt", l = {42, 46, 50, 54}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "LL8/v$c;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super c>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @f(c = "com.withpersona.sdk2.inquiry.launchers.DocumentsSelectWorker$run$1$1", f = "DocumentsSelectWorker.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final C0399v e;

            L(C0399v c0399v, Continuation<? super L> continuation) {
                super(2, continuation);
                this.e = c0399v;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new L(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                this.e.launchPicker.invoke();
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroid/net/Uri;", "it", "", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b<T> implements ka.h {
            final C0399v d;
            final ka.h<c> e;

            b(C0399v c0399v, ka.h<? super c> hVar) {
                this.d = c0399v;
                this.e = hVar;
            }

            public final Object c(@NotNull List<? extends Uri> list, @NotNull Continuation<? super Unit> continuation) throws FileNotFoundException {
                Object objD = this.d.d(this.e, list, continuation);
                return objD == S9.b.c() ? objD : Unit.a;
            }
        }

        @f(c = "com.withpersona.sdk2.inquiry.launchers.DocumentsSelectWorker$run$1$documentSelectResult$1", f = "DocumentsSelectWorker.kt", l = {43}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "", "Landroid/net/Uri;", "<anonymous>", "(Lha/L;)Ljava/util/List;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0400c extends k implements Function2<ha.L, Continuation<? super List<? extends Uri>>, Object> {
            int d;

            C0400c(Continuation<? super C0400c> continuation) {
                super(2, continuation);
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0400c(continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super List<? extends Uri>> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    C0398u c0398u = new C0398u();
                    this.d = 1;
                    obj = i.u(c0398u, this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return obj;
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super c> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = C0399v.this.new h(continuation);
            hVar.e = obj;
            return hVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) throws P9.d {
            throw new UnsupportedOperationException("Method not decompiled: ha.C0399v.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0399v(@NotNull String str, @NotNull Context context, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(function0, "launchPicker");
        this.key = str;
        this.context = context;
        this.launchPicker = function0;
    }

    public final java.lang.Object d(ka.h<? super ha.C0399v.c> r17, java.util.List<? extends android.net.Uri> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0399v.d(ka.h, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C0399v) && Intrinsics.b(this.key, ((C0399v) otherWorker).key);
    }

    @Override
    @NotNull
    public ka.g<c> run() {
        return i.x(i.v(new h(null)), c0.b());
    }
}
