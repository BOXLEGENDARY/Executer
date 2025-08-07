package ha;

import P9.p;
import S9.b;
import X9.c;
import X9.h;
import android.content.Context;
import com.roblox.client.personasdk.R;
import ha.D0;
import ha.H;
import ha.M;
import ha.N;
import ha.c0;
import ha.g;
import ha.z0;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"La9/j;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "subsystem", "La9/i;", "level", "message", "", "a", "(Ljava/lang/String;La9/i;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Ljava/lang/String;La9/i;Ljava/lang/String;)V", "g", "(Ljava/lang/String;La9/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "Ljava/io/File;", "logFile", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lha/L;", "c", "Lha/L;", "coroutineScope", "Lha/H;", "d", "Lha/H;", "loggerContext", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0462j {

    @NotNull
    private final File logFile;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @NotNull
    private final ha.L coroutineScope;

    @NotNull
    private final H loggerContext;

    @f(c = "com.withpersona.sdk2.inquiry.shared.Logger$_log$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lha/L;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Object>, Object> {
        int d;
        final EnumC0461i i;
        final String v;
        final String w;

        L(EnumC0461i enumC0461i, String str, String str2, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = enumC0461i;
            this.v = str;
            this.w = str2;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0462j.this.new L(this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<Object> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                File parentFile = C0462j.this.logFile.getParentFile();
                if (parentFile != null) {
                    kotlin.coroutines.jvm.internal.b.a(parentFile.mkdirs());
                }
                String str = this.i.name() + "," + C0462j.this.dateFormat.format(new Date()) + "," + this.v + "," + this.w;
                FileWriter fileWriter = new FileWriter(C0462j.this.logFile, true);
                try {
                    Writer writerAppend = fileWriter.append((CharSequence) str);
                    c.a(fileWriter, (Throwable) null);
                    return writerAppend;
                } finally {
                }
            } catch (Exception unused) {
                return Unit.a;
            }
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.shared.Logger$deleteLogFile$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0463c extends k implements Function2<ha.L, Continuation<? super Object>, Object> {
        int d;

        C0463c(Continuation<? super C0463c> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0462j.this.new C0463c(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<Object> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                return kotlin.coroutines.jvm.internal.b.a(C0462j.this.logFile.delete());
            } catch (Exception unused) {
                return Unit.a;
            }
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.shared.Logger$log$1", f = "Logger.kt", l = {67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0464d extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final String i;
        final EnumC0461i v;
        final String w;

        C0464d(String str, EnumC0461i enumC0461i, String str2, Continuation<? super C0464d> continuation) {
            super(2, continuation);
            this.i = str;
            this.v = enumC0461i;
            this.w = str2;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0462j.this.new C0464d(this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0462j c0462j = C0462j.this;
                String str = this.i;
                EnumC0461i enumC0461i = this.v;
                String str2 = this.w;
                this.d = 1;
                if (c0462j.a(str, enumC0461i, str2, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.shared.Logger$readCsvLogsWith$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0465e extends k implements Function2<ha.L, Continuation<? super String>, Object> {
        int d;
        final String i;
        final EnumC0461i v;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "line", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<String, Unit> {
            final String d;
            final EnumC0461i e;
            final StringBuilder i;

            a(String str, EnumC0461i enumC0461i, StringBuilder sb) {
                super(1);
                this.d = str;
                this.e = enumC0461i;
                this.i = sb;
            }

            public final void a(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "line");
                List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null);
                String str2 = (String) listSplit$default.get(0);
                if (Intrinsics.b((String) listSplit$default.get(2), this.d) && Intrinsics.b(str2, this.e.name())) {
                    StringBuilder sb = this.i;
                    sb.append(str);
                    sb.append("\n");
                }
            }

            public Object invoke(Object obj) {
                a((String) obj);
                return Unit.a;
            }
        }

        C0465e(String str, EnumC0461i enumC0461i, Continuation<? super C0465e> continuation) {
            super(2, continuation);
            this.i = str;
            this.v = enumC0461i;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0462j.this.new C0465e(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super String> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                if (!C0462j.this.logFile.exists()) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                h.e(C0462j.this.logFile, (Charset) null, new a(this.i, this.v, sb), 1, (Object) null);
                return sb.toString();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public C0462j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.logFile = new File(context.getCacheDir(), "persona_log.csv");
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = M.a(c0.a().K(D0.b((z0) null, 1, (Object) null)));
        this.loggerContext = c0.b().A1(1);
    }

    public final Object a(String str, EnumC0461i enumC0461i, String str2, Continuation<? super Unit> continuation) {
        Object objG = g.g(this.loggerContext, new L(enumC0461i, str, str2, null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }

    public final Object e(@NotNull Continuation<? super Unit> continuation) {
        Object objG = g.g(this.loggerContext, new C0463c(null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }

    public final void f(@NotNull String subsystem, @NotNull EnumC0461i level, @NotNull String message) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new C0464d(subsystem, level, message, null), 3, (Object) null);
    }

    public final Object g(@NotNull String str, @NotNull EnumC0461i enumC0461i, @NotNull Continuation<? super String> continuation) {
        return g.g(this.loggerContext, new C0465e(str, enumC0461i, null), continuation);
    }
}
