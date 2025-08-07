package ka;

import android.graphics.Bitmap;
import com.roblox.client.personasdk.R;
import ka.M;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lo9/a;", "", "Landroid/graphics/Bitmap;", "initialValue", "<init>", "(Landroid/graphics/Bitmap;)V", "Lka/y;", "a", "Lka/y;", "_bitmapValue", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onChanged", "value", "()Landroid/graphics/Bitmap;", "c", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0724a {

    @NotNull
    private final y<Bitmap> _bitmapValue;

    @NotNull
    private final g<Bitmap> onChanged;

    public C0724a(Bitmap bitmap) {
        y<Bitmap> yVarA = M.a(bitmap);
        this._bitmapValue = yVarA;
        this.onChanged = i.m(yVarA, 1);
    }

    @NotNull
    public final g<Bitmap> a() {
        return this.onChanged;
    }

    public final Bitmap b() {
        return (Bitmap) this._bitmapValue.getValue();
    }

    public final void c(Bitmap bitmap) {
        this._bitmapValue.setValue(bitmap);
    }
}
