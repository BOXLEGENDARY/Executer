package com.squareup.workflow1.ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "Landroid/os/Parcelable;", "", "key", "Landroid/util/SparseArray;", "viewState", "<init>", "(Ljava/lang/String;Landroid/util/SparseArray;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "getKey", "e", "Landroid/util/SparseArray;", "a", "()Landroid/util/SparseArray;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class ViewStateFrame implements Parcelable {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String key;

    @NotNull
    private final SparseArray<Parcelable> viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateFrame$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ViewStateFrame> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public ViewStateFrame createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Intrinsics.d(string);
            Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
            SparseArray sparseArray = parcel.readSparseArray(ViewStateFrame.class.getClassLoader());
            Intrinsics.d(sparseArray);
            Intrinsics.checkNotNullExpressionValue(sparseArray, "parcel.readSparseArray<P…class.java.classLoader)!!");
            return new ViewStateFrame(string, sparseArray);
        }

        @Override
        @NotNull
        public ViewStateFrame[] newArray(int size) {
            return new ViewStateFrame[size];
        }

        private Companion() {
        }
    }

    public ViewStateFrame(@NotNull String str, @NotNull SparseArray<Parcelable> sparseArray) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sparseArray, "viewState");
        this.key = str;
        this.viewState = sparseArray;
    }

    @NotNull
    public final SparseArray<Parcelable> a() {
        return this.viewState;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewStateFrame)) {
            return false;
        }
        ViewStateFrame viewStateFrame = (ViewStateFrame) other;
        return Intrinsics.b(this.key, viewStateFrame.key) && Intrinsics.b(this.viewState, viewStateFrame.viewState);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.viewState.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewStateFrame(key=" + this.key + ", viewState=" + this.viewState + ')';
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.key);
        parcel.writeSparseArray(this.viewState);
    }
}
