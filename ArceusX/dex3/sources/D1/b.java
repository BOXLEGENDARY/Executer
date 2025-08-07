package D1;

import K1.h;
import P9.m;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011BE\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u001bJ\u001f\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0001H\u0016¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00012\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\u001eJ\u0019\u0010B\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010J\u001a\u00020\u00132\b\u0010I\u001a\u0004\u0018\u00010HH\u0017¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0004\u0010\u0015J\u000f\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010\u0015J\u001f\u0010Q\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020&H\u0001¢\u0006\u0004\bQ\u0010RR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010MR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010MR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010XR\u0014\u0010g\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010XR\u0016\u0010j\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010XR\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010XR(\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010n\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010r¨\u0006v"}, d2 = {"LD1/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "", "start", "end", "LK1/h;", "scale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;LK1/h;IZZ)V", "startSize", "endSize", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "", "b", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "level", "onLevelChange", "(I)Z", "", "state", "onStateChange", "([I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "()Z", "stop", "drawable", "targetBounds", "c", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "d", "LK1/h;", "getScale", "()LK1/h;", "e", "I", "getDurationMillis", "i", "Z", "getFadeStart", "v", "getPreferExactIntrinsicSize", "", "Landroidx/vectordrawable/graphics/drawable/b;", "w", "Ljava/util/List;", "callbacks", "y", "intrinsicWidth", "z", "intrinsicHeight", "A", "J", "startTimeMillis", "B", "maxAlpha", "C", "value", "D", "Landroid/graphics/drawable/Drawable;", "getStart", "()Landroid/graphics/drawable/Drawable;", "E", "getEnd", "F", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends Drawable implements Drawable.Callback, Animatable {

    private long startTimeMillis;

    private int maxAlpha;

    private int state;

    private Drawable start;

    private final Drawable end;

    @NotNull
    private final h scale;

    private final int durationMillis;

    private final boolean fadeStart;

    private final boolean preferExactIntrinsicSize;

    @NotNull
    private final List<androidx.vectordrawable.graphics.drawable.b> callbacks = new ArrayList();

    private final int intrinsicWidth;

    private final int intrinsicHeight;

    public b(Drawable drawable, Drawable drawable2, @NotNull h hVar, int i, boolean z, boolean z2) {
        this.scale = hVar;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.intrinsicWidth = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.intrinsicHeight = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.maxAlpha = 255;
        this.start = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.end = drawableMutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.start;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    private final int a(Integer startSize, Integer endSize) {
        if (this.preferExactIntrinsicSize || ((startSize == null || startSize.intValue() != -1) && (endSize == null || endSize.intValue() != -1))) {
            return Math.max(startSize != null ? startSize.intValue() : -1, endSize != null ? endSize.intValue() : -1);
        }
        return -1;
    }

    private final void b() {
        this.state = 2;
        this.start = null;
        List<androidx.vectordrawable.graphics.drawable.b> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).b(this);
        }
    }

    public final void c(@NotNull Drawable drawable, @NotNull Rect targetBounds) throws m {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int iWidth = targetBounds.width();
        int iHeight = targetBounds.height();
        double dC = g.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.scale);
        double d = 2;
        int iA = ca.a.a((iWidth - (intrinsicWidth * dC)) / d);
        int iA2 = ca.a.a((iHeight - (dC * intrinsicHeight)) / d);
        drawable.setBounds(targetBounds.left + iA, targetBounds.top + iA2, targetBounds.right - iA, targetBounds.bottom - iA2);
    }

    @Override
    public void draw(@NotNull Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                drawable2.setAlpha(this.maxAlpha);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            Drawable drawable3 = this.end;
            if (drawable3 != null) {
                drawable3.setAlpha(this.maxAlpha);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / this.durationMillis;
        double dH = kotlin.ranges.b.h(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.maxAlpha;
        int i3 = (int) (dH * i2);
        if (this.fadeStart) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.start) != null) {
            drawable.setAlpha(i2);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.end;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            iSave = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        return this.maxAlpha;
    }

    @Override
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.end) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.end;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.start;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override
    public int getOpacity() {
        Drawable drawable = this.start;
        Drawable drawable2 = this.end;
        int i = this.state;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override
    public void invalidateDrawable(@NotNull Drawable who) {
        invalidateSelf();
    }

    @Override
    public boolean isRunning() {
        return this.state == 1;
    }

    @Override
    protected void onBoundsChange(@NotNull Rect bounds) throws m {
        Drawable drawable = this.start;
        if (drawable != null) {
            c(drawable, bounds);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            c(drawable2, bounds);
        }
    }

    @Override
    protected boolean onLevelChange(int level) {
        Drawable drawable = this.start;
        boolean level2 = drawable != null ? drawable.setLevel(level) : false;
        Drawable drawable2 = this.end;
        return level2 || (drawable2 != null ? drawable2.setLevel(level) : false);
    }

    @Override
    protected boolean onStateChange(@NotNull int[] state) {
        Drawable drawable = this.start;
        boolean state2 = drawable != null ? drawable.setState(state) : false;
        Drawable drawable2 = this.end;
        return state2 || (drawable2 != null ? drawable2.setState(state) : false);
    }

    @Override
    public void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override
    public void setAlpha(int alpha) {
        if (alpha >= 0 && alpha < 256) {
            this.maxAlpha = alpha;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + alpha).toString());
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override
    public void setTint(int tintColor) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTint(tintColor);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTint(tintColor);
        }
    }

    @Override
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintList(tint);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintList(tint);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintMode(tintMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintMode(tintMode);
        }
    }

    @Override
    public void start() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        this.startTimeMillis = SystemClock.uptimeMillis();
        List<androidx.vectordrawable.graphics.drawable.b> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).c(this);
        }
        invalidateSelf();
    }

    @Override
    public void stop() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.state != 2) {
            b();
        }
    }

    @Override
    public void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        unscheduleSelf(what);
    }
}
