package ka;

import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.u;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ka.g;
import ka.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {"Lo9/b;", "", "", "initialValue", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", "month", "day", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "Lcom/squareup/workflow1/ui/r;", "b", "Lcom/squareup/workflow1/ui/r;", "g", "()Lcom/squareup/workflow1/ui/r;", "yearController", "c", "d", "monthController", "dayController", "Lka/g;", "e", "Lka/g;", "()Lka/g;", "onChanged", "f", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0725b {

    @NotNull
    private final List<String> monthList;

    @NotNull
    private final r yearController;

    @NotNull
    private final r monthController;

    @NotNull
    private final r dayController;

    @NotNull
    private final g<String> onChanged;

    @f(c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", f = "DateController.kt", l = {60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super String>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements ka.h {
            final ka.h<String> d;
            final C0725b e;

            a(ka.h<? super String> hVar, C0725b c0725b) {
                this.d = hVar;
                this.e = c0725b;
            }

            public final Object c(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                Object objC = this.d.c(this.e.f(), continuation);
                return objC == b.c() ? objC : Unit.a;
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super String> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = C0725b.this.new h(continuation);
            hVar.e = obj;
            return hVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                g gVarB = i.B(new g[]{C0725b.this.getYearController().a(), C0725b.this.getMonthController().a(), C0725b.this.getDayController().a()});
                a aVar = new a(hVar, C0725b.this);
                this.d = 1;
                if (gVarB.a(aVar, this) == objC) {
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

    public C0725b(String str, String str2, @NotNull List<String> list) {
        String str3;
        Intrinsics.checkNotNullParameter(list, "monthList");
        this.monthList = list;
        List listW0 = str != null ? StringsKt.w0(str, new char[]{'-'}, false, 0, 6, (Object) null) : null;
        listW0 = (listW0 == null || listW0.size() != 3) ? CollectionsKt.m(new String[]{"", "", ""}) : listW0;
        this.yearController = u.a((String) listW0.get(0));
        try {
            str3 = list.get(Integer.parseInt((String) listW0.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.monthController = u.a(str3);
        this.dayController = u.a((String) listW0.get(2));
        this.onChanged = i.v(new h(null));
    }

    private final String a(String year, String month, String day) {
        int iQ = CollectionsKt.Q(this.monthList, month);
        String strH0 = iQ > -1 ? StringsKt.h0(String.valueOf(iQ + 1), 2, '0') : null;
        if (year == null || year.length() == 0 || strH0 == null || strH0.length() == 0 || day == null || day.length() == 0) {
            return "";
        }
        return year + "-" + strH0 + "-" + day;
    }

    public final Date b() {
        try {
            List listW0 = StringsKt.w0(f(), new char[]{'-'}, false, 0, 6, (Object) null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listW0.get(0)));
            calendar.set(2, Integer.parseInt((String) listW0.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listW0.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final r getDayController() {
        return this.dayController;
    }

    @NotNull
    public final r getMonthController() {
        return this.monthController;
    }

    @NotNull
    public final g<String> e() {
        return this.onChanged;
    }

    @NotNull
    public final String f() {
        return a(this.yearController.b(), this.monthController.b(), this.dayController.b());
    }

    @NotNull
    public final r getYearController() {
        return this.yearController;
    }
}
