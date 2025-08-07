package u5;

import T9.a;
import T9.b;
import android.graphics.Bitmap;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Ll8/D;", "", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "a", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "b", "c", "Ll8/D$a;", "Ll8/D$b;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface D {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll8/D$a;", "Ll8/D;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class None implements D {

        private final ImageLightCondition imageLightCondition;

        public None() {
            ImageLightCondition imageLightCondition = null;
            this(imageLightCondition, 1, imageLightCondition);
        }

        @Override
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && Intrinsics.b(this.imageLightCondition, ((None) other).imageLightCondition);
        }

        public int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        @NotNull
        public String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }

        public None(ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        public None(ImageLightCondition imageLightCondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : imageLightCondition);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"Ll8/D$b;", "Ll8/D;", "Ll8/D$c;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "Ll8/e;", "extractedBarcode", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Ll8/D$c;Landroid/graphics/Bitmap;Lcom/withpersona/sdk2/camera/ImageIdMetadata;Ll8/e;Lcom/withpersona/sdk2/camera/ExtractedTexts;Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll8/D$c;", "f", "()Ll8/D$c;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "e", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "d", "Ll8/e;", "()Ll8/e;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ParsedIdSide implements D {

        @NotNull
        private final c side;

        @NotNull
        private final Bitmap bitmap;

        private final ImageIdMetadata metadata;

        private final AbstractC0618e extractedBarcode;

        private final ExtractedTexts extractedTexts;

        private final ImageLightCondition imageLightCondition;

        public ParsedIdSide(@NotNull c cVar, @NotNull Bitmap bitmap, ImageIdMetadata imageIdMetadata, AbstractC0618e abstractC0618e, ExtractedTexts extractedTexts, ImageLightCondition imageLightCondition) {
            Intrinsics.checkNotNullParameter(cVar, "side");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.side = cVar;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = abstractC0618e;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        @Override
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final AbstractC0618e getExtractedBarcode() {
            return this.extractedBarcode;
        }

        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) other;
            return this.side == parsedIdSide.side && Intrinsics.b(this.bitmap, parsedIdSide.bitmap) && Intrinsics.b(this.metadata, parsedIdSide.metadata) && Intrinsics.b(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.b(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.b(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        @NotNull
        public final c getSide() {
            return this.side;
        }

        public int hashCode() {
            int iHashCode = ((this.side.hashCode() * 31) + this.bitmap.hashCode()) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int iHashCode2 = (iHashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.hashCode())) * 31;
            AbstractC0618e abstractC0618e = this.extractedBarcode;
            int iHashCode3 = (iHashCode2 + (abstractC0618e == null ? 0 : abstractC0618e.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int iHashCode4 = (iHashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return iHashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ll8/D$c;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c {
        public static final c d = new c("Front", 0);
        public static final c e = new c("Back", 1);
        private static final c[] i;
        private static final a v;

        static {
            c[] cVarArrC = c();
            i = cVarArrC;
            v = b.a(cVarArrC);
        }

        private c(String str, int i2) {
        }

        private static final c[] c() {
            return new c[]{d, e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) i.clone();
        }
    }

    ImageLightCondition getImageLightCondition();
}
