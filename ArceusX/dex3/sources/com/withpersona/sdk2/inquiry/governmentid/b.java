package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import u5.D;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "Ll8/D$c;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ll8/D$c;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final D.c b(IdConfig.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1 && i != 2) {
            return D.c.e;
        }
        return D.c.d;
    }
}
