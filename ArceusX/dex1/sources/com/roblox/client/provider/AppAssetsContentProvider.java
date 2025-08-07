package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import h7.l;
import j6.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import k0.BAKp.xAQOwX;

public class AppAssetsContentProvider extends ContentProvider {

    private static final String[] f20162e = {"_display_name", "_size"};

    private final String f20163d = "AppAssetsContentProvider";

    private boolean a() {
        if (!d.a().k3()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith("com.roblox.client") || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public String getType(Uri uri) {
        l.a("AppAssetsContentProvider", xAQOwX.uiIwCa + uri.toString());
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws IOException {
        l.a("AppAssetsContentProvider", "openAssetFile: " + uri.toString());
        if (!a()) {
            return null;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        try {
            if (!file.getCanonicalPath().startsWith(getContext().getFilesDir().getCanonicalPath())) {
                throw new SecurityException();
            }
            if (file.exists()) {
                return new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0L, -1L);
            }
            throw new FileNotFoundException();
        } catch (IOException unused) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        l.a("AppAssetsContentProvider", "query: " + uri.toString());
        if (!a()) {
            return null;
        }
        if (strArr == null) {
            strArr = f20162e;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        long length = file.exists() ? file.length() : 0L;
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = uri.getLastPathSegment();
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(length);
            }
            i8 = i7;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
