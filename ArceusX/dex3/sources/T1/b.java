package T1;

import P1.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b2.d;
import b2.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class b {
    private static final Object d = new Object();
    private final Context a;
    private final String b;
    private final Map<String, f> c;

    public b(Drawable.Callback callback, String str, P1.b bVar, Map<String, f> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + '/';
        }
        if (callback instanceof View) {
            this.a = ((View) callback).getContext();
            this.c = map;
            d(bVar);
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (d) {
            this.c.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        f fVar = this.c.get(str);
        if (fVar == null) {
            return null;
        }
        Bitmap bitmapA = fVar.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        String strB = fVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e) {
                d.d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return c(str, h.l(BitmapFactory.decodeStream(this.a.getAssets().open(this.b + strB), null, options), fVar.e(), fVar.c()));
            } catch (IllegalArgumentException e2) {
                d.d("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            d.d("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public void d(P1.b bVar) {
    }
}
