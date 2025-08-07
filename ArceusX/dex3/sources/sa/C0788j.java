package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.C0755b;
import ra.e;
import ra.i;
import sa.C0790l;
import sa.InterfaceC0793o;
import ta.C0805b;
import ua.C0815d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b3\u0018\u0000 E2\u00020\u0001:\u0002\u000f\u0015B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR/\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR/\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR/\u0010)\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR/\u0010-\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR/\u00101\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR/\u00105\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR/\u00109\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR/\u0010=\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR/\u0010A\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b>\u0010\u001a*\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u00010\u00132\b\u0010B\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0018\"\u0004\bC\u0010\u001a¨\u0006F"}, d2 = {"Lsa/j;", "", "Lsa/k;", "contents", "<init>", "(Lsa/k;)V", "Lra/i;", "e", "()Lra/i;", "Lra/h;", "d", "()Lra/h;", "Lra/e;", "c", "()Lra/e;", "a", "Lsa/k;", "getContents$kotlinx_datetime", "()Lsa/k;", "", "<set-?>", "b", "Lsa/K;", "getMonthNumber", "()Ljava/lang/Integer;", "setMonthNumber", "(Ljava/lang/Integer;)V", "monthNumber", "getDayOfMonth", "setDayOfMonth", "dayOfMonth", "Lsa/H;", "getDayOfYear", "setDayOfYear", "dayOfYear", "getHour", "setHour", "hour", "f", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "g", "getMinute", "setMinute", "minute", "h", "getSecond", "setSecond", "second", "i", "getOffsetHours", "setOffsetHours", "offsetHours", "j", "getOffsetMinutesOfHour", "setOffsetMinutesOfHour", "offsetMinutesOfHour", "k", "getOffsetSecondsOfMinute", "setOffsetSecondsOfMinute", "offsetSecondsOfMinute", "setYear", "getYear$delegate", "(Lsa/j;)Ljava/lang/Object;", "year", "value", "setNanosecond", "nanosecond", "l", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0788j {

    @NotNull
    private final C0789k contents;

    @NotNull
    private final C0771K monthNumber;

    @NotNull
    private final C0771K dayOfMonth;

    @NotNull
    private final C0768H dayOfYear;

    @NotNull
    private final C0771K hour;

    @NotNull
    private final C0771K hourOfAmPm;

    @NotNull
    private final C0771K minute;

    @NotNull
    private final C0771K second;

    @NotNull
    private final C0771K offsetHours;

    @NotNull
    private final C0771K offsetMinutesOfHour;

    @NotNull
    private final C0771K offsetSecondsOfMinute;
    static final fa.l<Object>[] m = {kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "hour", "getHour()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "minute", "getMinute()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "second", "getSecond()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.z.e(new kotlin.jvm.internal.p(C0788j.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0))};

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsa/j$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsa/o$b;", "", "block", "Lsa/n;", "Lsa/j;", "a", "(Lkotlin/jvm/functions/Function1;)Lsa/n;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC0792n<C0788j> a(@NotNull Function1<? super InterfaceC0793o.b, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            C0790l.a aVar = new C0790l.a(new C0815d());
            block.invoke(aVar);
            return new C0790l(aVar.x());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lsa/j$b;", "", "<init>", "()V", "Lsa/n;", "Lsa/j;", "b", "Lsa/n;", "a", "()Lsa/n;", "ISO_DATE_TIME_OFFSET", "c", "getRFC_1123", "RFC_1123", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        private static final InterfaceC0792n<C0788j> ISO_DATE_TIME_OFFSET;

        @NotNull
        private static final InterfaceC0792n<C0788j> RFC_1123;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
            public static final a d = new a();

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0280a extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final C0280a d = new C0280a();

                C0280a() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    C0794p.b(bVar, 't');
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0281b extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final C0281b d = new C0281b();

                C0281b() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    C0794p.b(bVar, 'T');
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class c extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final c d = new c();

                c() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$optional");
                    C0794p.b(bVar, '.');
                    bVar.f(1, 9);
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class d extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final d d = new d();

                d() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    InterfaceC0793o.d.a.a(bVar, null, 1, null);
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class e extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final e d = new e();

                e() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    bVar.s(i.b.a.b());
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            a() {
                super(1);
            }

            public final void a(@NotNull InterfaceC0793o.b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "$this$Format");
                bVar.w(z.b());
                C0794p.a(bVar, new Function1[]{C0280a.d}, C0281b.d);
                InterfaceC0793o.c.a.a(bVar, null, 1, null);
                C0794p.b(bVar, ':');
                InterfaceC0793o.c.a.b(bVar, null, 1, null);
                C0794p.b(bVar, ':');
                InterfaceC0793o.c.a.c(bVar, null, 1, null);
                C0794p.d(bVar, null, c.d, 1, null);
                C0794p.a(bVar, new Function1[]{d.d}, e.d);
            }

            public Object invoke(Object obj) {
                a((InterfaceC0793o.b) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0282b extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
            public static final C0282b d = new C0282b();

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class a extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final a d = new a();

                a() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0283b extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final C0283b d = new C0283b();

                C0283b() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    bVar.p(C0797s.INSTANCE.a());
                    bVar.c(", ");
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class c extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final c d = new c();

                c() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$optional");
                    C0794p.b(bVar, ':');
                    InterfaceC0793o.c.a.c(bVar, null, 1, null);
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class d extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final d d = new d();

                d() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    bVar.c("UT");
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class e extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final e d = new e();

                e() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    bVar.c("Z");
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class f extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                public static final f d = new f();

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/o$b;", "", "a", "(Lsa/o$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class a extends kotlin.jvm.internal.l implements Function1<InterfaceC0793o.b, Unit> {
                    public static final a d = new a();

                    a() {
                        super(1);
                    }

                    public final void a(@NotNull InterfaceC0793o.b bVar) {
                        Intrinsics.checkNotNullParameter(bVar, "$this$optional");
                        bVar.s(i.b.a.a());
                    }

                    public Object invoke(Object obj) {
                        a((InterfaceC0793o.b) obj);
                        return Unit.a;
                    }
                }

                f() {
                    super(1);
                }

                public final void a(@NotNull InterfaceC0793o.b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "$this$alternativeParsing");
                    C0794p.c(bVar, "GMT", a.d);
                }

                public Object invoke(Object obj) {
                    a((InterfaceC0793o.b) obj);
                    return Unit.a;
                }
            }

            C0282b() {
                super(1);
            }

            public final void a(@NotNull InterfaceC0793o.b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "$this$Format");
                C0794p.a(bVar, new Function1[]{a.d}, C0283b.d);
                bVar.e(EnumC0766F.d);
                C0794p.b(bVar, ' ');
                bVar.d(C0764D.INSTANCE.a());
                C0794p.b(bVar, ' ');
                InterfaceC0793o.a.C0285a.c(bVar, null, 1, null);
                C0794p.b(bVar, ' ');
                InterfaceC0793o.c.a.a(bVar, null, 1, null);
                C0794p.b(bVar, ':');
                InterfaceC0793o.c.a.b(bVar, null, 1, null);
                C0794p.d(bVar, null, c.d, 1, null);
                bVar.c(" ");
                C0794p.a(bVar, new Function1[]{d.d, e.d}, f.d);
            }

            public Object invoke(Object obj) {
                a((InterfaceC0793o.b) obj);
                return Unit.a;
            }
        }

        static {
            Companion companion = C0788j.INSTANCE;
            ISO_DATE_TIME_OFFSET = companion.a(a.d);
            RFC_1123 = companion.a(C0282b.d);
        }

        private b() {
        }

        @NotNull
        public final InterfaceC0792n<C0788j> a() {
            return ISO_DATE_TIME_OFFSET;
        }
    }

    public C0788j() {
        C0789k c0789k = null;
        this(c0789k, 1, c0789k);
    }

    public final Integer a() {
        return this.contents.getTime().getNanosecond();
    }

    public final Integer b() {
        return this.contents.getDate().getYear();
    }

    @NotNull
    public final ra.e c() {
        ra.i iVarE = e();
        ra.h hVarD = d();
        C0800v c0800vA = this.contents.getDate().copy();
        c0800vA.r(Integer.valueOf(((Number) z.c(c0800vA.getYear(), "year")).intValue() % 10000));
        try {
            Intrinsics.d(b());
            long jA = C0805b.a(C0805b.c(r4.intValue() / 10000, 315569520000L), ((c0800vA.b().k() * 86400) + hVarD.e()) - iVarE.a());
            e.Companion aVar = ra.e.INSTANCE;
            if (jA < aVar.d().g() || jA > aVar.c().g()) {
                throw new C0755b("The parsed date is outside the range representable by Instant");
            }
            Integer numA = a();
            return aVar.a(jA, numA != null ? numA.intValue() : 0);
        } catch (ArithmeticException e2) {
            throw new C0755b("The parsed date is outside the range representable by Instant", e2);
        }
    }

    @NotNull
    public final ra.h d() {
        return this.contents.getTime().c();
    }

    @NotNull
    public final ra.i e() {
        return this.contents.getOffset().d();
    }

    public C0788j(@NotNull C0789k c0789k) {
        Intrinsics.checkNotNullParameter(c0789k, "contents");
        this.contents = c0789k;
        c0789k.getDate();
        this.monthNumber = new C0771K(new kotlin.jvm.internal.n(c0789k.getDate()) {
            public Object get() {
                return ((C0800v) ((kotlin.jvm.internal.d) this).receiver).getMonthNumber();
            }
        });
        this.dayOfMonth = new C0771K(new kotlin.jvm.internal.n(c0789k.getDate()) {
            public Object get() {
                return ((C0800v) ((kotlin.jvm.internal.d) this).receiver).getDayOfMonth();
            }
        });
        this.dayOfYear = new C0768H(new kotlin.jvm.internal.n(c0789k.getDate()) {
            public Object get() {
                return ((C0800v) ((kotlin.jvm.internal.d) this).receiver).getDayOfYear();
            }
        });
        this.hour = new C0771K(new kotlin.jvm.internal.n(c0789k.getTime()) {
            public Object get() {
                return ((C0801w) ((kotlin.jvm.internal.d) this).receiver).getHour();
            }
        });
        this.hourOfAmPm = new C0771K(new kotlin.jvm.internal.n(c0789k.getTime()) {
            public Object get() {
                return ((C0801w) ((kotlin.jvm.internal.d) this).receiver).getHourOfAmPm();
            }
        });
        c0789k.getTime();
        this.minute = new C0771K(new kotlin.jvm.internal.n(c0789k.getTime()) {
            public Object get() {
                return ((C0801w) ((kotlin.jvm.internal.d) this).receiver).getMinute();
            }
        });
        this.second = new C0771K(new kotlin.jvm.internal.n(c0789k.getTime()) {
            public Object get() {
                return ((C0801w) ((kotlin.jvm.internal.d) this).receiver).getSecond();
            }
        });
        c0789k.getOffset();
        this.offsetHours = new C0771K(new kotlin.jvm.internal.n(c0789k.getOffset()) {
            public Object get() {
                return ((C0802x) ((kotlin.jvm.internal.d) this).receiver).getTotalHoursAbs();
            }
        });
        this.offsetMinutesOfHour = new C0771K(new kotlin.jvm.internal.n(c0789k.getOffset()) {
            public Object get() {
                return ((C0802x) ((kotlin.jvm.internal.d) this).receiver).getMinutesOfHour();
            }
        });
        this.offsetSecondsOfMinute = new C0771K(new kotlin.jvm.internal.n(c0789k.getOffset()) {
            public Object get() {
                return ((C0802x) ((kotlin.jvm.internal.d) this).receiver).getSecondsOfMinute();
            }
        });
    }

    public C0788j(C0789k c0789k, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            c0789k = new C0789k(null, null, null, null, 15, null);
        }
        this(c0789k);
    }
}
