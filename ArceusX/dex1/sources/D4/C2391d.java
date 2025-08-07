package d4;

import android.util.Property;
import android.view.ViewGroup;
import c4.C1750f;

public class C2391d extends Property<ViewGroup, Float> {

    public static final Property<ViewGroup, Float> f20318a = new C2391d("childrenAlpha");

    private C2391d(String str) {
        super(Float.class, str);
    }

    @Override
    public Float get(ViewGroup viewGroup) {
        Float f7 = (Float) viewGroup.getTag(C1750f.f12854D);
        return f7 != null ? f7 : Float.valueOf(1.0f);
    }

    @Override
    public void set(ViewGroup viewGroup, Float f7) {
        float fFloatValue = f7.floatValue();
        viewGroup.setTag(C1750f.f12854D, f7);
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            viewGroup.getChildAt(i7).setAlpha(fFloatValue);
        }
    }
}
