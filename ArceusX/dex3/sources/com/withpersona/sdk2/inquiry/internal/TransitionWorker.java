package com.withpersona.sdk2.inquiry.internal;

import J8.q;
import P9.p;
import android.os.Parcel;
import android.os.Parcelable;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#\u0015$BA\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "LJ8/q;", "service", "Lu8/a;", "fallbackModeManager", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;LJ8/q;Lu8/a;)V", "Lka/g;", "k", "()Lka/g;", "j", "run", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "c", "h", "d", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "e", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "f", "LJ8/q;", "g", "Lu8/a;", "a", "TransitionData", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class TransitionWorker implements ka.o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final InquirySessionConfig inquirySessionConfig;

    @NotNull
    private final TransitionData transitionData;

    @NotNull
    private final q service;

    @NotNull
    private final InterfaceC0808a fallbackModeManager;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "e", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "i", "Ljava/lang/String;", "c", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class TransitionData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransitionData> CREATOR = new a();

        @NotNull
        private final UiComponent fromComponent;

        @NotNull
        private final Map<String, ComponentParam> componentParams;

        @NotNull
        private final String fromStep;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitionData> {
            @Override
            @NotNull
            public final TransitionData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiComponent uiComponent = (UiComponent) parcel.readParcelable(TransitionData.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TransitionData.class.getClassLoader()));
                }
                return new TransitionData(uiComponent, linkedHashMap, parcel.readString());
            }

            @Override
            @NotNull
            public final TransitionData[] newArray(int i) {
                return new TransitionData[i];
            }
        }

        public TransitionData(@NotNull UiComponent uiComponent, @NotNull Map<String, ? extends ComponentParam> map, @NotNull String str) {
            Intrinsics.checkNotNullParameter(uiComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(map, "componentParams");
            Intrinsics.checkNotNullParameter(str, "fromStep");
            this.fromComponent = uiComponent;
            this.componentParams = map;
            this.fromStep = str;
        }

        @NotNull
        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }

        @NotNull
        public final UiComponent getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransitionData)) {
                return false;
            }
            TransitionData transitionData = (TransitionData) other;
            return Intrinsics.b(this.fromComponent, transitionData.fromComponent) && Intrinsics.b(this.componentParams, transitionData.componentParams) && Intrinsics.b(this.fromStep, transitionData.fromStep);
        }

        public int hashCode() {
            return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransitionData(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.fromComponent, flags);
            Map<String, ComponentParam> map = this.componentParams;
            parcel.writeInt(map.size());
            for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable(entry.getValue(), flags);
            }
            parcel.writeString(this.fromStep);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        TransitionWorker a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends b {

            @NotNull
            private final InternalErrorInfo cause;

            public Error(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.b(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends b {

            private final InquiryState nextState;

            public Success(InquiryState inquiryState) {
                super(null);
                this.nextState = inquiryState;
            }

            public final InquiryState getNextState() {
                return this.nextState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.b(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                InquiryState inquiryState = this.nextState;
                if (inquiryState == null) {
                    return 0;
                }
                return inquiryState.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", f = "TransitionWorker.kt", l = {35, 37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = TransitionWorker.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                if (TransitionWorker.this.fallbackModeManager.b()) {
                    ka.g gVarJ = TransitionWorker.this.j();
                    this.d = 1;
                    if (ka.i.p(hVar, gVarJ, this) == objC) {
                        return objC;
                    }
                } else {
                    ka.g gVarK = TransitionWorker.this.k();
                    this.d = 2;
                    if (ka.i.p(hVar, gVarK, this) == objC) {
                        return objC;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", f = "TransitionWorker.kt", l = {69, 78, 80}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            d dVar = TransitionWorker.this.new d(continuation);
            dVar.e = obj;
            return dVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            ka.h hVar;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                hVar = (ka.h) this.e;
                InterfaceC0808a interfaceC0808a = TransitionWorker.this.fallbackModeManager;
                String sessionToken = TransitionWorker.this.getSessionToken();
                TransitionInquiryRequest transitionInquiryRequestA = TransitionInquiryRequest.INSTANCE.a(TransitionWorker.this.transitionData.getFromComponent(), TransitionWorker.this.transitionData.a(), TransitionWorker.this.transitionData.getFromStep());
                this.e = hVar;
                this.d = 1;
                obj = interfaceC0808a.a(sessionToken, transitionInquiryRequestA, this);
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
                hVar = (ka.h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            if (tVar.g()) {
                b.Success success = new b.Success(null);
                this.e = null;
                this.d = 3;
                if (hVar.c(success, this) == objC) {
                    return objC;
                }
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = null;
                this.d = 2;
                if (hVar.c(error, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", f = "TransitionWorker.kt", l = {42, 52, 64}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            e eVar = TransitionWorker.this.new e(continuation);
            eVar.e = obj;
            return eVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            ka.h hVar;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                hVar = (ka.h) this.e;
                q qVar = TransitionWorker.this.service;
                String sessionToken = TransitionWorker.this.getSessionToken();
                String inquiryId = TransitionWorker.this.getInquiryId();
                TransitionInquiryRequest transitionInquiryRequestA = TransitionInquiryRequest.INSTANCE.a(TransitionWorker.this.transitionData.getFromComponent(), TransitionWorker.this.transitionData.a(), TransitionWorker.this.transitionData.getFromStep());
                this.e = hVar;
                this.d = 1;
                obj = qVar.h(sessionToken, inquiryId, transitionInquiryRequestA, this);
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
                hVar = (ka.h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            if (tVar.g()) {
                Object objA = tVar.a();
                if (objA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullExpressionValue(objA, "requireNotNull(...)");
                CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) objA;
                b.Success success = new b.Success(checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig().getPollingMode() == CheckInquiryResponse.PollingMode.None ? J8.a.n(checkInquiryResponse, TransitionWorker.this.getSessionToken(), TransitionWorker.this.inquirySessionConfig) : null);
                this.e = null;
                this.d = 3;
                if (hVar.c(success, this) == objC) {
                    return objC;
                }
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = null;
                this.d = 2;
                if (hVar.c(error, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    public TransitionWorker(@NotNull String str, @NotNull String str2, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull TransitionData transitionData, @NotNull q qVar, @NotNull InterfaceC0808a interfaceC0808a) {
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(transitionData, "transitionData");
        Intrinsics.checkNotNullParameter(qVar, "service");
        Intrinsics.checkNotNullParameter(interfaceC0808a, "fallbackModeManager");
        this.sessionToken = str;
        this.inquiryId = str2;
        this.inquirySessionConfig = inquirySessionConfig;
        this.transitionData = transitionData;
        this.service = qVar;
        this.fallbackModeManager = interfaceC0808a;
    }

    public final ka.g<b> j() {
        return ka.i.v(new d(null));
    }

    public final ka.g<b> k() {
        return ka.i.v(new e(null));
    }

    @Override
    public boolean a(@NotNull ka.o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @NotNull
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override
    @NotNull
    public ka.g<b> run() {
        return ka.i.v(new c(null));
    }
}
