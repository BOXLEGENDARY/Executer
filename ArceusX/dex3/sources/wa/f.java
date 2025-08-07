package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import ta.C0807d;
import wa.g;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\u001a=\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Object", "Type", "Lwa/a;", "receiver", "value", "Lwa/g;", "f", "(Lwa/a;Ljava/lang/Object;Ljava/lang/Object;)Lwa/g;", "", "", "start", "end", "d", "(Ljava/lang/CharSequence;II)I", "e", "(Ljava/lang/CharSequence;II)Ljava/lang/Integer;", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {
    public static final int d(CharSequence charSequence, int i, int i2) {
        int iA = 0;
        while (i < i2) {
            iA = (iA * 10) + C0807d.a(charSequence.charAt(i));
            i++;
        }
        return iA;
    }

    public static final Integer e(CharSequence charSequence, int i, int i2) {
        int iA = 0;
        while (i < i2) {
            iA = (iA * 10) + C0807d.a(charSequence.charAt(i));
            if (iA < 0) {
                return null;
            }
            i++;
        }
        return Integer.valueOf(iA);
    }

    public static final <Object, Type> g f(a<? super Object, Type> aVar, Object object, Type type) {
        Type typeC = aVar.c(object, type);
        if (typeC == null) {
            return null;
        }
        return new g.a(typeC);
    }
}
