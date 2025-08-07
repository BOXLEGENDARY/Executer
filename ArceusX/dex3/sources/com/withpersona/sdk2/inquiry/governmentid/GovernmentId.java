package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "b1", "()Ljava/util/List;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "i1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "N", "()Ljava/lang/String;", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "Q0", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "a", "GovernmentIdImage", "GovernmentIdVideo", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface GovernmentId extends Parcelable {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "b1", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "i1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "i", "Ljava/lang/String;", "N", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "Q0", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GovernmentIdVideo implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new a();

        @NotNull
        private final List<Frame> frames;

        @NotNull
        private final b side;

        @NotNull
        private final String idClassKey;

        @NotNull
        private final a captureMethod;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdVideo> {
            @Override
            @NotNull
            public final GovernmentIdVideo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdVideo(arrayList, b.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final GovernmentIdVideo[] newArray(int i) {
                return new GovernmentIdVideo[i];
            }
        }

        public GovernmentIdVideo(@NotNull List<Frame> list, @NotNull b bVar, @NotNull String str, @NotNull a aVar) {
            Intrinsics.checkNotNullParameter(list, "frames");
            Intrinsics.checkNotNullParameter(bVar, "side");
            Intrinsics.checkNotNullParameter(str, "idClassKey");
            Intrinsics.checkNotNullParameter(aVar, "captureMethod");
            this.frames = list;
            this.side = bVar;
            this.idClassKey = str;
            this.captureMethod = aVar;
        }

        @Override
        @NotNull
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @Override
        @NotNull
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override
        @NotNull
        public List<Frame> b1() {
            return this.frames;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdVideo)) {
                return false;
            }
            GovernmentIdVideo governmentIdVideo = (GovernmentIdVideo) other;
            return Intrinsics.b(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && Intrinsics.b(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode();
        }

        @Override
        @NotNull
        public b getSide() {
            return this.side;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdVideo(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Frame> list = this.frames;
            parcel.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
            parcel.writeString(this.side.name());
            parcel.writeString(this.idClassKey);
            parcel.writeString(this.captureMethod.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static final a d = new C0104a("AUTO", 0);
        public static final a e = new b("MANUAL", 1);
        public static final a i = new c("UPLOAD", 2);
        private static final a[] v;
        private static final T9.a w;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0104a extends a {
            C0104a(String str, int i) {
                super(str, i, null);
            }

            @Override
            @NotNull
            public String toString() {
                return "auto";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class b extends a {
            b(String str, int i) {
                super(str, i, null);
            }

            @Override
            @NotNull
            public String toString() {
                return "manual";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class c extends a {
            c(String str, int i) {
                super(str, i, null);
            }

            @Override
            @NotNull
            public String toString() {
                return "upload";
            }
        }

        static {
            a[] aVarArrC = c();
            v = aVarArrC;
            w = T9.b.a(aVarArrC);
        }

        public a(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i2);
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

        private a(String str, int i2) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        public static final b d = new b("FRONT", 0);
        public static final b e = new b("BACK", 1);
        public static final b i = new b("FRONT_AND_BACK", 2);
        private static final b[] v;
        private static final T9.a w;

        static {
            b[] bVarArrC = c();
            v = bVarArrC;
            w = T9.b.a(bVarArrC);
        }

        private b(String str, int i2) {
        }

        private static final b[] c() {
            return new b[]{d, e, i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    @NotNull
    String getIdClassKey();

    @NotNull
    a getCaptureMethod();

    @NotNull
    List<Frame> b1();

    @NotNull
    b getSide();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b$\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "rawExtraction", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "idDetails", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)V", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "b1", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "i1", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "i", "Ljava/lang/String;", "N", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "Q0", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "()Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "y", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "c", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GovernmentIdImage implements GovernmentId {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new a();

        @NotNull
        private final List<Frame> frames;

        @NotNull
        private final b side;

        @NotNull
        private final String idClassKey;

        @NotNull
        private final a captureMethod;

        private final RawExtraction rawExtraction;

        private final GovernmentIdDetails idDetails;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdImage> {
            @Override
            @NotNull
            public final GovernmentIdImage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdImage(arrayList, b.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdDetails.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdImage[] newArray(int i) {
                return new GovernmentIdImage[i];
            }
        }

        public GovernmentIdImage(@NotNull List<Frame> list, @NotNull b bVar, @NotNull String str, @NotNull a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails) {
            Intrinsics.checkNotNullParameter(list, "frames");
            Intrinsics.checkNotNullParameter(bVar, "side");
            Intrinsics.checkNotNullParameter(str, "idClassKey");
            Intrinsics.checkNotNullParameter(aVar, "captureMethod");
            this.frames = list;
            this.side = bVar;
            this.idClassKey = str;
            this.captureMethod = aVar;
            this.rawExtraction = rawExtraction;
            this.idDetails = governmentIdDetails;
        }

        public static GovernmentIdImage b(GovernmentIdImage governmentIdImage, List list, b bVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                list = governmentIdImage.frames;
            }
            if ((i & 2) != 0) {
                bVar = governmentIdImage.side;
            }
            b bVar2 = bVar;
            if ((i & 4) != 0) {
                str = governmentIdImage.idClassKey;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                aVar = governmentIdImage.captureMethod;
            }
            a aVar2 = aVar;
            if ((i & 16) != 0) {
                rawExtraction = governmentIdImage.rawExtraction;
            }
            RawExtraction rawExtraction2 = rawExtraction;
            if ((i & 32) != 0) {
                governmentIdDetails = governmentIdImage.idDetails;
            }
            return governmentIdImage.a(list, bVar2, str2, aVar2, rawExtraction2, governmentIdDetails);
        }

        @Override
        @NotNull
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @Override
        @NotNull
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @NotNull
        public final GovernmentIdImage a(@NotNull List<Frame> frames, @NotNull b side, @NotNull String idClassKey, @NotNull a captureMethod, RawExtraction rawExtraction, GovernmentIdDetails idDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new GovernmentIdImage(frames, side, idClassKey, captureMethod, rawExtraction, idDetails);
        }

        @Override
        @NotNull
        public List<Frame> b1() {
            return this.frames;
        }

        public final GovernmentIdDetails getIdDetails() {
            return this.idDetails;
        }

        public final RawExtraction getRawExtraction() {
            return this.rawExtraction;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdImage)) {
                return false;
            }
            GovernmentIdImage governmentIdImage = (GovernmentIdImage) other;
            return Intrinsics.b(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && Intrinsics.b(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && Intrinsics.b(this.rawExtraction, governmentIdImage.rawExtraction) && Intrinsics.b(this.idDetails, governmentIdImage.idDetails);
        }

        public int hashCode() {
            int iHashCode = ((((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode()) * 31;
            RawExtraction rawExtraction = this.rawExtraction;
            int iHashCode2 = (iHashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            return iHashCode2 + (governmentIdDetails != null ? governmentIdDetails.hashCode() : 0);
        }

        @Override
        @NotNull
        public b getSide() {
            return this.side;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdImage(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ", rawExtraction=" + this.rawExtraction + ", idDetails=" + this.idDetails + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Frame> list = this.frames;
            parcel.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
            parcel.writeString(this.side.name());
            parcel.writeString(this.idClassKey);
            parcel.writeString(this.captureMethod.name());
            RawExtraction rawExtraction = this.rawExtraction;
            if (rawExtraction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                rawExtraction.writeToParcel(parcel, flags);
            }
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            if (governmentIdDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdDetails.writeToParcel(parcel, flags);
            }
        }

        public GovernmentIdImage(List list, b bVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, bVar, str, aVar, (i & 16) != 0 ? null : rawExtraction, (i & 32) != 0 ? null : governmentIdDetails);
        }
    }
}
