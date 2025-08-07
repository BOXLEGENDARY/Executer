package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.graphics.c;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import g0.C2457a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.k;
import q0.C2731a;

public class f extends androidx.vectordrawable.graphics.drawable.e {

    static final PorterDuff.Mode f12447D = PorterDuff.Mode.SRC_IN;

    private final float[] f12448A;

    private final Matrix f12449B;

    private final Rect f12450C;

    private h f12451e;

    private PorterDuffColorFilter f12452i;

    private ColorFilter f12453v;

    private boolean f12454w;

    private boolean f12455y;

    private Drawable.ConstantState f12456z;

    private static class b extends AbstractC0125f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12483b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f12482a = androidx.core.graphics.c.d(string2);
            }
            this.f12484c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f12420d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        int f12503a;

        g f12504b;

        ColorStateList f12505c;

        PorterDuff.Mode f12506d;

        boolean f12507e;

        Bitmap f12508f;

        ColorStateList f12509g;

        PorterDuff.Mode f12510h;

        int f12511i;

        boolean f12512j;

        boolean f12513k;

        Paint f12514l;

        public h(h hVar) {
            this.f12505c = null;
            this.f12506d = f.f12447D;
            if (hVar != null) {
                this.f12503a = hVar.f12503a;
                g gVar = new g(hVar.f12504b);
                this.f12504b = gVar;
                if (hVar.f12504b.f12491e != null) {
                    gVar.f12491e = new Paint(hVar.f12504b.f12491e);
                }
                if (hVar.f12504b.f12490d != null) {
                    this.f12504b.f12490d = new Paint(hVar.f12504b.f12490d);
                }
                this.f12505c = hVar.f12505c;
                this.f12506d = hVar.f12506d;
                this.f12507e = hVar.f12507e;
            }
        }

        public boolean a(int i7, int i8) {
            return i7 == this.f12508f.getWidth() && i8 == this.f12508f.getHeight();
        }

        public boolean b() {
            return !this.f12513k && this.f12509g == this.f12505c && this.f12510h == this.f12506d && this.f12512j == this.f12507e && this.f12511i == this.f12504b.getRootAlpha();
        }

        public void c(int i7, int i8) {
            if (this.f12508f == null || !a(i7, i8)) {
                this.f12508f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f12513k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f12508f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f12514l == null) {
                Paint paint = new Paint();
                this.f12514l = paint;
                paint.setFilterBitmap(true);
            }
            this.f12514l.setAlpha(this.f12504b.getRootAlpha());
            this.f12514l.setColorFilter(colorFilter);
            return this.f12514l;
        }

        public boolean f() {
            return this.f12504b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f12504b.f();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f12503a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f12504b.g(iArr);
            this.f12513k |= zG;
            return zG;
        }

        public void i() {
            this.f12509g = this.f12505c;
            this.f12510h = this.f12506d;
            this.f12511i = this.f12504b.getRootAlpha();
            this.f12512j = this.f12507e;
            this.f12513k = false;
        }

        public void j(int i7, int i8) {
            this.f12508f.eraseColor(0);
            this.f12504b.b(new Canvas(this.f12508f), i7, i8, null);
        }

        @Override
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f12505c = null;
            this.f12506d = f.f12447D;
            this.f12504b = new g();
        }
    }

    f() {
        this.f12455y = true;
        this.f12448A = new float[9];
        this.f12449B = new Matrix();
        this.f12450C = new Rect();
        this.f12451e = new h();
    }

    static int a(int i7, float f7) {
        return (i7 & 16777215) | (((int) (Color.alpha(i7) * f7)) << 24);
    }

    public static f b(Resources resources, int i7, Resources.Theme theme) {
        f fVar = new f();
        fVar.f12446d = p0.h.e(resources, i7, theme);
        fVar.f12456z = new i(fVar.f12446d.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f12451e;
        g gVar = hVar.f12504b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f12494h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12470b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f12502p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f12503a = cVar.f12485d | hVar.f12503a;
                    z7 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12470b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f12502p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f12503a = bVar.f12485d | hVar.f12503a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12470b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f12502p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f12503a = dVar2.f12479k | hVar.f12503a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && C2731a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f12451e;
        g gVar = hVar.f12504b;
        hVar.f12506d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f12505c = colorStateListC;
        }
        hVar.f12507e = k.a(typedArray, xmlPullParser, wtzgsqRsIZB.HBrLqIATqVo, 5, hVar.f12507e);
        gVar.f12497k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f12497k);
        float f7 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f12498l);
        gVar.f12498l = f7;
        if (gVar.f12497k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f12495i = typedArray.getDimension(3, gVar.f12495i);
        float dimension = typedArray.getDimension(2, gVar.f12496j);
        gVar.f12496j = dimension;
        if (gVar.f12495i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f12500n = string;
            gVar.f12502p.put(string, gVar);
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f12451e.f12504b.f12502p.get(str);
    }

    @Override
    public boolean canApplyTheme() {
        Drawable drawable = this.f12446d;
        if (drawable == null) {
            return false;
        }
        C2731a.b(drawable);
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
        copyBounds(this.f12450C);
        if (this.f12450C.width() <= 0 || this.f12450C.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f12453v;
        if (colorFilter == null) {
            colorFilter = this.f12452i;
        }
        canvas.getMatrix(this.f12449B);
        this.f12449B.getValues(this.f12448A);
        float fAbs = Math.abs(this.f12448A[0]);
        float fAbs2 = Math.abs(this.f12448A[4]);
        float fAbs3 = Math.abs(this.f12448A[1]);
        float fAbs4 = Math.abs(this.f12448A[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f12450C.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f12450C.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f12450C;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f12450C.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f12450C.offsetTo(0, 0);
        this.f12451e.c(iMin, iMin2);
        if (!this.f12455y) {
            this.f12451e.j(iMin, iMin2);
        } else if (!this.f12451e.b()) {
            this.f12451e.j(iMin, iMin2);
            this.f12451e.i();
        }
        this.f12451e.d(canvas, colorFilter, this.f12450C);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z7) {
        this.f12455y = z7;
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.d(drawable) : this.f12451e.f12504b.getRootAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f12451e.getChangingConfigurations();
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.e(drawable) : this.f12453v;
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f12446d != null) {
            return new i(this.f12446d.getConstantState());
        }
        this.f12451e.f12503a = getChangingConfigurations();
        return this.f12451e;
    }

    @Override
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f12451e.f12504b.f12496j;
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f12451e.f12504b.f12495i;
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
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public void invalidateSelf() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f12446d;
        return drawable != null ? C2731a.h(drawable) : this.f12451e.f12507e;
    }

    @Override
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f12451e) != null && (hVar.g() || ((colorStateList = this.f12451e.f12505c) != null && colorStateList.isStateful())));
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
            return this;
        }
        if (!this.f12454w && super.mutate() == this) {
            this.f12451e = new h(this.f12451e);
            this.f12454w = true;
        }
        return this;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f12451e;
        ColorStateList colorStateList = hVar.f12505c;
        if (colorStateList == null || (mode = hVar.f12506d) == null) {
            z7 = false;
        } else {
            this.f12452i = i(this.f12452i, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override
    public void setAlpha(int i7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f12451e.f12504b.getRootAlpha() != i7) {
            this.f12451e.f12504b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.j(drawable, z7);
        } else {
            this.f12451e.f12507e = z7;
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
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f12451e;
        if (hVar.f12505c != colorStateList) {
            hVar.f12505c = colorStateList;
            this.f12452i = i(this.f12452i, colorStateList, hVar.f12506d);
            invalidateSelf();
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.p(drawable, mode);
            return;
        }
        h hVar = this.f12451e;
        if (hVar.f12506d != mode) {
            hVar.f12506d = mode;
            this.f12452i = i(this.f12452i, hVar.f12505c, mode);
            invalidateSelf();
        }
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        private final Drawable.ConstantState f12515a;

        public i(Drawable.ConstantState constantState) {
            this.f12515a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f12515a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f12515a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f12446d = (VectorDrawable) this.f12515a.newDrawable();
            return fVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f12446d = (VectorDrawable) this.f12515a.newDrawable(resources);
            return fVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f12446d = (VectorDrawable) this.f12515a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12453v = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class AbstractC0125f extends e {

        protected c.b[] f12482a;

        String f12483b;

        int f12484c;

        int f12485d;

        public AbstractC0125f() {
            super();
            this.f12482a = null;
            this.f12484c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f12482a;
            if (bVarArr != null) {
                c.b.h(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f12482a;
        }

        public String getPathName() {
            return this.f12483b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.b(this.f12482a, bVarArr)) {
                androidx.core.graphics.c.k(this.f12482a, bVarArr);
            } else {
                this.f12482a = androidx.core.graphics.c.f(bVarArr);
            }
        }

        public AbstractC0125f(AbstractC0125f abstractC0125f) {
            super();
            this.f12482a = null;
            this.f12484c = 0;
            this.f12483b = abstractC0125f.f12483b;
            this.f12485d = abstractC0125f.f12485d;
            this.f12482a = androidx.core.graphics.c.f(abstractC0125f.f12482a);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f12451e;
        hVar.f12504b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f12417a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f12503a = getChangingConfigurations();
        hVar.f12513k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f12452i = i(this.f12452i, hVar.f12505c, hVar.f12506d);
    }

    f(h hVar) {
        this.f12455y = true;
        this.f12448A = new float[9];
        this.f12449B = new Matrix();
        this.f12450C = new Rect();
        this.f12451e = hVar;
        this.f12452i = i(this.f12452i, hVar.f12505c, hVar.f12506d);
    }

    private static class c extends AbstractC0125f {

        private int[] f12457e;

        p0.d f12458f;

        float f12459g;

        p0.d f12460h;

        float f12461i;

        float f12462j;

        float f12463k;

        float f12464l;

        float f12465m;

        Paint.Cap f12466n;

        Paint.Join f12467o;

        float f12468p;

        c() {
            this.f12459g = 0.0f;
            this.f12461i = 1.0f;
            this.f12462j = 1.0f;
            this.f12463k = 0.0f;
            this.f12464l = 1.0f;
            this.f12465m = 0.0f;
            this.f12466n = Paint.Cap.BUTT;
            this.f12467o = Paint.Join.MITER;
            this.f12468p = 4.0f;
        }

        private Paint.Cap e(int i7, Paint.Cap cap) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i7, Paint.Join join) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f12457e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f12483b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f12482a = androidx.core.graphics.c.d(string2);
                }
                this.f12460h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f12462j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f12462j);
                this.f12466n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f12466n);
                this.f12467o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f12467o);
                this.f12468p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12468p);
                this.f12458f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f12461i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12461i);
                this.f12459g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f12459g);
                this.f12464l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12464l);
                this.f12465m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12465m);
                this.f12463k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f12463k);
                this.f12484c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f12484c);
            }
        }

        @Override
        public boolean a() {
            return this.f12460h.i() || this.f12458f.i();
        }

        @Override
        public boolean b(int[] iArr) {
            return this.f12458f.j(iArr) | this.f12460h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f12419c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f12462j;
        }

        int getFillColor() {
            return this.f12460h.e();
        }

        float getStrokeAlpha() {
            return this.f12461i;
        }

        int getStrokeColor() {
            return this.f12458f.e();
        }

        float getStrokeWidth() {
            return this.f12459g;
        }

        float getTrimPathEnd() {
            return this.f12464l;
        }

        float getTrimPathOffset() {
            return this.f12465m;
        }

        float getTrimPathStart() {
            return this.f12463k;
        }

        void setFillAlpha(float f7) {
            this.f12462j = f7;
        }

        void setFillColor(int i7) {
            this.f12460h.k(i7);
        }

        void setStrokeAlpha(float f7) {
            this.f12461i = f7;
        }

        void setStrokeColor(int i7) {
            this.f12458f.k(i7);
        }

        void setStrokeWidth(float f7) {
            this.f12459g = f7;
        }

        void setTrimPathEnd(float f7) {
            this.f12464l = f7;
        }

        void setTrimPathOffset(float f7) {
            this.f12465m = f7;
        }

        void setTrimPathStart(float f7) {
            this.f12463k = f7;
        }

        c(c cVar) {
            super(cVar);
            this.f12459g = 0.0f;
            this.f12461i = 1.0f;
            this.f12462j = 1.0f;
            this.f12463k = 0.0f;
            this.f12464l = 1.0f;
            this.f12465m = 0.0f;
            this.f12466n = Paint.Cap.BUTT;
            this.f12467o = Paint.Join.MITER;
            this.f12468p = 4.0f;
            this.f12457e = cVar.f12457e;
            this.f12458f = cVar.f12458f;
            this.f12459g = cVar.f12459g;
            this.f12461i = cVar.f12461i;
            this.f12460h = cVar.f12460h;
            this.f12484c = cVar.f12484c;
            this.f12462j = cVar.f12462j;
            this.f12463k = cVar.f12463k;
            this.f12464l = cVar.f12464l;
            this.f12465m = cVar.f12465m;
            this.f12466n = cVar.f12466n;
            this.f12467o = cVar.f12467o;
            this.f12468p = cVar.f12468p;
        }
    }

    private static class g {

        private static final Matrix f12486q = new Matrix();

        private final Path f12487a;

        private final Path f12488b;

        private final Matrix f12489c;

        Paint f12490d;

        Paint f12491e;

        private PathMeasure f12492f;

        private int f12493g;

        final d f12494h;

        float f12495i;

        float f12496j;

        float f12497k;

        float f12498l;

        int f12499m;

        String f12500n;

        Boolean f12501o;

        final C2457a<String, Object> f12502p;

        public g() {
            this.f12489c = new Matrix();
            this.f12495i = 0.0f;
            this.f12496j = 0.0f;
            this.f12497k = 0.0f;
            this.f12498l = 0.0f;
            this.f12499m = 255;
            this.f12500n = null;
            this.f12501o = null;
            this.f12502p = new C2457a<>();
            this.f12494h = new d();
            this.f12487a = new Path();
            this.f12488b = new Path();
        }

        private static float a(float f7, float f8, float f9, float f10) {
            return (f7 * f10) - (f8 * f9);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            dVar.f12469a.set(matrix);
            dVar.f12469a.preConcat(dVar.f12478j);
            canvas.save();
            for (int i9 = 0; i9 < dVar.f12470b.size(); i9++) {
                e eVar = dVar.f12470b.get(i9);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f12469a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof AbstractC0125f) {
                    d(dVar, (AbstractC0125f) eVar, canvas, i7, i8, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0125f abstractC0125f, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f7 = i7 / this.f12497k;
            float f8 = i8 / this.f12498l;
            float fMin = Math.min(f7, f8);
            Matrix matrix = dVar.f12469a;
            this.f12489c.set(matrix);
            this.f12489c.postScale(f7, f8);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0125f.d(this.f12487a);
            Path path = this.f12487a;
            this.f12488b.reset();
            if (abstractC0125f.c()) {
                this.f12488b.setFillType(abstractC0125f.f12484c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f12488b.addPath(path, this.f12489c);
                canvas.clipPath(this.f12488b);
                return;
            }
            c cVar = (c) abstractC0125f;
            float f9 = cVar.f12463k;
            if (f9 != 0.0f || cVar.f12464l != 1.0f) {
                float f10 = cVar.f12465m;
                float f11 = (f9 + f10) % 1.0f;
                float f12 = (cVar.f12464l + f10) % 1.0f;
                if (this.f12492f == null) {
                    this.f12492f = new PathMeasure();
                }
                this.f12492f.setPath(this.f12487a, false);
                float length = this.f12492f.getLength();
                float f13 = f11 * length;
                float f14 = f12 * length;
                path.reset();
                if (f13 > f14) {
                    this.f12492f.getSegment(f13, length, path, true);
                    this.f12492f.getSegment(0.0f, f14, path, true);
                } else {
                    this.f12492f.getSegment(f13, f14, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f12488b.addPath(path, this.f12489c);
            if (cVar.f12460h.l()) {
                p0.d dVar2 = cVar.f12460h;
                if (this.f12491e == null) {
                    Paint paint = new Paint(1);
                    this.f12491e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f12491e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f12489c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f12462j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f12462j));
                }
                paint2.setColorFilter(colorFilter);
                this.f12488b.setFillType(cVar.f12484c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f12488b, paint2);
            }
            if (cVar.f12458f.l()) {
                p0.d dVar3 = cVar.f12458f;
                if (this.f12490d == null) {
                    Paint paint3 = new Paint(1);
                    this.f12490d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f12490d;
                Paint.Join join = cVar.f12467o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f12466n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f12468p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f12489c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f12461i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f12461i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f12459g * fMin * fE);
                canvas.drawPath(this.f12488b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            c(this.f12494h, f12486q, canvas, i7, i8, colorFilter);
        }

        public boolean f() {
            if (this.f12501o == null) {
                this.f12501o = Boolean.valueOf(this.f12494h.a());
            }
            return this.f12501o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f12494h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f12499m;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f12499m = i7;
        }

        public g(g gVar) {
            this.f12489c = new Matrix();
            this.f12495i = 0.0f;
            this.f12496j = 0.0f;
            this.f12497k = 0.0f;
            this.f12498l = 0.0f;
            this.f12499m = 255;
            this.f12500n = null;
            this.f12501o = null;
            C2457a<String, Object> c2457a = new C2457a<>();
            this.f12502p = c2457a;
            this.f12494h = new d(gVar.f12494h, c2457a);
            this.f12487a = new Path(gVar.f12487a);
            this.f12488b = new Path(gVar.f12488b);
            this.f12495i = gVar.f12495i;
            this.f12496j = gVar.f12496j;
            this.f12497k = gVar.f12497k;
            this.f12498l = gVar.f12498l;
            this.f12493g = gVar.f12493g;
            this.f12499m = gVar.f12499m;
            this.f12500n = gVar.f12500n;
            String str = gVar.f12500n;
            if (str != null) {
                c2457a.put(str, this);
            }
            this.f12501o = gVar.f12501o;
        }
    }

    private static class d extends e {

        final Matrix f12469a;

        final ArrayList<e> f12470b;

        float f12471c;

        private float f12472d;

        private float f12473e;

        private float f12474f;

        private float f12475g;

        private float f12476h;

        private float f12477i;

        final Matrix f12478j;

        int f12479k;

        private int[] f12480l;

        private String f12481m;

        public d(d dVar, C2457a<String, Object> c2457a) {
            AbstractC0125f bVar;
            super();
            this.f12469a = new Matrix();
            this.f12470b = new ArrayList<>();
            this.f12471c = 0.0f;
            this.f12472d = 0.0f;
            this.f12473e = 0.0f;
            this.f12474f = 1.0f;
            this.f12475g = 1.0f;
            this.f12476h = 0.0f;
            this.f12477i = 0.0f;
            Matrix matrix = new Matrix();
            this.f12478j = matrix;
            this.f12481m = null;
            this.f12471c = dVar.f12471c;
            this.f12472d = dVar.f12472d;
            this.f12473e = dVar.f12473e;
            this.f12474f = dVar.f12474f;
            this.f12475g = dVar.f12475g;
            this.f12476h = dVar.f12476h;
            this.f12477i = dVar.f12477i;
            this.f12480l = dVar.f12480l;
            String str = dVar.f12481m;
            this.f12481m = str;
            this.f12479k = dVar.f12479k;
            if (str != null) {
                c2457a.put(str, this);
            }
            matrix.set(dVar.f12478j);
            ArrayList<e> arrayList = dVar.f12470b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                e eVar = arrayList.get(i7);
                if (eVar instanceof d) {
                    this.f12470b.add(new d((d) eVar, c2457a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f12470b.add(bVar);
                    String str2 = bVar.f12483b;
                    if (str2 != null) {
                        c2457a.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f12478j.reset();
            this.f12478j.postTranslate(-this.f12472d, -this.f12473e);
            this.f12478j.postScale(this.f12474f, this.f12475g);
            this.f12478j.postRotate(this.f12471c, 0.0f, 0.0f);
            this.f12478j.postTranslate(this.f12476h + this.f12472d, this.f12477i + this.f12473e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12480l = null;
            this.f12471c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f12471c);
            this.f12472d = typedArray.getFloat(1, this.f12472d);
            this.f12473e = typedArray.getFloat(2, this.f12473e);
            this.f12474f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f12474f);
            this.f12475g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f12475g);
            this.f12476h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f12476h);
            this.f12477i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f12477i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12481m = string;
            }
            d();
        }

        @Override
        public boolean a() {
            for (int i7 = 0; i7 < this.f12470b.size(); i7++) {
                if (this.f12470b.get(i7).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i7 = 0; i7 < this.f12470b.size(); i7++) {
                zB |= this.f12470b.get(i7).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f12418b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f12481m;
        }

        public Matrix getLocalMatrix() {
            return this.f12478j;
        }

        public float getPivotX() {
            return this.f12472d;
        }

        public float getPivotY() {
            return this.f12473e;
        }

        public float getRotation() {
            return this.f12471c;
        }

        public float getScaleX() {
            return this.f12474f;
        }

        public float getScaleY() {
            return this.f12475g;
        }

        public float getTranslateX() {
            return this.f12476h;
        }

        public float getTranslateY() {
            return this.f12477i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f12472d) {
                this.f12472d = f7;
                d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f12473e) {
                this.f12473e = f7;
                d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f12471c) {
                this.f12471c = f7;
                d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f12474f) {
                this.f12474f = f7;
                d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f12475g) {
                this.f12475g = f7;
                d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f12476h) {
                this.f12476h = f7;
                d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f12477i) {
                this.f12477i = f7;
                d();
            }
        }

        public d() {
            super();
            this.f12469a = new Matrix();
            this.f12470b = new ArrayList<>();
            this.f12471c = 0.0f;
            this.f12472d = 0.0f;
            this.f12473e = 0.0f;
            this.f12474f = 1.0f;
            this.f12475g = 1.0f;
            this.f12476h = 0.0f;
            this.f12477i = 0.0f;
            this.f12478j = new Matrix();
            this.f12481m = null;
        }
    }
}
