package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import t2.Dbl.hgESaf;
import x0.C2985b;

public class IconCompat extends CustomVersionedParcelable {

    static final PorterDuff.Mode f10568k = PorterDuff.Mode.SRC_IN;

    public int f10569a;

    Object f10570b;

    public byte[] f10571c;

    public Parcelable f10572d;

    public int f10573e;

    public int f10574f;

    public ColorStateList f10575g;

    PorterDuff.Mode f10576h;

    public String f10577i;

    public String f10578j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                return -1;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f10569a) {
                case -1:
                    return (Icon) iconCompat.f10570b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f10570b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f10573e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f10570b, iconCompat.f10573e, iconCompat.f10574f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f10570b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f10570b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f10575g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f10576h;
            if (mode != IconCompat.f10568k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f10569a = -1;
        this.f10571c = null;
        this.f10572d = null;
        this.f10573e = 0;
        this.f10574f = 0;
        this.f10575g = null;
        this.f10576h = f10568k;
        this.f10577i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z7) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f7 = iMin;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z7) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        C2985b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f10570b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Context context, int i7) {
        C2985b.c(context);
        return d(context.getResources(), context.getPackageName(), i7);
    }

    public static IconCompat d(Resources resources, String str, int i7) {
        C2985b.c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f10573e = i7;
        if (resources != null) {
            try {
                iconCompat.f10570b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f10570b = str;
        }
        iconCompat.f10578j = str;
        return iconCompat;
    }

    private static String p(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return hgESaf.rxsxOQJnDZ;
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i7 = this.f10569a;
        if (i7 == -1) {
            Object obj = this.f10570b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f10570b;
        }
        if (i7 == 5) {
            return a((Bitmap) this.f10570b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i7 = this.f10569a;
        if (i7 == -1) {
            return a.a(this.f10570b);
        }
        if (i7 == 2) {
            return this.f10573e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i7 = this.f10569a;
        if (i7 == -1) {
            return a.b(this.f10570b);
        }
        if (i7 == 2) {
            String str = this.f10578j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f10570b).split(":", -1)[0] : this.f10578j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i7 = this.f10569a;
        return i7 == -1 ? a.c(this.f10570b) : i7;
    }

    public Uri i() {
        int i7 = this.f10569a;
        if (i7 == -1) {
            return a.d(this.f10570b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f10570b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e7) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e7);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f10570b));
        } catch (FileNotFoundException e8) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e8);
            return null;
        }
    }

    public void k() {
        this.f10576h = PorterDuff.Mode.valueOf(this.f10577i);
        switch (this.f10569a) {
            case -1:
                Parcelable parcelable = this.f10572d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f10570b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f10572d;
                if (parcelable2 != null) {
                    this.f10570b = parcelable2;
                    return;
                }
                byte[] bArr = this.f10571c;
                this.f10570b = bArr;
                this.f10569a = 3;
                this.f10573e = 0;
                this.f10574f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f10571c, Charset.forName(GObvYfBKohxpYX.lWLABfDdygWkxy));
                this.f10570b = str;
                if (this.f10569a == 2 && this.f10578j == null) {
                    this.f10578j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f10570b = this.f10571c;
                return;
        }
    }

    public void l(boolean z7) {
        this.f10577i = this.f10576h.name();
        int i7 = this.f10569a;
        String str = tAjeAKSIqDqzNP.GFyRqhQ;
        switch (i7) {
            case -1:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f10572d = (Parcelable) this.f10570b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z7) {
                    this.f10572d = (Parcelable) this.f10570b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f10570b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f10571c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f10571c = ((String) this.f10570b).getBytes(Charset.forName(str));
                return;
            case 3:
                this.f10571c = (byte[]) this.f10570b;
                return;
            case 4:
            case 6:
                this.f10571c = this.f10570b.toString().getBytes(Charset.forName(str));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f10569a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f10570b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f10570b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f10570b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f10570b);
                break;
        }
        bundle.putInt("type", this.f10569a);
        bundle.putInt("int1", this.f10573e);
        bundle.putInt("int2", this.f10574f);
        bundle.putString("string1", this.f10578j);
        ColorStateList colorStateList = this.f10575g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f10576h;
        if (mode != f10568k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f10569a == -1) {
            return String.valueOf(this.f10570b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f10569a));
        switch (this.f10569a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f10570b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f10570b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f10578j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f10573e);
                if (this.f10574f != 0) {
                    sb.append(" off=");
                    sb.append(this.f10574f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f10570b);
                break;
        }
        if (this.f10575g != null) {
            sb.append(" tint=");
            sb.append(this.f10575g);
        }
        if (this.f10576h != f10568k) {
            sb.append(" mode=");
            sb.append(this.f10576h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i7) {
        this.f10571c = null;
        this.f10572d = null;
        this.f10573e = 0;
        this.f10574f = 0;
        this.f10575g = null;
        this.f10576h = f10568k;
        this.f10577i = null;
        this.f10569a = i7;
    }
}
