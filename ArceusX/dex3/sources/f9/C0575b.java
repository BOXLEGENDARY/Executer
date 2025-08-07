package f9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.roblox.client.personasdk.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf9/b;", "Lf9/a;", "<init>", "()V", "Ljava/io/File;", "file", "", "", "exifData", "", "d", "(Ljava/io/File;Ljava/util/Map;)V", "c", "(Ljava/io/File;)Ljava/util/Map;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "b", "(Landroid/graphics/BitmapFactory$Options;II)I", "a", "(Ljava/io/File;)V", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0575b implements InterfaceC0574a {
    private final int b(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        if (i > reqHeight || i2 > reqWidth) {
            return Math.min(ca.a.b(i / reqHeight), ca.a.b(i2 / reqWidth));
        }
        return 1;
    }

    private final Map<String, String> c(File file) {
        try {
            List listM = CollectionsKt.m(new String[]{"DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance"});
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                L0.a aVar = new L0.a(fileInputStream);
                List list = listM;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, aVar.m((String) obj));
                }
                X9.c.a(fileInputStream, (Throwable) null);
                return linkedHashMap;
            } finally {
            }
        } catch (IOException unused) {
            return F.h();
        }
    }

    private final void d(File file, Map<String, String> exifData) {
        try {
            L0.a aVar = new L0.a(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    aVar.i0(str, str2);
                }
            }
            aVar.d0();
        } catch (IOException unused) {
        }
    }

    @Override
    public void a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Map<String, String> mapC = c(file);
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = b(options, 2000, 2000);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmapDecodeFile != null) {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                } finally {
                }
            }
            X9.c.a(fileOutputStream, (Throwable) null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
        } catch (IllegalArgumentException unused) {
        }
        d(file, mapC);
    }
}
