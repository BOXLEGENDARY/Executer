package ha;

import P9.p;
import U.Gw.oeVkjmfPcLbWm;
import a6.c;
import android.content.Context;
import b6.InterfaceC1742a;
import c6.AnalyticEvent;
import com.appsflyer.R;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.a0;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.db.RobloxDatabase;
import h7.l;
import ha.H;
import ha.M;
import ha.N;
import ha.g;
import ha.o0;
import ha.q0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010!\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0004*\u00020\u000fH\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"LL5/h;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "serializedEvent", "evt", "ctx", "serializedParams", BuildConfig.FLAVOR, "waitForFullBatch", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", BuildConfig.FLAVOR, "Lc6/a;", "k", "()Ljava/util/List;", "events", BuildConfig.FLAVOR, "batchSize", "p", "(Ljava/util/List;IZ)Z", "Lb6/a;", "j", "()Lb6/a;", "analyticEventDao", "n", "(Lb6/a;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "q", "(Z)V", "o", "(Lc6/a;)Ljava/lang/String;", "Lha/H;", "b", "Lha/H;", "eventUploadDispatcher", "Lha/L;", "c", "Lha/L;", "eventUploadScope", "Ljava/util/concurrent/LinkedBlockingQueue;", "d", "Ljava/util/concurrent/LinkedBlockingQueue;", "eventsQueue", "Ljava/text/SimpleDateFormat;", "e", "Ljava/text/SimpleDateFormat;", "localTimeFormat", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    public static final h f2110a = new h();

    private static final H eventUploadDispatcher;

    private static final ha.L eventUploadScope;

    private static final LinkedBlockingQueue<AnalyticEvent> eventsQueue;

    private static final SimpleDateFormat localTimeFormat;

    @f(c = "com.roblox.client.analytics.NotificationEventUploadJob$addEvent$1$1", f = "NotificationEventUploadJob.kt", l = {83}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {

        final boolean f2115A;

        Object f2116d;

        int f2117e;

        final String f2118i;

        final String f2119v;

        final String f2120w;

        final String f2121y;

        final InterfaceC1742a f2122z;

        L(String str, String str2, String str3, String str4, InterfaceC1742a interfaceC1742a, boolean z7, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f2118i = str;
            this.f2119v = str2;
            this.f2120w = str3;
            this.f2121y = str4;
            this.f2122z = interfaceC1742a;
            this.f2115A = z7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new L(this.f2118i, this.f2119v, this.f2120w, this.f2121y, this.f2122z, this.f2115A, continuation);
        }

        public final Object invoke(ha.L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            AnalyticEvent analyticEvent;
            Object objC = S9.b.c();
            int i7 = this.f2117e;
            if (i7 == 0) {
                p.b(obj);
                AnalyticEvent analyticEvent2 = new AnalyticEvent(0, this.f2118i, this.f2119v, this.f2120w, this.f2121y, null, 32, null);
                this.f2116d = analyticEvent2;
                this.f2117e = 1;
                Object objG = this.f2122z.g(new AnalyticEvent[]{analyticEvent2}, this);
                if (objG == objC) {
                    return objC;
                }
                analyticEvent = analyticEvent2;
                obj = objG;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                analyticEvent = (AnalyticEvent) this.f2116d;
                p.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                kotlin.coroutines.jvm.internal.b.b(l.g("EventUploadJob", "Added event " + this.f2118i + " to database."));
            } else {
                l.g("EventUploadJob", "Failed to add event " + this.f2118i + " to database. Adding it to in-memory queue.");
                kotlin.coroutines.jvm.internal.b.a(h.eventsQueue.add(analyticEvent));
            }
            h.f2110a.q(this.f2115A);
            return Unit.a;
        }
    }

    @f(c = "com.roblox.client.analytics.NotificationEventUploadJob", f = "NotificationEventUploadJob.kt", l = {168, 183, 190}, m = "sendUploadRequestBlocking")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends d {

        int f2123A;

        Object f2124d;

        Object f2125e;

        Object f2126i;

        boolean f2127v;

        int f2128w;

        Object f2129y;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2129y = obj;
            this.f2123A |= Integer.MIN_VALUE;
            return h.this.n(null, null, this);
        }
    }

    @f(c = "com.roblox.client.analytics.NotificationEventUploadJob$uploadEvents$1$1", f = "NotificationEventUploadJob.kt", l = {109, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class C0504c extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {

        int f2131d;

        boolean f2132e;

        int f2133i;

        final InterfaceC1742a f2134v;

        final boolean f2135w;

        C0504c(InterfaceC1742a interfaceC1742a, boolean z7, Continuation<? super C0504c> continuation) {
            super(2, continuation);
            this.f2134v = interfaceC1742a;
            this.f2135w = z7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0504c(this.f2134v, this.f2135w, continuation);
        }

        public final Object invoke(ha.L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            throw new UnsupportedOperationException("Method not decompiled: ha.h.C0504c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        o0 o0VarC = q0.c(executorServiceNewSingleThreadExecutor);
        eventUploadDispatcher = o0VarC;
        eventUploadScope = M.a(o0VarC);
        eventsQueue = new LinkedBlockingQueue<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        localTimeFormat = simpleDateFormat;
    }

    private h() {
    }

    private final void g(String serializedEvent, String evt, String ctx, String serializedParams, boolean waitForFullBatch) {
        InterfaceC1742a interfaceC1742aJ = j();
        if (interfaceC1742aJ == null || g.d(eventUploadScope, (CoroutineContext) null, (N) null, new L(serializedEvent, evt, ctx, serializedParams, interfaceC1742aJ, waitForFullBatch, null), 3, (Object) null) == null) {
            l.d("EventUploadJob", "Failed to add " + serializedEvent + ". Database is not available");
        }
    }

    public static final CharSequence i(NameValuePair nameValuePair) {
        Intrinsics.checkNotNullParameter(nameValuePair, "it");
        return nameValuePair.getName() + "=" + nameValuePair.getValue();
    }

    private final InterfaceC1742a j() {
        c cVar = c.f8380a;
        Context contextA = RobloxApplication.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextA);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.D();
        }
        return null;
    }

    public final List<AnalyticEvent> k() {
        LinkedBlockingQueue<AnalyticEvent> linkedBlockingQueue = eventsQueue;
        if (linkedBlockingQueue.isEmpty()) {
            return CollectionsKt.j();
        }
        ArrayList arrayList = new ArrayList();
        linkedBlockingQueue.drainTo(arrayList);
        return arrayList;
    }

    private final String l(List<AnalyticEvent> events) {
        return CollectionsKt.U(events, ",", "[", "]", 0, (CharSequence) null, new Function1() {
            public final Object invoke(Object obj) {
                return h.m((AnalyticEvent) obj);
            }
        }, 24, (Object) null);
    }

    public static final CharSequence m(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "it");
        return "\"" + f2110a.o(analyticEvent) + "\"";
    }

    public final java.lang.Object n(b6.InterfaceC1742a r27, java.util.List<c6.AnalyticEvent> r28, kotlin.coroutines.Continuation<? super java.lang.Boolean> r29) {
        throw new UnsupportedOperationException("Method not decompiled: ha.h.n(b6.a, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean p(List<AnalyticEvent> events, int batchSize, boolean waitForFullBatch) {
        boolean z7 = events.size() >= batchSize || !(waitForFullBatch || events.isEmpty());
        l.g("EventUploadJob", "Should upload events " + z7 + ", events count " + events.size() + ", batch size " + batchSize + ", waitForFullBatch " + waitForFullBatch);
        return z7;
    }

    public final void h(String evt, String ctx, List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        String str = localTimeFormat.format(new Date());
        String str2 = a0.f19895p;
        String str3 = ("lt=" + str + oeVkjmfPcLbWm.WzQQqKmywV + str2 + "&idfv=" + str2 + sMlEMqrxoGI.jbffkkUyjsdBhpN + h7.c.d()) + "&" + CollectionsKt.U(params, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() {
            public final Object invoke(Object obj) {
                return h.i((NameValuePair) obj);
            }
        }, 30, (Object) null);
        g("evt=" + evt + "&ctx=" + ctx + "&" + str3, evt, ctx, str3, waitForFullBatch);
    }

    public final String o(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "<this>");
        Integer retryAttemptCount = analyticEvent.getRetryAttemptCount();
        if (retryAttemptCount != null) {
            int iIntValue = retryAttemptCount.intValue();
            StringBuilder sb = new StringBuilder();
            String eventName = analyticEvent.getEventName();
            if (eventName != null) {
                sb.append("evt=" + eventName + "Retry");
            }
            String eventContext = analyticEvent.getEventContext();
            if (eventContext != null) {
                sb.append("&ctx=" + eventContext);
            }
            String serializedParams = analyticEvent.getSerializedParams();
            if (serializedParams != null) {
                sb.append("&" + serializedParams);
            }
            sb.append("&retryAttemptCount=" + iIntValue);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (string != null) {
                return string;
            }
        }
        return analyticEvent.getSerializedEvent();
    }

    public final void q(boolean waitForFullBatch) {
        InterfaceC1742a interfaceC1742aJ = j();
        if (interfaceC1742aJ == null || g.d(eventUploadScope, (CoroutineContext) null, (N) null, new C0504c(interfaceC1742aJ, waitForFullBatch, null), 3, (Object) null) == null) {
            l.d("EventUploadJob", "Failed to upload events. Database is not available");
        }
    }
}
