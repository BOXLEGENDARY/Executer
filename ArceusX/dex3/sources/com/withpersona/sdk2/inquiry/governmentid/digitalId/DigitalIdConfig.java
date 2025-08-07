package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "Landroid/os/Parcelable;", "", "merchantId", "nonce", "fieldKeyMobileDriversLicense", "", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdRequest;", "digitalIdRequests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getMerchantId", "()Ljava/lang/String;", "e", "getNonce", "i", "getFieldKeyMobileDriversLicense", "v", "Ljava/util/List;", "getDigitalIdRequests", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DigitalIdConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitalIdConfig> CREATOR = new a();

    @NotNull
    private final String merchantId;

    @NotNull
    private final String nonce;

    @NotNull
    private final String fieldKeyMobileDriversLicense;

    @NotNull
    private final List<DigitalIdRequest> digitalIdRequests;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DigitalIdConfig> {
        @Override
        @NotNull
        public final DigitalIdConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DigitalIdRequest.CREATOR.createFromParcel(parcel));
            }
            return new DigitalIdConfig(string, string2, string3, arrayList);
        }

        @Override
        @NotNull
        public final DigitalIdConfig[] newArray(int i) {
            return new DigitalIdConfig[i];
        }
    }

    public DigitalIdConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<DigitalIdRequest> list) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, "nonce");
        Intrinsics.checkNotNullParameter(str3, "fieldKeyMobileDriversLicense");
        Intrinsics.checkNotNullParameter(list, "digitalIdRequests");
        this.merchantId = str;
        this.nonce = str2;
        this.fieldKeyMobileDriversLicense = str3;
        this.digitalIdRequests = list;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.merchantId);
        parcel.writeString(this.nonce);
        parcel.writeString(this.fieldKeyMobileDriversLicense);
        List<DigitalIdRequest> list = this.digitalIdRequests;
        parcel.writeInt(list.size());
        Iterator<DigitalIdRequest> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
