package u5;

import com.roblox.client.personasdk.R;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Ll8/e;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "extractionRawPayload", "b", "Ll8/e$a;", "Ll8/e$b;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class AbstractC0618e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Ll8/e$a;", "Ll8/e;", "", "extractionRawPayload", "identificationNumber", "Ljava/util/Date;", "birthdate", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getIdentificationNumber", "c", "Ljava/util/Date;", "()Ljava/util/Date;", "d", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class MrzBarcodeInfo extends AbstractC0618e {

        @NotNull
        private final String extractionRawPayload;

        private final String identificationNumber;

        private final Date birthdate;

        private final Date expirationDate;

        public MrzBarcodeInfo(@NotNull String str, String str2, Date date, Date date2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "extractionRawPayload");
            this.extractionRawPayload = str;
            this.identificationNumber = str2;
            this.birthdate = date;
            this.expirationDate = date2;
        }

        @Override
        @NotNull
        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        public final Date getBirthdate() {
            return this.birthdate;
        }

        public final Date getExpirationDate() {
            return this.expirationDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MrzBarcodeInfo)) {
                return false;
            }
            MrzBarcodeInfo mrzBarcodeInfo = (MrzBarcodeInfo) other;
            return Intrinsics.b(this.extractionRawPayload, mrzBarcodeInfo.extractionRawPayload) && Intrinsics.b(this.identificationNumber, mrzBarcodeInfo.identificationNumber) && Intrinsics.b(this.birthdate, mrzBarcodeInfo.birthdate) && Intrinsics.b(this.expirationDate, mrzBarcodeInfo.expirationDate);
        }

        public int hashCode() {
            int iHashCode = this.extractionRawPayload.hashCode() * 31;
            String str = this.identificationNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Date date = this.birthdate;
            int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.expirationDate;
            return iHashCode3 + (date2 != null ? date2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MrzBarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ", identificationNumber=" + this.identificationNumber + ", birthdate=" + this.birthdate + ", expirationDate=" + this.expirationDate + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0015"}, d2 = {"Ll8/e$b;", "Ll8/e;", "", "extractionRawPayload", "<init>", "(Ljava/lang/String;)V", "Ll8/a;", "b", "()Ll8/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Pdf417BarcodeInfo extends AbstractC0618e {

        @NotNull
        private final String extractionRawPayload;

        public Pdf417BarcodeInfo(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "extractionRawPayload");
            this.extractionRawPayload = str;
        }

        @Override
        @NotNull
        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        public final AamvaExtraction b() {
            return AamvaExtraction.INSTANCE.d(getExtractionRawPayload());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pdf417BarcodeInfo) && Intrinsics.b(this.extractionRawPayload, ((Pdf417BarcodeInfo) other).extractionRawPayload);
        }

        public int hashCode() {
            return this.extractionRawPayload.hashCode();
        }

        @NotNull
        public String toString() {
            return "Pdf417BarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ")";
        }
    }

    public AbstractC0618e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getExtractionRawPayload();

    private AbstractC0618e() {
    }
}
