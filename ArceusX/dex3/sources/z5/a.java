package z5;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0618e;
import u5.D;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lm8/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lm8/a$a;", "Lm8/a$b;", "Lm8/a$c;", "Lm8/a$d;", "Lm8/a$e;", "Lm8/a$f;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lm8/a$a;", "Lm8/a;", "Ll8/e;", "extractedBarcode", "<init>", "(Ll8/e;)V", "a", "Ll8/e;", "()Ll8/e;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0245a extends a {

        @NotNull
        private final AbstractC0618e extractedBarcode;

        public C0245a(@NotNull AbstractC0618e abstractC0618e) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC0618e, "extractedBarcode");
            this.extractedBarcode = abstractC0618e;
        }

        @NotNull
        public final AbstractC0618e getExtractedBarcode() {
            return this.extractedBarcode;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm8/a$b;", "Lm8/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends a {

        @NotNull
        public static final b a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 801215118;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lm8/a$c;", "Lm8/a;", "Ll8/D$c;", "side", "frontOrBackData", "<init>", "(Ll8/D$c;Lm8/a;)V", "a", "Ll8/D$c;", "b", "()Ll8/D$c;", "Lm8/a;", "()Lm8/a;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c extends a {

        @NotNull
        private final D.c side;

        @NotNull
        private final a frontOrBackData;

        public c(@NotNull D.c cVar, @NotNull a aVar) {
            super(null);
            Intrinsics.checkNotNullParameter(cVar, "side");
            Intrinsics.checkNotNullParameter(aVar, "frontOrBackData");
            this.side = cVar;
            this.frontOrBackData = aVar;
        }

        @NotNull
        public final a getFrontOrBackData() {
            return this.frontOrBackData;
        }

        @NotNull
        public final D.c getSide() {
            return this.side;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lm8/a$d;", "Lm8/a;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "<init>", "(Lcom/withpersona/sdk2/camera/ImageIdMetadata;)V", "a", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d extends a {

        @NotNull
        private final ImageIdMetadata metadata;

        public d(@NotNull ImageIdMetadata imageIdMetadata) {
            super(null);
            Intrinsics.checkNotNullParameter(imageIdMetadata, "metadata");
            this.metadata = imageIdMetadata;
        }

        @NotNull
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lm8/a$e;", "Lm8/a;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "a", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e extends a {

        @NotNull
        private final ImageLightCondition imageLightCondition;

        public e(@NotNull ImageLightCondition imageLightCondition) {
            super(null);
            Intrinsics.checkNotNullParameter(imageLightCondition, "imageLightCondition");
            this.imageLightCondition = imageLightCondition;
        }

        @NotNull
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lm8/a$f;", "Lm8/a;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "<init>", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)V", "a", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class f extends a {

        @NotNull
        private final ExtractedTexts extractedTexts;

        public f(@NotNull ExtractedTexts extractedTexts) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedTexts, "extractedTexts");
            this.extractedTexts = extractedTexts;
        }

        @NotNull
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }
    }

    public a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
