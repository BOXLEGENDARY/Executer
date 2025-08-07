package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class j {

    private static final int[] f9292c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    private final ProgressBar f9293a;

    private Bitmap f9294b;

    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i7) {
            layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
            layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
            layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
            layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
            layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
            layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
            layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
            layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
            layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
        }
    }

    j(ProgressBar progressBar) {
        this.f9293a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i7 = 0; i7 < numberOfFrames; i7++) {
            Drawable drawableD = d(animationDrawable.getFrame(i7), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i7));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f9294b;
    }

    void c(AttributeSet attributeSet, int i7) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f9293a.getContext(), attributeSet, f9292c, i7, 0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.f9293a.setIndeterminateDrawable(e(drawableIfKnown));
        }
        Drawable drawableIfKnown2 = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.f9293a.setProgressDrawable(d(drawableIfKnown2, false));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    Drawable d(Drawable drawable, boolean z7) {
        if (drawable instanceof q0.b) {
            q0.b bVar = (q0.b) drawable;
            Drawable drawableB = bVar.b();
            if (drawableB != null) {
                bVar.a(d(drawableB, z7));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = d(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    a.a(layerDrawable, layerDrawable2, i8);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f9294b == null) {
                    this.f9294b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
