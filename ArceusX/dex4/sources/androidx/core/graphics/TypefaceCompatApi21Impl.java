package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.MotionEventCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RequiresApi(MotionEventCompat.AXIS_WHEEL)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor fd) throws ErrnoException {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (!OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return null;
            }
            return new File(path);
        } catch (ErrnoException e) {
            return null;
        }
    }

    @Override
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fonts, int style) throws IOException {
        if (fonts.length < 1) {
            return null;
        }
        FontsContractCompat.FontInfo bestFont = findBestInfo(fonts, style);
        ContentResolver resolver = context.getContentResolver();
        try {
            ParcelFileDescriptor pfd = resolver.openFileDescriptor(bestFont.getUri(), "r", cancellationSignal);
            try {
                File file = getFile(pfd);
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (pfd != null) {
                        pfd.close();
                    }
                    return typefaceCreateFromFile;
                }
                FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                try {
                    Typeface typefaceCreateFromInputStream = super.createFromInputStream(context, fis);
                    fis.close();
                    pfd.close();
                    return typefaceCreateFromInputStream;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            return null;
        }
    }
}
