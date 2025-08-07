package com.withpersona.sdk2.inquiry.selfie;

import P9.o;
import android.content.Context;
import android.graphics.Bitmap;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.J;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll8/J;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "d", "(Ll8/J;)Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;)Ljava/lang/String;", "Landroid/content/Context;", "context", "LP9/o;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "b", "(Ll8/J;Landroid/content/Context;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "selfie_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[Selfie.b.values().length];
            try {
                iArr[Selfie.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Selfie.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Selfie.b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final String a(@NotNull Selfie.b bVar) throws P9.m {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return "center";
        }
        if (i == 2) {
            return "left";
        }
        if (i == 3) {
            return "right";
        }
        throw new P9.m();
    }

    @NotNull
    public static final Object b(@NotNull J j, @NotNull Context context) throws P9.m {
        Intrinsics.checkNotNullParameter(j, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(context.getCacheDir(), "persona_selfie_" + jCurrentTimeMillis + ".jpg");
            Bitmap bitmap = j.getBitmap();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                X9.c.a(fileOutputStream, (Throwable) null);
                o.a aVar = P9.o.e;
                String absolutePath = file.getAbsolutePath();
                Selfie.b bVarD = d(j);
                Selfie.a aVar2 = Selfie.a.e;
                Intrinsics.d(absolutePath);
                return P9.o.b(new Selfie.SelfieImage(absolutePath, aVar2, bVarD, jCurrentTimeMillis));
            } finally {
            }
        } catch (IOException e) {
            o.a aVar3 = P9.o.e;
            return P9.o.b(P9.p.a(e));
        }
    }

    @NotNull
    public static final Selfie.b c(@NotNull NextStep.Selfie.SelfiePose selfiePose) throws P9.m {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i = a.b[selfiePose.ordinal()];
        if (i == 1) {
            return Selfie.b.d;
        }
        if (i == 2) {
            return Selfie.b.e;
        }
        if (i == 3) {
            return Selfie.b.i;
        }
        throw new P9.m();
    }

    @NotNull
    public static final Selfie.b d(@NotNull J j) throws P9.m {
        Intrinsics.checkNotNullParameter(j, "<this>");
        if (j instanceof J.a) {
            return Selfie.b.d;
        }
        if (j instanceof J.b) {
            return Selfie.b.e;
        }
        if (j instanceof J.c) {
            return Selfie.b.i;
        }
        throw new P9.m();
    }
}
