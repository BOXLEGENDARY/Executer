package d4;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class C2392e extends Property<Drawable, Integer> {

    public static final Property<Drawable, Integer> f20319b = new C2392e();

    private final WeakHashMap<Drawable, Integer> f20320a;

    private C2392e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f20320a = new WeakHashMap<>();
    }

    @Override
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
