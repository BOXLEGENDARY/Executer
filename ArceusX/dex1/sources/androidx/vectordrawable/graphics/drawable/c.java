package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import g0.C2457a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.h;
import p0.k;
import q0.C2731a;

public class c extends e implements Animatable {

    final Drawable.Callback f12431A;

    private C0124c f12432e;

    private Context f12433i;

    private ArgbEvaluator f12434v;

    d f12435w;

    private Animator.AnimatorListener f12436y;

    ArrayList<androidx.vectordrawable.graphics.drawable.b> f12437z;

    class a implements Drawable.Callback {
        a() {
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            c.this.scheduleSelf(runnable, j7);
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f12437z);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i7)).b(c.this);
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f12437z);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i7)).c(c.this);
            }
        }
    }

    private static class C0124c extends Drawable.ConstantState {

        int f12440a;

        f f12441b;

        AnimatorSet f12442c;

        ArrayList<Animator> f12443d;

        C2457a<Animator, String> f12444e;

        public C0124c(Context context, C0124c c0124c, Drawable.Callback callback, Resources resources) {
            if (c0124c != null) {
                this.f12440a = c0124c.f12440a;
                f fVar = c0124c.f12441b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f12441b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f12441b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f12441b.mutate();
                    this.f12441b = fVar2;
                    fVar2.setCallback(callback);
                    this.f12441b.setBounds(c0124c.f12441b.getBounds());
                    this.f12441b.g(false);
                }
                ArrayList<Animator> arrayList = c0124c.f12443d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f12443d = new ArrayList<>(size);
                    this.f12444e = new C2457a<>(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = c0124c.f12443d.get(i7);
                        Animator animatorClone = animator.clone();
                        String str = c0124c.f12444e.get(animator);
                        animatorClone.setTarget(this.f12441b.c(str));
                        this.f12443d.add(animatorClone);
                        this.f12444e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f12442c == null) {
                this.f12442c = new AnimatorSet();
            }
            this.f12442c.playTogether(this.f12443d);
        }

        @Override
        public int getChangingConfigurations() {
            return this.f12440a;
        }

        @Override
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i7) throws Resources.NotFoundException {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i7, context.getTheme());
        cVar.f12446d = drawableE;
        drawableE.setCallback(cVar.f12431A);
        cVar.f12435w = new d(cVar.f12446d.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f12436y;
        if (animatorListener != null) {
            this.f12432e.f12442c.removeListener(animatorListener);
            this.f12436y = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f12432e.f12441b.c(str));
        C0124c c0124c = this.f12432e;
        if (c0124c.f12443d == null) {
            c0124c.f12443d = new ArrayList<>();
            this.f12432e.f12444e = new C2457a<>();
        }
        this.f12432e.f12443d.add(animator);
        this.f12432e.f12444e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f12437z == null) {
            this.f12437z = new ArrayList<>();
        }
        if (this.f12437z.contains(bVar)) {
            return;
        }
        this.f12437z.add(bVar);
        if (this.f12436y == null) {
            this.f12436y = new b();
        }
        this.f12432e.f12442c.addListener(this.f12436y);
    }

    @Override
    public boolean canApplyTheme() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            return C2731a.b(drawable);
        }
        return false;
    }

    @Override
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f12432e.f12441b.draw(canvas);
        if (this.f12432e.f12442c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f12437z;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f12437z.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.d(drawable) : this.f12432e.f12441b.getAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f12432e.f12440a;
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.e(drawable) : this.f12432e.f12441b.getColorFilter();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f12446d != null) {
            return new d(this.f12446d.getConstantState());
        }
        return null;
    }

    @Override
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f12432e.f12441b.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f12432e.f12441b.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getOpacity() : this.f12432e.f12441b.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return super.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f12421e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f12431A);
                        f fVar = this.f12432e.f12441b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f12432e.f12441b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f12422f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f12433i;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f12432e.a();
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.h(drawable) : this.f12432e.f12441b.isAutoMirrored();
    }

    @Override
    public boolean isRunning() {
        Drawable drawable = this.f12446d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f12432e.f12442c.isRunning();
    }

    @Override
    public boolean isStateful() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.isStateful() : this.f12432e.f12441b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override
    public Drawable mutate() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f12432e.f12441b.setBounds(rect);
        }
    }

    @Override
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.setLevel(i7) : this.f12432e.f12441b.setLevel(i7);
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.setState(iArr) : this.f12432e.f12441b.setState(iArr);
    }

    @Override
    public void setAlpha(int i7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f12432e.f12441b.setAlpha(i7);
        }
    }

    @Override
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.j(drawable, z7);
        } else {
            this.f12432e.f12441b.setAutoMirrored(z7);
        }
    }

    @Override
    public void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override
    public void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override
    public void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override
    public boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override
    public void setTint(int i7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.n(drawable, i7);
        } else {
            this.f12432e.f12441b.setTint(i7);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.o(drawable, colorStateList);
        } else {
            this.f12432e.f12441b.setTintList(colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.p(drawable, mode);
        } else {
            this.f12432e.f12441b.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f12432e.f12441b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override
    public void start() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f12432e.f12442c.isStarted()) {
                return;
            }
            this.f12432e.f12442c.start();
            invalidateSelf();
        }
    }

    @Override
    public void stop() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f12432e.f12442c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12432e.f12441b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        private final Drawable.ConstantState f12445a;

        public d(Drawable.ConstantState constantState) {
            this.f12445a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f12445a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f12445a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f12445a.newDrawable();
            cVar.f12446d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f12431A);
            return cVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f12445a.newDrawable(resources);
            cVar.f12446d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f12431A);
            return cVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f12445a.newDrawable(resources, theme);
            cVar.f12446d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f12431A);
            return cVar;
        }
    }

    private c(Context context, C0124c c0124c, Resources resources) {
        this.f12434v = null;
        this.f12436y = null;
        this.f12437z = null;
        a aVar = new a();
        this.f12431A = aVar;
        this.f12433i = context;
        if (c0124c != null) {
            this.f12432e = c0124c;
        } else {
            this.f12432e = new C0124c(context, c0124c, aVar, resources);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
