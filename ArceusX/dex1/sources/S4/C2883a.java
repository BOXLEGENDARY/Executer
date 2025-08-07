package s4;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u4.C2937g;
import u4.k;
import u4.n;

public class C2883a extends Drawable implements n {

    private b f23668d;

    @Override
    public C2883a mutate() {
        this.f23668d = new b(this.f23668d);
        return this;
    }

    @Override
    public void draw(Canvas canvas) {
        b bVar = this.f23668d;
        if (bVar.f23670b) {
            bVar.f23669a.draw(canvas);
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f23668d;
    }

    @Override
    public int getOpacity() {
        return this.f23668d.f23669a.getOpacity();
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23668d.f23669a.setBounds(rect);
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f23668d.f23669a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = C2884b.b(iArr);
        b bVar = this.f23668d;
        if (bVar.f23670b == zB) {
            return zOnStateChange;
        }
        bVar.f23670b = zB;
        return true;
    }

    @Override
    public void setAlpha(int i7) {
        this.f23668d.f23669a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23668d.f23669a.setColorFilter(colorFilter);
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        this.f23668d.f23669a.setShapeAppearanceModel(kVar);
    }

    @Override
    public void setTint(int i7) {
        this.f23668d.f23669a.setTint(i7);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.f23668d.f23669a.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        this.f23668d.f23669a.setTintMode(mode);
    }

    public C2883a(k kVar) {
        this(new b(new C2937g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        C2937g f23669a;

        boolean f23670b;

        public b(C2937g c2937g) {
            this.f23669a = c2937g;
            this.f23670b = false;
        }

        @Override
        public C2883a newDrawable() {
            return new C2883a(new b(this));
        }

        @Override
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f23669a = (C2937g) bVar.f23669a.getConstantState().newDrawable();
            this.f23670b = bVar.f23670b;
        }
    }

    private C2883a(b bVar) {
        this.f23668d = bVar;
    }
}
