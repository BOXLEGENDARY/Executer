package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import ha.C0645f;
import ha.InterfaceC0883h;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.S;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import y8.CaptureTipsViewModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "<init>", "()V", "a", "b", "c", "Overlay", "d", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class Screen {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Landroid/os/Parcelable;", "()V", "Barcode", "CornersOnly", "Custom", "GenericFront", "Passport", "Rectangle", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class Overlay implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Barcode extends Overlay {

            @NotNull
            public static final Barcode d = new Barcode();

            @NotNull
            public static final Parcelable.Creator<Barcode> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Barcode> {
                @Override
                @NotNull
                public final Barcode createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Barcode.d;
                }

                @Override
                @NotNull
                public final Barcode[] newArray(int i) {
                    return new Barcode[i];
                }
            }

            private Barcode() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Barcode);
            }

            public int hashCode() {
                return 1779545178;
            }

            @NotNull
            public String toString() {
                return "Barcode";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CornersOnly extends Overlay {

            @NotNull
            public static final CornersOnly d = new CornersOnly();

            @NotNull
            public static final Parcelable.Creator<CornersOnly> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CornersOnly> {
                @Override
                @NotNull
                public final CornersOnly createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CornersOnly.d;
                }

                @Override
                @NotNull
                public final CornersOnly[] newArray(int i) {
                    return new CornersOnly[i];
                }
            }

            private CornersOnly() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CornersOnly);
            }

            public int hashCode() {
                return 1450323044;
            }

            @NotNull
            public String toString() {
                return "CornersOnly";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "customImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Custom extends Overlay {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            @NotNull
            private final RemoteImageComponent customImage;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Custom> {
                @Override
                @NotNull
                public final Custom createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((RemoteImageComponent) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                @Override
                @NotNull
                public final Custom[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(@NotNull RemoteImageComponent remoteImageComponent) {
                super(null);
                Intrinsics.checkNotNullParameter(remoteImageComponent, "customImage");
                this.customImage = remoteImageComponent;
            }

            @NotNull
            public final RemoteImageComponent getCustomImage() {
                return this.customImage;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.customImage, flags);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class GenericFront extends Overlay {

            @NotNull
            public static final GenericFront d = new GenericFront();

            @NotNull
            public static final Parcelable.Creator<GenericFront> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<GenericFront> {
                @Override
                @NotNull
                public final GenericFront createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GenericFront.d;
                }

                @Override
                @NotNull
                public final GenericFront[] newArray(int i) {
                    return new GenericFront[i];
                }
            }

            private GenericFront() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof GenericFront);
            }

            public int hashCode() {
                return 212467448;
            }

            @NotNull
            public String toString() {
                return "GenericFront";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Passport extends Overlay {

            @NotNull
            public static final Passport d = new Passport();

            @NotNull
            public static final Parcelable.Creator<Passport> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Passport> {
                @Override
                @NotNull
                public final Passport createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Passport.d;
                }

                @Override
                @NotNull
                public final Passport[] newArray(int i) {
                    return new Passport[i];
                }
            }

            private Passport() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Passport);
            }

            public int hashCode() {
                return -1995687048;
            }

            @NotNull
            public String toString() {
                return "Passport";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Rectangle extends Overlay {

            @NotNull
            public static final Rectangle d = new Rectangle();

            @NotNull
            public static final Parcelable.Creator<Rectangle> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Rectangle> {
                @Override
                @NotNull
                public final Rectangle createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Rectangle.d;
                }

                @Override
                @NotNull
                public final Rectangle[] newArray(int i) {
                    return new Rectangle[i];
                }
            }

            private Rectangle() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Rectangle);
            }

            public int hashCode() {
                return 319154889;
            }

            @NotNull
            public String toString() {
                return "Rectangle";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public Overlay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Overlay() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b.\u00106R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b)\u00106R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b,\u00105\u001a\u0004\b*\u00106¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Ln9/S;", "countrySelectComponent", "idClassSelectComponent", "countryInputTitle", "idClassInputTitle", "continueButtonText", "", "isContinueEnabled", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onCountrySelected", "onIdClassSelected", "Lkotlin/Function0;", "onContinueClick", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ln9/S;Ln9/S;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "c", "Ln9/S;", "()Ln9/S;", "d", "e", "f", "g", "h", "Z", "n", "()Z", "i", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends Screen {

        private final String title;

        private final StepStyles.GovernmentIdStepStyle styles;

        @NotNull
        private final S countrySelectComponent;

        @NotNull
        private final S idClassSelectComponent;

        private final String countryInputTitle;

        private final String idClassInputTitle;

        private final String continueButtonText;

        private final boolean isContinueEnabled;

        @NotNull
        private final NavigationState navigationState;

        @NotNull
        private final Function1<Option, Unit> onCountrySelected;

        @NotNull
        private final Function1<Option, Unit> onIdClassSelected;

        @NotNull
        private final Function0<Unit> onContinueClick;

        @NotNull
        private final Function0<Unit> onBackClick;

        @NotNull
        private final Function0<Unit> onCancelClick;

        public a(String str, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull S s, @NotNull S s2, String str2, String str3, String str4, boolean z, @NotNull NavigationState navigationState, @NotNull Function1<? super Option, Unit> function1, @NotNull Function1<? super Option, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            super(null);
            Intrinsics.checkNotNullParameter(s, "countrySelectComponent");
            Intrinsics.checkNotNullParameter(s2, "idClassSelectComponent");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(function1, "onCountrySelected");
            Intrinsics.checkNotNullParameter(function12, "onIdClassSelected");
            Intrinsics.checkNotNullParameter(function0, "onContinueClick");
            Intrinsics.checkNotNullParameter(function02, "onBackClick");
            Intrinsics.checkNotNullParameter(function03, "onCancelClick");
            this.title = str;
            this.styles = governmentIdStepStyle;
            this.countrySelectComponent = s;
            this.idClassSelectComponent = s2;
            this.countryInputTitle = str2;
            this.idClassInputTitle = str3;
            this.continueButtonText = str4;
            this.isContinueEnabled = z;
            this.navigationState = navigationState;
            this.onCountrySelected = function1;
            this.onIdClassSelected = function12;
            this.onContinueClick = function0;
            this.onBackClick = function02;
            this.onCancelClick = function03;
        }

        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        public final String getCountryInputTitle() {
            return this.countryInputTitle;
        }

        @NotNull
        public final S getCountrySelectComponent() {
            return this.countrySelectComponent;
        }

        public final String getIdClassInputTitle() {
            return this.idClassInputTitle;
        }

        @NotNull
        public final S getIdClassSelectComponent() {
            return this.idClassSelectComponent;
        }

        @NotNull
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> g() {
            return this.onBackClick;
        }

        @NotNull
        public final Function0<Unit> h() {
            return this.onCancelClick;
        }

        @NotNull
        public final Function0<Unit> i() {
            return this.onContinueClick;
        }

        @NotNull
        public final Function1<Option, Unit> j() {
            return this.onCountrySelected;
        }

        @NotNull
        public final Function1<Option, Unit> k() {
            return this.onIdClassSelected;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean getIsContinueEnabled() {
            return this.isContinueEnabled;
        }
    }

    @Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\u0018\u00002\u00020\u0001:\u0001CBÇ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012 \b\u0002\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012 \b\u0002\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#\u0012\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#j\u0002`&\u0012\u0006\u0010(\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010-\u001a\u00020\u0018\u0012\u001a\b\u0002\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0018\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00103\u001a\u00020\u0018\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010;\u001a\u00020\u0018\u0012\u0006\u0010<\u001a\u00020\u0018\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R/\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\bM\u0010_\u001a\u0004\b`\u0010aR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\bY\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bS\u0010dR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bO\u0010hR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006¢\u0006\f\n\u0004\bc\u0010i\u001a\u0004\bI\u0010jR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bJ\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bK\u0010pR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR/\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\bu\u0010_\u001a\u0004\bG\u0010aR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#8\u0006¢\u0006\f\n\u0004\bU\u0010v\u001a\u0004\bw\u0010xR'\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#j\u0002`&8\u0006¢\u0006\f\n\u0004\by\u0010v\u001a\u0004\bz\u0010xR\u0017\u0010(\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010o\u001a\u0004\b{\u0010pR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\b|\u0010b\u001a\u0004\by\u0010dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0006¢\u0006\f\n\u0004\bH\u0010b\u001a\u0004\bf\u0010dR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b]\u0010}\u001a\u0004\b~\u0010\u007fR\u0017\u0010-\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bz\u0010g\u001a\u0004\bq\u0010hR*\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\r\n\u0004\bw\u0010_\u001a\u0005\b\u0080\u0001\u0010aR\u0018\u00100\u001a\u00020\u00188\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010g\u001a\u0004\bn\u0010hR\u0019\u00102\u001a\u0002018\u0006¢\u0006\u000e\n\u0005\bQ\u0010\u0081\u0001\u001a\u0005\b|\u0010\u0082\u0001R\u0018\u00103\u001a\u00020\u00188\u0006¢\u0006\r\n\u0004\b{\u0010g\u001a\u0005\b\u0083\u0001\u0010hR\u001a\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010D\u001a\u0004\bu\u0010FR\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\bl\u0010\u0084\u0001\u001a\u0005\be\u0010\u0085\u0001R\u001c\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\u000f\n\u0005\bs\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010:\u001a\u0004\u0018\u0001098\u0006¢\u0006\u000e\n\u0005\bE\u0010\u0089\u0001\u001a\u0005\bC\u0010\u008a\u0001R\u0018\u0010;\u001a\u00020\u00188\u0006¢\u0006\r\n\u0004\b~\u0010g\u001a\u0005\b\u0081\u0001\u0010hR\u0018\u0010<\u001a\u00020\u00188\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010g\u001a\u0004\bo\u0010hR\u0019\u0010>\u001a\u00020=8\u0006¢\u0006\u000e\n\u0005\bo\u0010\u008b\u0001\u001a\u0005\b[\u0010\u008c\u0001R\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u008d\u0001\u001a\u0005\bW\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "message", "disclaimer", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "LB8/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "autoCaptureRules", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "state", "", "autoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "remainingCaptureCount", "manualCaptureClicked", "checkPermissions", "Lp8/a;", "videoCaptureMethod", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "enableAnalyzer", "", "maxRecordingLengthMs", "showFinalizeUi", "hintText", "Ly8/e;", "captureTips", "LA9/a;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "isEnabled", "isAudioRequired", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;LB8/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lp8/a;ZLkotlin/jvm/functions/Function2;ZJZLjava/lang/String;Ly8/e;LA9/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/camera/b$a;Ln8/f$a;)V", "a", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "b", "v", "c", "n", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "i", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "A", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "f", "LB8/b;", "r", "()LB8/b;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "j", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "h", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "w", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function2;", "t", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "m", "()Lkotlin/jvm/functions/Function0;", "k", "l", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "D", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "o", "I", "()I", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "E", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "q", "Lkotlin/jvm/functions/Function1;", "y", "()Lkotlin/jvm/functions/Function1;", "s", "x", "B", "u", "Lp8/a;", "G", "()Lp8/a;", "z", "J", "()J", "C", "Ly8/e;", "()Ly8/e;", "LA9/a;", "H", "()LA9/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Lcom/withpersona/sdk2/camera/b$a;", "()Lcom/withpersona/sdk2/camera/b$a;", "Ln8/f$a;", "()Ln8/f$a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends Screen {

        private final long maxRecordingLengthMs;

        private final boolean showFinalizeUi;

        private final String hintText;

        private final CaptureTipsViewModel captureTips;

        private final A9.a webRtcManager;

        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        private final boolean isEnabled;

        private final boolean isAudioRequired;

        @NotNull
        private final b.a cameraXControllerFactory;

        @NotNull
        private final C0645f.a camera2ManagerFactoryFactory;

        @NotNull
        private final String title;

        @NotNull
        private final String message;

        @NotNull
        private final String disclaimer;

        @NotNull
        private final a captureButtonState;

        @NotNull
        private final Overlay overlay;

        @NotNull
        private final bb.b idClass;

        @NotNull
        private final IdConfig.b captureSide;

        @NotNull
        private final NavigationState navigationState;

        @NotNull
        private final Function2<List<String>, CameraProperties, Unit> manuallyCapture;

        @NotNull
        private final Function0<Unit> close;

        @NotNull
        private final Function0<Unit> back;

        private final boolean autoCapturing;

        @NotNull
        private final List<AutoCaptureRule> autoCaptureRules;

        @NotNull
        private final GovernmentIdState state;

        private final int autoCaptureRulesId;

        private final StepStyles.GovernmentIdStepStyle styles;

        @NotNull
        private final Function2<List<String>, CameraProperties, Unit> autoCapture;

        @NotNull
        private final Function1<Throwable, Unit> onCaptureError;

        @NotNull
        private final Function1<Throwable, Unit> onCameraError;

        private final int remainingCaptureCount;

        @NotNull
        private final Function0<Unit> manualCaptureClicked;

        @NotNull
        private final Function0<Unit> checkPermissions;

        @NotNull
        private final EnumC0732a videoCaptureMethod;

        private final boolean finalizeLocalVideo;

        @NotNull
        private final Function2<File, CameraProperties, Unit> onLocalVideoFinalized;

        private final boolean enableAnalyzer;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a {
            public static final a d = new a("Disabled", 0);
            public static final a e = new a("Enabled", 1);
            public static final a i = new a("Hidden", 2);
            private static final a[] v;
            private static final T9.a w;

            static {
                a[] aVarArrC = c();
                v = aVarArrC;
                w = T9.b.a(aVarArrC);
            }

            private a(String str, int i2) {
            }

            private static final a[] c() {
                return new a[]{d, e, i};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) v.clone();
            }
        }

        public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull a aVar, @NotNull Overlay overlay, @NotNull bb.b bVar, @NotNull IdConfig.b bVar2, @NotNull NavigationState navigationState, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, boolean z, @NotNull List<? extends AutoCaptureRule> list, @NotNull GovernmentIdState governmentIdState, int i, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> function22, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, int i2, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull EnumC0732a enumC0732a, boolean z2, @NotNull Function2<? super File, ? super CameraProperties, Unit> function23, boolean z3, long j, boolean z4, String str4, CaptureTipsViewModel eVar, A9.a aVar2, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z5, boolean z6, @NotNull b.a aVar3, @NotNull C0645f.a aVar4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, Title.type);
            Intrinsics.checkNotNullParameter(str2, "message");
            Intrinsics.checkNotNullParameter(str3, "disclaimer");
            Intrinsics.checkNotNullParameter(aVar, "captureButtonState");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(bVar, "idClass");
            Intrinsics.checkNotNullParameter(bVar2, "captureSide");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(function2, "manuallyCapture");
            Intrinsics.checkNotNullParameter(function0, "close");
            Intrinsics.checkNotNullParameter(function02, "back");
            Intrinsics.checkNotNullParameter(list, "autoCaptureRules");
            Intrinsics.checkNotNullParameter(governmentIdState, "state");
            Intrinsics.checkNotNullParameter(function22, "autoCapture");
            Intrinsics.checkNotNullParameter(function1, "onCaptureError");
            Intrinsics.checkNotNullParameter(function12, "onCameraError");
            Intrinsics.checkNotNullParameter(function03, "manualCaptureClicked");
            Intrinsics.checkNotNullParameter(function04, "checkPermissions");
            Intrinsics.checkNotNullParameter(enumC0732a, "videoCaptureMethod");
            Intrinsics.checkNotNullParameter(function23, "onLocalVideoFinalized");
            Intrinsics.checkNotNullParameter(aVar3, "cameraXControllerFactory");
            Intrinsics.checkNotNullParameter(aVar4, "camera2ManagerFactoryFactory");
            this.title = str;
            this.message = str2;
            this.disclaimer = str3;
            this.captureButtonState = aVar;
            this.overlay = overlay;
            this.idClass = bVar;
            this.captureSide = bVar2;
            this.navigationState = navigationState;
            this.manuallyCapture = function2;
            this.close = function0;
            this.back = function02;
            this.autoCapturing = z;
            this.autoCaptureRules = list;
            this.state = governmentIdState;
            this.autoCaptureRulesId = i;
            this.styles = governmentIdStepStyle;
            this.autoCapture = function22;
            this.onCaptureError = function1;
            this.onCameraError = function12;
            this.remainingCaptureCount = i2;
            this.manualCaptureClicked = function03;
            this.checkPermissions = function04;
            this.videoCaptureMethod = enumC0732a;
            this.finalizeLocalVideo = z2;
            this.onLocalVideoFinalized = function23;
            this.enableAnalyzer = z3;
            this.maxRecordingLengthMs = j;
            this.showFinalizeUi = z4;
            this.hintText = str4;
            this.captureTips = eVar;
            this.webRtcManager = aVar2;
            this.assetConfig = capturePage;
            this.isEnabled = z5;
            this.isAudioRequired = z6;
            this.cameraXControllerFactory = aVar3;
            this.camera2ManagerFactoryFactory = aVar4;
        }

        @NotNull
        public final Overlay getOverlay() {
            return this.overlay;
        }

        public final int getRemainingCaptureCount() {
            return this.remainingCaptureCount;
        }

        public final boolean getShowFinalizeUi() {
            return this.showFinalizeUi;
        }

        @NotNull
        public final GovernmentIdState getState() {
            return this.state;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final EnumC0732a getVideoCaptureMethod() {
            return this.videoCaptureMethod;
        }

        public final A9.a getWebRtcManager() {
            return this.webRtcManager;
        }

        public final boolean getIsAudioRequired() {
            return this.isAudioRequired;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final Function2<List<String>, CameraProperties, Unit> b() {
            return this.autoCapture;
        }

        @NotNull
        public final List<AutoCaptureRule> c() {
            return this.autoCaptureRules;
        }

        public final int getAutoCaptureRulesId() {
            return this.autoCaptureRulesId;
        }

        public final boolean getAutoCapturing() {
            return this.autoCapturing;
        }

        @NotNull
        public final Function0<Unit> f() {
            return this.back;
        }

        @NotNull
        public final C0645f.a getCamera2ManagerFactoryFactory() {
            return this.camera2ManagerFactoryFactory;
        }

        @NotNull
        public final b.a getCameraXControllerFactory() {
            return this.cameraXControllerFactory;
        }

        @NotNull
        public final a getCaptureButtonState() {
            return this.captureButtonState;
        }

        @NotNull
        public final IdConfig.b getCaptureSide() {
            return this.captureSide;
        }

        public final CaptureTipsViewModel getCaptureTips() {
            return this.captureTips;
        }

        @NotNull
        public final Function0<Unit> l() {
            return this.checkPermissions;
        }

        @NotNull
        public final Function0<Unit> m() {
            return this.close;
        }

        @NotNull
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final boolean getEnableAnalyzer() {
            return this.enableAnalyzer;
        }

        public final boolean getFinalizeLocalVideo() {
            return this.finalizeLocalVideo;
        }

        public final String getHintText() {
            return this.hintText;
        }

        @NotNull
        public final bb.b getIdClass() {
            return this.idClass;
        }

        @NotNull
        public final Function0<Unit> s() {
            return this.manualCaptureClicked;
        }

        @NotNull
        public final Function2<List<String>, CameraProperties, Unit> t() {
            return this.manuallyCapture;
        }

        public final long getMaxRecordingLengthMs() {
            return this.maxRecordingLengthMs;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function1<Throwable, Unit> x() {
            return this.onCameraError;
        }

        @NotNull
        public final Function1<Throwable, Unit> y() {
            return this.onCaptureError;
        }

        @NotNull
        public final Function2<File, CameraProperties, Unit> z() {
            return this.onLocalVideoFinalized;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u001d\u00105R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b+\u0010:R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b/\u0010:R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b%\u0010 R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b3\u0010:¨\u0006;"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "prompt", "chooseText", "disclaimer", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "enabledIdClasses", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "selectIdClass", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "", "isEnabled", "Lkotlin/Function0;", "onBack", "onCancel", "error", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "j", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Z", "n", "()Z", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c extends Screen {

        @NotNull
        private final String title;

        @NotNull
        private final String prompt;

        @NotNull
        private final String chooseText;

        @NotNull
        private final String disclaimer;

        @NotNull
        private final List<EnabledIdClass> enabledIdClasses;

        @NotNull
        private final NavigationState navigationState;

        @NotNull
        private final Function1<IdConfig, Unit> selectIdClass;

        private final StepStyles.GovernmentIdStepStyle styles;

        private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

        private final boolean isEnabled;

        @NotNull
        private final Function0<Unit> onBack;

        @NotNull
        private final Function0<Unit> onCancel;

        private final String error;

        @NotNull
        private final Function0<Unit> onErrorDismissed;

        public c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<EnabledIdClass> list, @NotNull NavigationState navigationState, @NotNull Function1<? super IdConfig, Unit> function1, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, String str5, @NotNull Function0<Unit> function03) {
            super(null);
            Intrinsics.checkNotNullParameter(str, Title.type);
            Intrinsics.checkNotNullParameter(str2, "prompt");
            Intrinsics.checkNotNullParameter(str3, "chooseText");
            Intrinsics.checkNotNullParameter(str4, "disclaimer");
            Intrinsics.checkNotNullParameter(list, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(function1, "selectIdClass");
            Intrinsics.checkNotNullParameter(function0, "onBack");
            Intrinsics.checkNotNullParameter(function02, "onCancel");
            Intrinsics.checkNotNullParameter(function03, "onErrorDismissed");
            this.title = str;
            this.prompt = str2;
            this.chooseText = str3;
            this.disclaimer = str4;
            this.enabledIdClasses = list;
            this.navigationState = navigationState;
            this.selectIdClass = function1;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z;
            this.onBack = function0;
            this.onCancel = function02;
            this.error = str5;
            this.onErrorDismissed = function03;
        }

        public final NextStep.GovernmentId.AssetConfig.SelectPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final String getChooseText() {
            return this.chooseText;
        }

        @NotNull
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<EnabledIdClass> d() {
            return this.enabledIdClasses;
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> g() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> h() {
            return this.onCancel;
        }

        @NotNull
        public final Function0<Unit> i() {
            return this.onErrorDismissed;
        }

        @NotNull
        public final String getPrompt() {
            return this.prompt;
        }

        @NotNull
        public final Function1<IdConfig, Unit> k() {
            return this.selectIdClass;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b/\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b%\u0010@R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b)\u0010,R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\bA\u0010@R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\bB\u0010,R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b5\u0010,R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\b3\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\b;\u0010,R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010@R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b-\u0010IR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010 \u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bM\u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bK\u0010N\u001a\u0004\bG\u0010O¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lz1/h;", "imageLoader", "", "message", "disclaimer", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "imagePath", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "LB8/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "acceptImage", "acceptText", "retryImage", "retryText", "confirmCaptureTitle", "close", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "", "isEnabled", "isAutoClassifying", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "<init>", "(Lz1/h;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;LB8/b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "a", "Lz1/h;", "j", "()Lz1/h;", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "g", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "o", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "e", "k", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "LB8/b;", "i", "()LB8/b;", "h", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "m", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "p", "q", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Z", "u", "()Z", "t", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d extends Screen {

        @NotNull
        private final InterfaceC0883h imageLoader;

        @NotNull
        private final String message;

        @NotNull
        private final String disclaimer;

        @NotNull
        private final Overlay overlay;

        @NotNull
        private final String imagePath;

        @NotNull
        private final IdConfig.b captureSide;

        @NotNull
        private final bb.b idClass;

        @NotNull
        private final NavigationState navigationState;

        @NotNull
        private final Function0<Unit> acceptImage;

        @NotNull
        private final String acceptText;

        @NotNull
        private final Function0<Unit> retryImage;

        @NotNull
        private final String retryText;

        @NotNull
        private final String confirmCaptureTitle;

        @NotNull
        private final Function0<Unit> close;

        private final StepStyles.GovernmentIdStepStyle styles;

        private final String error;

        @NotNull
        private final Function0<Unit> onErrorDismissed;

        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        private final boolean isEnabled;

        private final boolean isAutoClassifying;

        @NotNull
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        public d(@NotNull InterfaceC0883h interfaceC0883h, @NotNull String str, @NotNull String str2, @NotNull Overlay overlay, @NotNull String str3, @NotNull IdConfig.b bVar, @NotNull bb.b bVar2, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull String str4, @NotNull Function0<Unit> function02, @NotNull String str5, @NotNull String str6, @NotNull Function0<Unit> function03, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str7, @NotNull Function0<Unit> function04, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z, boolean z2, @NotNull StyleElements.Axis axis) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(str2, "disclaimer");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(str3, "imagePath");
            Intrinsics.checkNotNullParameter(bVar, "captureSide");
            Intrinsics.checkNotNullParameter(bVar2, "idClass");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(function0, "acceptImage");
            Intrinsics.checkNotNullParameter(str4, "acceptText");
            Intrinsics.checkNotNullParameter(function02, "retryImage");
            Intrinsics.checkNotNullParameter(str5, "retryText");
            Intrinsics.checkNotNullParameter(str6, "confirmCaptureTitle");
            Intrinsics.checkNotNullParameter(function03, "close");
            Intrinsics.checkNotNullParameter(function04, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(axis, "reviewCaptureButtonsAxis");
            this.imageLoader = interfaceC0883h;
            this.message = str;
            this.disclaimer = str2;
            this.overlay = overlay;
            this.imagePath = str3;
            this.captureSide = bVar;
            this.idClass = bVar2;
            this.navigationState = navigationState;
            this.acceptImage = function0;
            this.acceptText = str4;
            this.retryImage = function02;
            this.retryText = str5;
            this.confirmCaptureTitle = str6;
            this.close = function03;
            this.styles = governmentIdStepStyle;
            this.error = str7;
            this.onErrorDismissed = function04;
            this.assetConfig = capturePage;
            this.isEnabled = z;
            this.isAutoClassifying = z2;
            this.reviewCaptureButtonsAxis = axis;
        }

        @NotNull
        public final Function0<Unit> a() {
            return this.acceptImage;
        }

        @NotNull
        public final String getAcceptText() {
            return this.acceptText;
        }

        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final IdConfig.b getCaptureSide() {
            return this.captureSide;
        }

        @NotNull
        public final Function0<Unit> e() {
            return this.close;
        }

        @NotNull
        public final String getConfirmCaptureTitle() {
            return this.confirmCaptureTitle;
        }

        @NotNull
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final bb.b getIdClass() {
            return this.idClass;
        }

        @NotNull
        public final InterfaceC0883h getImageLoader() {
            return this.imageLoader;
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> n() {
            return this.onErrorDismissed;
        }

        @NotNull
        public final Overlay getOverlay() {
            return this.overlay;
        }

        @NotNull
        public final Function0<Unit> p() {
            return this.retryImage;
        }

        @NotNull
        public final String getRetryText() {
            return this.retryText;
        }

        @NotNull
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "f", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e extends Screen {

        @NotNull
        private final String title;

        @NotNull
        private final String description;

        private final StepStyles.GovernmentIdStepStyle styles;

        private final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;

        @NotNull
        private final NavigationState navigationState;

        @NotNull
        private final Function0<Unit> onBack;

        @NotNull
        private final Function0<Unit> onCancel;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        public e(@NotNull String str, @NotNull String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull PendingPageTextPosition pendingPageTextPosition) {
            super(null);
            Intrinsics.checkNotNullParameter(str, Title.type);
            Intrinsics.checkNotNullParameter(str2, "description");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(function0, "onBack");
            Intrinsics.checkNotNullParameter(function02, "onCancel");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            this.title = str;
            this.description = str2;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = function0;
            this.onCancel = function02;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
        }

        public final NextStep.GovernmentId.AssetConfig.PendingPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> d() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> e() {
            return this.onCancel;
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }

    public Screen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Screen() {
    }
}
