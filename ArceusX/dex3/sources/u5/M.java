package u5;

import B5.a;
import P9.h;
import P9.i;
import a4.m;
import android.graphics.BitmapFactory;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import z5.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ll8/M;", "", "<init>", "()V", "", "imagePath", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lz5/c;", "LP9/h;", "b", "()Lz5/c;", "textDetector", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class M {

    @NotNull
    private final h textDetector = i.b(c.d);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz5/c;", "a", "()Lz5/c;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function0<z5.c> {
        public static final c d = new c();

        c() {
            super(0);
        }

        @NotNull
        public final z5.c invoke() {
            z5.c cVarA = b.a(a.d);
            Intrinsics.checkNotNullExpressionValue(cVarA, "getClient(...)");
            return cVarA;
        }
    }

    private final z5.c b() {
        return (z5.c) this.textDetector.getValue();
    }

    public final String a(@NotNull String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        try {
            a aVarA = a.a(BitmapFactory.decodeFile(imagePath), 0);
            Intrinsics.checkNotNullExpressionValue(aVarA, "fromBitmap(...)");
            Task taskD = b().d(aVarA);
            Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
            try {
                m.a(taskD);
            } catch (ExecutionException unused) {
            }
            return ((z5.a) taskD.k()).a();
        } catch (Exception unused2) {
            return null;
        }
    }
}
