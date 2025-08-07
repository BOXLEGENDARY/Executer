package m6;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Objects;

public abstract class AbstractC2608j extends EngineJavaCallback2 {
    private static OutputStream q(String str) throws IOException {
        String strR = r(str);
        if (Build.VERSION.SDK_INT < 29) {
            return new FileOutputStream(new File(strR.startsWith("image/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : strR.startsWith("video/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str));
        }
        ContentResolver contentResolver = RobloxApplication.a().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", strR);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        Uri uriInsert = strR.startsWith("image/") ? contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : strR.startsWith("video/") ? contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues) : contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        Objects.requireNonNull(uriInsert);
        return contentResolver.openOutputStream(uriInsert);
    }

    private static String r(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void s(String str) throws IOException {
        boolean z7;
        String str2;
        String name = new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream outputStreamQ = q(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int i7 = fileInputStream.read(bArr);
                if (i7 <= 0) {
                    break;
                } else {
                    outputStreamQ.write(bArr, 0, i7);
                }
            }
            fileInputStream.close();
            outputStreamQ.close();
            str2 = BuildConfig.FLAVOR;
            z7 = true;
        } catch (IOException e7) {
            h7.l.k("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e7);
            String message = e7.getMessage();
            z7 = false;
            str2 = message;
        }
        if (j6.d.a().U2() && r(name).equals("video/mp4")) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        NativeGLInterface.nativeImageSavedToAlbumFinished(name, z7, str2);
    }

    public void c(int i7) {
        if (i7 == 3) {
            p().e();
        }
    }

    public void d() {
        P p7 = p();
        if (p7 != null) {
            p7.a();
        }
    }

    public void g(String str) {
        P p7 = p();
        if (p7 != null) {
            p7.d(str);
        }
    }

    public void h() {
        P p7 = p();
        if (p7 != null) {
            p7.c();
        }
    }

    public void m(String str) throws IOException {
        s(str);
    }

    public void o(long j7, boolean z7, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        P p7 = p();
        if (p7 != null) {
            p7.b(j7, z7, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    public abstract P p();
}
