package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "ids", "", "fieldKeyDocument", "fieldKeyIdClass", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "e", "Ljava/lang/String;", "a", "i", "b", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdRequestArguments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdRequestArguments> CREATOR = new a();

    @NotNull
    private final List<GovernmentId> ids;

    @NotNull
    private final String fieldKeyDocument;

    @NotNull
    private final String fieldKeyIdClass;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdRequestArguments> {
        @Override
        @NotNull
        public final GovernmentIdRequestArguments createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(GovernmentIdRequestArguments.class.getClassLoader()));
            }
            return new GovernmentIdRequestArguments(arrayList, parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final GovernmentIdRequestArguments[] newArray(int i) {
            return new GovernmentIdRequestArguments[i];
        }
    }

    public GovernmentIdRequestArguments(@NotNull List<? extends GovernmentId> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "ids");
        Intrinsics.checkNotNullParameter(str, "fieldKeyDocument");
        Intrinsics.checkNotNullParameter(str2, "fieldKeyIdClass");
        this.ids = list;
        this.fieldKeyDocument = str;
        this.fieldKeyIdClass = str2;
    }

    @NotNull
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    @NotNull
    public final String getFieldKeyIdClass() {
        return this.fieldKeyIdClass;
    }

    @NotNull
    public final List<GovernmentId> c() {
        return this.ids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdRequestArguments)) {
            return false;
        }
        GovernmentIdRequestArguments governmentIdRequestArguments = (GovernmentIdRequestArguments) other;
        return Intrinsics.b(this.ids, governmentIdRequestArguments.ids) && Intrinsics.b(this.fieldKeyDocument, governmentIdRequestArguments.fieldKeyDocument) && Intrinsics.b(this.fieldKeyIdClass, governmentIdRequestArguments.fieldKeyIdClass);
    }

    public int hashCode() {
        return (((this.ids.hashCode() * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode();
    }

    @NotNull
    public String toString() {
        return "GovernmentIdRequestArguments(ids=" + this.ids + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<GovernmentId> list = this.ids;
        parcel.writeInt(list.size());
        Iterator<GovernmentId> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        parcel.writeString(this.fieldKeyDocument);
        parcel.writeString(this.fieldKeyIdClass);
    }
}
