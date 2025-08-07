package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AutoCaptureRuleSet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoCaptureRuleSet> CREATOR = new a();

    @NotNull
    private final List<AutoCaptureRule> rules;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoCaptureRuleSet> {
        @Override
        @NotNull
        public final AutoCaptureRuleSet createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(AutoCaptureRuleSet.class.getClassLoader()));
            }
            return new AutoCaptureRuleSet(arrayList);
        }

        @Override
        @NotNull
        public final AutoCaptureRuleSet[] newArray(int i) {
            return new AutoCaptureRuleSet[i];
        }
    }

    public AutoCaptureRuleSet() {
        List list = null;
        this(list, 1, list);
    }

    @NotNull
    public final List<AutoCaptureRule> a() {
        return this.rules;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoCaptureRuleSet) && Intrinsics.b(this.rules, ((AutoCaptureRuleSet) other).rules);
    }

    public int hashCode() {
        return this.rules.hashCode();
    }

    @NotNull
    public String toString() {
        return "AutoCaptureRuleSet(rules=" + this.rules + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<AutoCaptureRule> list = this.rules;
        parcel.writeInt(list.size());
        Iterator<AutoCaptureRule> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public AutoCaptureRuleSet(@NotNull List<? extends AutoCaptureRule> list) {
        Intrinsics.checkNotNullParameter(list, "rules");
        this.rules = list;
    }

    public AutoCaptureRuleSet(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.j() : list);
    }
}
