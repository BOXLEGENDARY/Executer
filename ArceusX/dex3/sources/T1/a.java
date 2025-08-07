package T1;

import U1.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import b2.d;
import java.util.HashMap;
import java.util.Map;

public class a {
    private final AssetManager d;
    private final i<String> a = new i<>();
    private final Map<i<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String e = ".ttf";

    public a(Drawable.Callback callback, P1.a aVar) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    private Typeface a(String str) {
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + str + this.e);
        this.c.put(str, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceD = d(a(str), str2);
        this.b.put(this.a, typefaceD);
        return typefaceD;
    }

    public void c(P1.a aVar) {
    }
}
