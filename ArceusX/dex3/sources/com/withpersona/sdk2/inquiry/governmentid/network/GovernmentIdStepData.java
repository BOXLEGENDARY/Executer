package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "ids", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdStepData implements StepData {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new a();

    @NotNull
    private final String stepName;

    @NotNull
    private final List<GovernmentId> ids;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdStepData> {
        @Override
        @NotNull
        public final GovernmentIdStepData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(GovernmentIdStepData.class.getClassLoader()));
            }
            return new GovernmentIdStepData(string, arrayList);
        }

        @Override
        @NotNull
        public final GovernmentIdStepData[] newArray(int i) {
            return new GovernmentIdStepData[i];
        }
    }

    public GovernmentIdStepData(@NotNull String str, @NotNull List<? extends GovernmentId> list) {
        Intrinsics.checkNotNullParameter(str, "stepName");
        Intrinsics.checkNotNullParameter(list, "ids");
        this.stepName = str;
        this.ids = list;
    }

    @NotNull
    public final List<GovernmentId> a() {
        return this.ids;
    }

    @NotNull
    public String getStepName() {
        return this.stepName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stepName);
        List<GovernmentId> list = this.ids;
        parcel.writeInt(list.size());
        Iterator<GovernmentId> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }
}
