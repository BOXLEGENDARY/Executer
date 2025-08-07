package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v8.EnumC0820A;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u00044560B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b$\u00103¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Landroid/os/Parcelable;", "", "idClassKey", "Lv8/A;", "icon", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "sideConfigs", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "LB8/b;", "type", "<init>", "(Ljava/lang/String;Lv8/A;Ljava/util/List;Ljava/util/List;LB8/b;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "c", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "N", "e", "Lv8/A;", "a", "()Lv8/A;", "i", "Ljava/util/List;", "getSideConfigs", "()Ljava/util/List;", "v", "b", "w", "LB8/b;", "()LB8/b;", "AutoCaptureConfig", "IdSideConfig", "ManualCaptureConfig", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class IdConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IdConfig> CREATOR = new a();

    @NotNull
    private final String idClassKey;

    @NotNull
    private final EnumC0820A icon;

    @NotNull
    private final List<IdSideConfig> sideConfigs;

    @NotNull
    private final List<IdPart> parts;

    @NotNull
    private final bb.b type;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "ruleSet", "<init>", "(Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "a", "()Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AutoCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new a();

        @NotNull
        private final AutoCaptureRuleSet ruleSet;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoCaptureConfig> {
            @Override
            @NotNull
            public final AutoCaptureConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoCaptureConfig((AutoCaptureRuleSet) parcel.readParcelable(AutoCaptureConfig.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final AutoCaptureConfig[] newArray(int i) {
                return new AutoCaptureConfig[i];
            }
        }

        public AutoCaptureConfig() {
            AutoCaptureRuleSet autoCaptureRuleSet = null;
            this(autoCaptureRuleSet, 1, autoCaptureRuleSet);
        }

        @NotNull
        public final AutoCaptureRuleSet getRuleSet() {
            return this.ruleSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && Intrinsics.b(this.ruleSet, ((AutoCaptureConfig) other).ruleSet);
        }

        public int hashCode() {
            return this.ruleSet.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoCaptureConfig(ruleSet=" + this.ruleSet + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.ruleSet, flags);
        }

        public AutoCaptureConfig(@NotNull AutoCaptureRuleSet autoCaptureRuleSet) {
            Intrinsics.checkNotNullParameter(autoCaptureRuleSet, "ruleSet");
            this.ruleSet = autoCaptureRuleSet;
        }

        public AutoCaptureConfig(AutoCaptureRuleSet autoCaptureRuleSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new AutoCaptureRuleSet(null, 1, null) : autoCaptureRuleSet);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Landroid/os/Parcelable;", "", "sideKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "autoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "manualCaptureConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "f", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "c", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "b", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdSideConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdSideConfig> CREATOR = new a();

        @NotNull
        private final String sideKey;

        @NotNull
        private final b side;

        @NotNull
        private final Screen.Overlay overlay;

        @NotNull
        private final AutoCaptureConfig autoCaptureConfig;

        @NotNull
        private final ManualCaptureConfig manualCaptureConfig;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdSideConfig> {
            @Override
            @NotNull
            public final IdSideConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdSideConfig(parcel.readString(), b.valueOf(parcel.readString()), (Screen.Overlay) parcel.readParcelable(IdSideConfig.class.getClassLoader()), AutoCaptureConfig.CREATOR.createFromParcel(parcel), ManualCaptureConfig.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final IdSideConfig[] newArray(int i) {
                return new IdSideConfig[i];
            }
        }

        public IdSideConfig(@NotNull String str, @NotNull b bVar, @NotNull Screen.Overlay overlay, @NotNull AutoCaptureConfig autoCaptureConfig, @NotNull ManualCaptureConfig manualCaptureConfig) {
            Intrinsics.checkNotNullParameter(str, "sideKey");
            Intrinsics.checkNotNullParameter(bVar, "side");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(autoCaptureConfig, "autoCaptureConfig");
            Intrinsics.checkNotNullParameter(manualCaptureConfig, "manualCaptureConfig");
            this.sideKey = str;
            this.side = bVar;
            this.overlay = overlay;
            this.autoCaptureConfig = autoCaptureConfig;
            this.manualCaptureConfig = manualCaptureConfig;
        }

        @NotNull
        public final AutoCaptureConfig getAutoCaptureConfig() {
            return this.autoCaptureConfig;
        }

        @NotNull
        public final ManualCaptureConfig getManualCaptureConfig() {
            return this.manualCaptureConfig;
        }

        @NotNull
        public final Screen.Overlay getOverlay() {
            return this.overlay;
        }

        @NotNull
        public final b getSide() {
            return this.side;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdSideConfig)) {
                return false;
            }
            IdSideConfig idSideConfig = (IdSideConfig) other;
            return Intrinsics.b(this.sideKey, idSideConfig.sideKey) && this.side == idSideConfig.side && Intrinsics.b(this.overlay, idSideConfig.overlay) && Intrinsics.b(this.autoCaptureConfig, idSideConfig.autoCaptureConfig) && Intrinsics.b(this.manualCaptureConfig, idSideConfig.manualCaptureConfig);
        }

        @NotNull
        public final String getSideKey() {
            return this.sideKey;
        }

        public int hashCode() {
            return (((((((this.sideKey.hashCode() * 31) + this.side.hashCode()) * 31) + this.overlay.hashCode()) * 31) + this.autoCaptureConfig.hashCode()) * 31) + this.manualCaptureConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdSideConfig(sideKey=" + this.sideKey + ", side=" + this.side + ", overlay=" + this.overlay + ", autoCaptureConfig=" + this.autoCaptureConfig + ", manualCaptureConfig=" + this.manualCaptureConfig + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.sideKey);
            parcel.writeString(this.side.name());
            parcel.writeParcelable(this.overlay, flags);
            this.autoCaptureConfig.writeToParcel(parcel, flags);
            this.manualCaptureConfig.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "", "delayMs", "<init>", "(ZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "b", "()Z", "e", "J", "a", "()J", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ManualCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new a();

        private final boolean isEnabled;

        private final long delayMs;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ManualCaptureConfig> {
            @Override
            @NotNull
            public final ManualCaptureConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualCaptureConfig(parcel.readInt() != 0, parcel.readLong());
            }

            @Override
            @NotNull
            public final ManualCaptureConfig[] newArray(int i) {
                return new ManualCaptureConfig[i];
            }
        }

        public ManualCaptureConfig(boolean z, long j) {
            this.isEnabled = z;
            this.delayMs = j;
        }

        public final long getDelayMs() {
            return this.delayMs;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return this.isEnabled == manualCaptureConfig.isEnabled && this.delayMs == manualCaptureConfig.delayMs;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEnabled) * 31) + Long.hashCode(this.delayMs);
        }

        @NotNull
        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isEnabled ? 1 : 0);
            parcel.writeLong(this.delayMs);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IdConfig> {
        @Override
        @NotNull
        public final IdConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            EnumC0820A enumC0820AValueOf = EnumC0820A.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IdSideConfig.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(IdConfig.class.getClassLoader()));
            }
            return new IdConfig(string, enumC0820AValueOf, arrayList, arrayList2, bb.b.valueOf(parcel.readString()));
        }

        @Override
        @NotNull
        public final IdConfig[] newArray(int i) {
            return new IdConfig[i];
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "d", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "b", "v", "w", "y", "z", "A", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        private static final b[] B;
        private static final T9.a C;

        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final P9.h<Map<String, b>> i;

        @NotNull
        private final String key;
        public static final b v = new b("Front", 0, "front");
        public static final b w = new b("Back", 1, "back");
        public static final b y = new b("FrontOrBack", 2, "front_or_back");
        public static final b z = new b("BarcodePdf417", 3, "barcode_pdf417");
        public static final b A = new b("PassportSignature", 4, "passport_signature");

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function0<Map<String, ? extends b>> {
            public static final a d = new a();

            a() {
                super(0);
            }

            @NotNull
            public final Map<String, b> invoke() {
                b[] bVarArrValues = b.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(bVarArrValues.length), 16));
                for (b bVar : bVarArrValues) {
                    linkedHashMap.put(bVar.getKey(), bVar);
                }
                return linkedHashMap;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$b;", "", "<init>", "()V", "", "sideKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "a", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "", "sideKeyToSide$delegate", "LP9/h;", "b", "()Ljava/util/Map;", "sideKeyToSide", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final Map<String, b> b() {
                return (Map) b.i.getValue();
            }

            public final b a(@NotNull String sideKey) {
                Intrinsics.checkNotNullParameter(sideKey, "sideKey");
                return b().get(sideKey);
            }

            private Companion() {
            }
        }

        static {
            b[] bVarArrC = c();
            B = bVarArrC;
            C = T9.b.a(bVarArrC);
            INSTANCE = new Companion(null);
            i = P9.i.b(a.d);
        }

        private b(String str, int i2, String str2) {
            this.key = str2;
        }

        private static final b[] c() {
            return new b[]{v, w, y, z, A};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) B.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public IdConfig(@NotNull String str, @NotNull EnumC0820A enumC0820A, @NotNull List<IdSideConfig> list, @NotNull List<? extends IdPart> list2, @NotNull bb.b bVar) {
        Intrinsics.checkNotNullParameter(str, "idClassKey");
        Intrinsics.checkNotNullParameter(enumC0820A, "icon");
        Intrinsics.checkNotNullParameter(list, "sideConfigs");
        Intrinsics.checkNotNullParameter(list2, "parts");
        Intrinsics.checkNotNullParameter(bVar, "type");
        this.idClassKey = str;
        this.icon = enumC0820A;
        this.sideConfigs = list;
        this.parts = list2;
        this.type = bVar;
    }

    @NotNull
    public final String getIdClassKey() {
        return this.idClassKey;
    }

    @NotNull
    public final EnumC0820A getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<IdPart> b() {
        return this.parts;
    }

    @NotNull
    public final IdSideConfig c(@NotNull b side) {
        Intrinsics.checkNotNullParameter(side, "side");
        for (IdSideConfig idSideConfig : this.sideConfigs) {
            if (idSideConfig.getSide() == side) {
                return idSideConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public final bb.b getType() {
        return this.type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfig)) {
            return false;
        }
        IdConfig idConfig = (IdConfig) other;
        return Intrinsics.b(this.idClassKey, idConfig.idClassKey) && this.icon == idConfig.icon && Intrinsics.b(this.sideConfigs, idConfig.sideConfigs) && Intrinsics.b(this.parts, idConfig.parts) && this.type == idConfig.type;
    }

    public int hashCode() {
        return (((((((this.idClassKey.hashCode() * 31) + this.icon.hashCode()) * 31) + this.sideConfigs.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "IdConfig(idClassKey=" + this.idClassKey + ", icon=" + this.icon + ", sideConfigs=" + this.sideConfigs + ", parts=" + this.parts + ", type=" + this.type + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.idClassKey);
        parcel.writeString(this.icon.name());
        List<IdSideConfig> list = this.sideConfigs;
        parcel.writeInt(list.size());
        Iterator<IdSideConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        List<IdPart> list2 = this.parts;
        parcel.writeInt(list2.size());
        Iterator<IdPart> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), flags);
        }
        parcel.writeString(this.type.name());
    }
}
