package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Landroid/os/Parcelable;", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "LP8/b;", "enabledDataGroups", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getCardAccessNumber", "e", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "getMrzKey", "()Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "i", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "getPassportNfcStrings", "()Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "v", "Ljava/util/List;", "getEnabledDataGroups", "()Ljava/util/List;", "w", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "y", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PassportNfcReaderConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PassportNfcReaderConfig> CREATOR = new a();

    @NotNull
    private final String cardAccessNumber;

    @NotNull
    private final MrzKey mrzKey;

    @NotNull
    private final PassportNfcStrings passportNfcStrings;

    @NotNull
    private final List<P8.b> enabledDataGroups;

    private final Integer theme;

    private final StepStyles.UiStepStyle styles;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportNfcReaderConfig> {
        @Override
        @NotNull
        public final PassportNfcReaderConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            MrzKey mrzKeyCreateFromParcel = MrzKey.CREATOR.createFromParcel(parcel);
            PassportNfcStrings passportNfcStringsCreateFromParcel = PassportNfcStrings.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(P8.b.valueOf(parcel.readString()));
            }
            return new PassportNfcReaderConfig(string, mrzKeyCreateFromParcel, passportNfcStringsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final PassportNfcReaderConfig[] newArray(int i) {
            return new PassportNfcReaderConfig[i];
        }
    }

    public PassportNfcReaderConfig(@NotNull String str, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends P8.b> list, Integer num, StepStyles.UiStepStyle uiStepStyle) {
        Intrinsics.checkNotNullParameter(str, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(list, "enabledDataGroups");
        this.cardAccessNumber = str;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = list;
        this.theme = num;
        this.styles = uiStepStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcReaderConfig)) {
            return false;
        }
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) other;
        return Intrinsics.b(this.cardAccessNumber, passportNfcReaderConfig.cardAccessNumber) && Intrinsics.b(this.mrzKey, passportNfcReaderConfig.mrzKey) && Intrinsics.b(this.passportNfcStrings, passportNfcReaderConfig.passportNfcStrings) && Intrinsics.b(this.enabledDataGroups, passportNfcReaderConfig.enabledDataGroups) && Intrinsics.b(this.theme, passportNfcReaderConfig.theme) && Intrinsics.b(this.styles, passportNfcReaderConfig.styles);
    }

    public int hashCode() {
        int iHashCode = ((((((this.cardAccessNumber.hashCode() * 31) + this.mrzKey.hashCode()) * 31) + this.passportNfcStrings.hashCode()) * 31) + this.enabledDataGroups.hashCode()) * 31;
        Integer num = this.theme;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return iHashCode2 + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.cardAccessNumber + ", mrzKey=" + this.mrzKey + ", passportNfcStrings=" + this.passportNfcStrings + ", enabledDataGroups=" + this.enabledDataGroups + ", theme=" + this.theme + ", styles=" + this.styles + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.cardAccessNumber);
        this.mrzKey.writeToParcel(parcel, flags);
        this.passportNfcStrings.writeToParcel(parcel, flags);
        List<P8.b> list = this.enabledDataGroups;
        parcel.writeInt(list.size());
        Iterator<P8.b> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        Integer num = this.theme;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.styles, flags);
    }
}
