package com.withpersona.sdk2.inquiry.ui.network;

import P9.p;
import bb.InterfaceC0875b;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.steps.ui.network.Meta;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.List;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0013B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Ly9/b;", "uiService", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Ly9/b;)V", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "b", "Ljava/lang/String;", "c", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "e", "Ly9/b;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements o<AbstractC0218b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final UiComponent triggeringComponent;

    @NotNull
    private final String addressText;

    @NotNull
    private final InterfaceC0875b uiService;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "", "Ly9/b;", "uiService", "<init>", "(Ly9/b;)V", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "triggeringComponent", "addressText", "Lcom/withpersona/sdk2/inquiry/ui/network/b;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Ly9/b;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final InterfaceC0875b uiService;

        public a(@NotNull InterfaceC0875b interfaceC0875b) {
            Intrinsics.checkNotNullParameter(interfaceC0875b, "uiService");
            this.uiService = interfaceC0875b;
        }

        @NotNull
        public final b a(@NotNull String sessionToken, @NotNull UiComponent triggeringComponent, @NotNull String addressText) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(triggeringComponent, "triggeringComponent");
            Intrinsics.checkNotNullParameter(addressText, "addressText");
            return new b(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0218b {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0218b {

            @NotNull
            private final InternalErrorInfo cause;

            public a(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "results", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0219b extends AbstractC0218b {

            @NotNull
            private final List<Suggestion> results;

            public C0219b(@NotNull List<Suggestion> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "results");
                this.results = list;
            }

            @NotNull
            public final List<Suggestion> a() {
                return this.results;
            }
        }

        public AbstractC0218b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0218b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", f = "UiAddressAutocompleteWorker.kt", l = {19, 28, 30}, m = "invokeSuspend")
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<h<? super AbstractC0218b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super AbstractC0218b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            h hVar;
            List<Suggestion> listJ;
            Meta meta;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                hVar = (h) this.e;
                InterfaceC0875b interfaceC0875b = b.this.uiService;
                String str = b.this.sessionToken;
                AddressAutocompleteRequest addressAutocompleteRequestA = AddressAutocompleteRequest.INSTANCE.a(b.this.triggeringComponent, b.this.addressText);
                this.e = hVar;
                this.d = 1;
                obj = interfaceC0875b.a(str, addressAutocompleteRequestA, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                hVar = (h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            if (tVar.g()) {
                AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) tVar.a();
                if (addressAutocompleteResponse == null || (meta = addressAutocompleteResponse.getMeta()) == null || (listJ = meta.a()) == null) {
                    listJ = CollectionsKt.j();
                }
                AbstractC0218b.C0219b c0219b = new AbstractC0218b.C0219b(listJ);
                this.e = null;
                this.d = 3;
                if (hVar.c(c0219b, this) == objC) {
                    return objC;
                }
            } else {
                AbstractC0218b.a aVar = new AbstractC0218b.a(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = null;
                this.d = 2;
                if (hVar.c(aVar, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    public b(String str, UiComponent uiComponent, String str2, InterfaceC0875b interfaceC0875b, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiComponent, str2, interfaceC0875b);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.b(this.addressText, ((b) otherWorker).addressText);
    }

    @Override
    @NotNull
    public g<AbstractC0218b> run() {
        return i.v(new c(null));
    }

    private b(String str, UiComponent uiComponent, String str2, InterfaceC0875b interfaceC0875b) {
        this.sessionToken = str;
        this.triggeringComponent = uiComponent;
        this.addressText = str2;
        this.uiService = interfaceC0875b;
    }
}
