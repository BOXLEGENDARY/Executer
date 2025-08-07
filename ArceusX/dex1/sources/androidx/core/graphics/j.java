package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p0.e;
import v0.k;

public class j extends k {
    private Font h(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iJ = j(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int iJ2 = j(fontStyle, font2.getStyle());
            if (iJ2 < iJ) {
                font = font2;
                iJ = iJ2;
            }
        }
        return font;
    }

    private static FontFamily i(CancellationSignal cancellationSignal, k.b[] bVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (k.b bVar : bVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i7) {
        try {
            FontFamily fontFamilyI = i(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyI == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyI).setStyle(h(fontFamilyI, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyI = i(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyI == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyI);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily fontFamilyI2 = i(cancellationSignal, list.get(i8), contentResolver);
                if (fontFamilyI2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyI2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyI, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override
    public Typeface d(Context context, Resources resources, int i7, String str, int i8) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override
    protected k.b g(k.b[] bVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
