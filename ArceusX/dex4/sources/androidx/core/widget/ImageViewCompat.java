package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImageViewCompat {
    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList tintList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(tintList);
            if (i == 21) {
                Drawable imageViewDrawable = imageView.getDrawable();
                boolean hasTint = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(imageViewDrawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintList(tintList);
        }
    }

    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void setImageTintMode(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21) {
                Drawable imageViewDrawable = imageView.getDrawable();
                boolean hasTint = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(imageViewDrawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintMode(mode);
        }
    }

    private ImageViewCompat() {
    }
}
