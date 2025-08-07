package Q1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import b2.g;

public class a extends Paint {
    public a() {
    }

    @Override
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(g.d(i, 0, 255));
        } else {
            setColor((g.d(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public a(int i) {
        super(i);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
