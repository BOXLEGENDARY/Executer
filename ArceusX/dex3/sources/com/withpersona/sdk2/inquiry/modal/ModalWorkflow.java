package com.withpersona.sdk2.inquiry.modal;

import M8.e;
import M8.i;
import M8.j;
import P9.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import ha.InterfaceC0455c;
import ka.InterfaceC0563a;
import ka.Snapshot;
import ka.k;
import ka.q;
import ka.r;
import ka.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0005*\u00020\u0004*\u001e\b\u0003\u0010\b*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006*\u00020\u00072\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\t:\u0002\u001c\u001fB\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0003¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\n2\"\u0010\u0016\u001a\u001e0\u0015R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00028\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow;", "PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "childWorkflow", "<init>", "(Lf8/q;)V", "props", "Lf8/i;", "snapshot", "i", "(Ljava/lang/Object;Lf8/i;)Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "renderProps", "renderState", "Lf8/k$a;", "context", "j", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;Lf8/k$a;)Ljava/lang/Object;", "state", "k", "(Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;)Lf8/i;", "a", "Lf8/q;", "b", "ModalState", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ModalWorkflow<PropsT, OutputT extends Parcelable, RenderingT, T extends q<? super PropsT, ? extends OutputT, ? extends RenderingT> & InterfaceC0455c> extends k<PropsT, ModalState, OutputT, Object> {

    @NotNull
    private final q childWorkflow;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "Landroid/os/Parcelable;", "()V", "Running", "ShowingModal", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState$Running;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState$ShowingModal;", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class ModalState implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState$Running;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Running extends ModalState {

            @NotNull
            public static final Running d = new Running();

            @NotNull
            public static final Parcelable.Creator<Running> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Running> {
                @Override
                @NotNull
                public final Running createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Running.d;
                }

                @Override
                @NotNull
                public final Running[] newArray(int i) {
                    return new Running[i];
                }
            }

            private Running() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Running);
            }

            public int hashCode() {
                return -1566369824;
            }

            @NotNull
            public String toString() {
                return "Running";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u00012\u00020\u0003BA\u0012\u0006\u0010\u0004\u001a\u00028\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00028\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u0017\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState$ShowingModal;", "Landroid/os/Parcelable;", "OutputT", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "output", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", Title.type, "message", "resumeButtonText", "cancelButtonText", "<init>", "(Landroid/os/Parcelable;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Landroid/os/Parcelable;", "c", "()Landroid/os/Parcelable;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "i", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "v", "b", "w", "y", "a", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ShowingModal<OutputT extends Parcelable> extends ModalState {

            @NotNull
            public static final Parcelable.Creator<ShowingModal<?>> CREATOR = new a();

            @NotNull
            private final OutputT output;

            private final StepStyle styles;

            private final String title;

            private final String message;

            private final String resumeButtonText;

            private final String cancelButtonText;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowingModal<?>> {
                @Override
                @NotNull
                public final ShowingModal<?> createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowingModal<>(parcel.readParcelable(ShowingModal.class.getClassLoader()), (StepStyle) parcel.readParcelable(ShowingModal.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final ShowingModal<?>[] newArray(int i) {
                    return new ShowingModal[i];
                }
            }

            public ShowingModal(@NotNull OutputT outputt, StepStyle stepStyle, String str, String str2, String str3, String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(outputt, "output");
                this.output = outputt;
                this.styles = stepStyle;
                this.title = str;
                this.message = str2;
                this.resumeButtonText = str3;
                this.cancelButtonText = str4;
            }

            public final String getCancelButtonText() {
                return this.cancelButtonText;
            }

            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final OutputT c() {
                return this.output;
            }

            public final String getResumeButtonText() {
                return this.resumeButtonText;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final StepStyle getStyles() {
                return this.styles;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.output, flags);
                parcel.writeParcelable(this.styles, flags);
                parcel.writeString(this.title);
                parcel.writeString(this.message);
                parcel.writeString(this.resumeButtonText);
                parcel.writeString(this.cancelButtonText);
            }
        }

        public ModalState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ModalState() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "a", "(Landroid/os/Parcelable;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends l implements Function1<OutputT, r<? super PropsT, ModalState, ? extends OutputT>> {
        final ModalWorkflow<PropsT, OutputT, RenderingT, T> d;

        @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super PropsT, ModalState, ? extends OutputT>.c, Unit> {
            final OutputT d;

            a(OutputT outputt) {
                super(1);
                this.d = outputt;
            }

            public final void a(@NotNull r<? super PropsT, ModalState, ? extends OutputT>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(this.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super PropsT, ModalState, ? extends OutputT>.c, Unit> {
            final OutputT d;

            b(OutputT outputt) {
                super(1);
                this.d = outputt;
            }

            public final void a(@NotNull r<? super PropsT, ModalState, ? extends OutputT>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                OutputT outputt = this.d;
                cVar.e(new ModalState.ShowingModal(outputt, ((M8.a) outputt).getStyles(), ((M8.a) this.d).getTitle(), ((M8.a) this.d).a(), ((M8.a) this.d).b(), ((M8.a) this.d).c()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends l implements Function1<r<? super PropsT, ModalState, ? extends OutputT>.c, Unit> {
            final OutputT d;

            c(OutputT outputt) {
                super(1);
                this.d = outputt;
            }

            public final void a(@NotNull r<? super PropsT, ModalState, ? extends OutputT>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(this.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        d(ModalWorkflow<PropsT, OutputT, RenderingT, T> modalWorkflow) {
            super(1);
            this.d = modalWorkflow;
        }

        @NotNull
        public final r<PropsT, ModalState, OutputT> invoke(@NotNull OutputT outputt) {
            Intrinsics.checkNotNullParameter(outputt, "output");
            return outputt instanceof M8.a ? ((M8.a) outputt).d() ? z.d(this.d, null, new a(outputt), 1, null) : z.d(this.d, null, new b(outputt), 1, null) : z.d(this.d, null, new c(outputt), 1, null);
        }
    }

    public ModalWorkflow(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "childWorkflow");
        this.childWorkflow = qVar;
    }

    @Override
    @NotNull
    public ModalState d(PropsT props, Snapshot snapshot) {
        if (snapshot != null) {
            h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrJ = hVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.d(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            ModalState modalState = (ModalState) parcelable;
            if (modalState != null) {
                return modalState;
            }
        }
        return ModalState.Running.d;
    }

    @Override
    @NotNull
    public Object f(PropsT renderProps, @NotNull ModalState renderState, @NotNull k<? super PropsT, ModalState, ? extends OutputT, ? extends Object>.a context) throws m {
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object objA = InterfaceC0563a.C0224a.a(context, this.childWorkflow, renderProps, null, new d(this), 4, null);
        if (renderState instanceof ModalState.Running) {
            return new i(objA, CollectionsKt.j(), "CancelModal");
        }
        if (!(renderState instanceof ModalState.ShowingModal)) {
            throw new m();
        }
        ModalState.ShowingModal showingModal = (ModalState.ShowingModal) renderState;
        return j.a(new e(showingModal.getStyles(), new b(this, context, renderState), new c(context, this), showingModal.getTitle(), showingModal.getMessage(), showingModal.getResumeButtonText(), showingModal.getCancelButtonText()), objA, "CancelModal");
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull ModalState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return com.squareup.workflow1.ui.q.a(state);
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function0<Unit> {
        final k<PropsT, ModalState, OutputT, Object>.a d;
        final ModalWorkflow<PropsT, OutputT, RenderingT, T> e;

        @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super PropsT, ModalState, ? extends OutputT>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super PropsT, ModalState, ? extends OutputT>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(ModalState.Running.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(k<? super PropsT, ModalState, ? extends OutputT, ? extends Object>.a aVar, ModalWorkflow<PropsT, OutputT, RenderingT, T> modalWorkflow) {
            super(0);
            this.d = aVar;
            this.e = modalWorkflow;
        }

        public final void m88invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }

        public Object invoke() {
            m88invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function0<Unit> {
        final ModalWorkflow<PropsT, OutputT, RenderingT, T> d;
        final k<PropsT, ModalState, OutputT, Object>.a e;
        final ModalState i;

        @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\u001e\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005*\u00020\u0006*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"PropsT", "Landroid/os/Parcelable;", "OutputT", "", "RenderingT", "Lf8/q;", "La9/c;", "T", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow$ModalState;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super PropsT, ModalState, ? extends OutputT>.c, Unit> {
            final ModalState d;

            a(ModalState modalState) {
                super(1);
                this.d = modalState;
            }

            public final void a(@NotNull r<? super PropsT, ModalState, ? extends OutputT>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                Parcelable parcelableC = ((ModalState.ShowingModal) this.d).c();
                Intrinsics.e(parcelableC, "null cannot be cast to non-null type OutputT of com.withpersona.sdk2.inquiry.modal.ModalWorkflow");
                cVar.d(parcelableC);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(ModalWorkflow<PropsT, OutputT, RenderingT, T> modalWorkflow, k<? super PropsT, ModalState, ? extends OutputT, ? extends Object>.a aVar, ModalState modalState) {
            super(0);
            this.d = modalWorkflow;
            this.e = aVar;
            this.i = modalState;
        }

        public final void m87invoke() {
            ((InterfaceC0455c) ((ModalWorkflow) this.d).childWorkflow).close();
            this.e.b().d(z.d(this.d, null, new a(this.i), 1, null));
        }

        public Object invoke() {
            m87invoke();
            return Unit.a;
        }
    }
}
