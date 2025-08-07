package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import g1.kQwt.YGBtcyQ;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import x0.C2985b;

public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private b mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final HashMap<String, b> sCache = new HashMap<>();

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    static class c implements b {

        private final String f10559a;

        private final HashMap<String, File> f10560b = new HashMap<>();

        c(String str) {
            this.f10559a = str;
        }

        private boolean d(String str, String str2) {
            String strRemoveTrailingSlash = FileProvider.removeTrailingSlash(str);
            String strRemoveTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
            if (!strRemoveTrailingSlash.equals(strRemoveTrailingSlash2)) {
                if (!strRemoveTrailingSlash.startsWith(strRemoveTrailingSlash2 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public File a(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f10560b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override
        public Uri b(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f10560b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f10559a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) throws IOException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f10560b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, i7);
        return strArr2;
    }

    static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i7);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private b getLocalPathStrategy() {
        b bVar;
        synchronized (this.mLock) {
            try {
                C2985b.d(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                bVar = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static b getPathStrategy(Context context, String str, int i7) {
        b pathStrategy;
        HashMap<String, b> map = sCache;
        synchronized (map) {
            try {
                pathStrategy = map.get(str);
                if (pathStrategy == null) {
                    try {
                        try {
                            pathStrategy = parsePathStrategy(context, str, i7);
                            map.put(str, pathStrategy);
                        } catch (IOException e7) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                        }
                    } catch (XmlPullParserException e8) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str, 0).b(file);
    }

    private static int modeToMode(String str) {
        if (YGBtcyQ.yIGxLl.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b parsePathStrategy(Context context, String str, int i7) throws XmlPullParserException, IOException {
        c cVar = new c(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, ATTR_NAME);
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] fileArrG = androidx.core.content.a.g(context, null);
                    if (fileArrG.length > 0) {
                        externalStorageDirectory = fileArrG[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] fileArrF = androidx.core.content.a.f(context);
                    if (fileArrF.length > 0) {
                        externalStorageDirectory = fileArrF[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] fileArrA = a.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    cVar.c(attributeValue, buildPath(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    public static String removeTrailingSlash(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, b> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return getLocalPathStrategy().a(uri).delete() ? 1 : 0;
    }

    @Override
    public String getType(Uri uri) {
        File fileA = getLocalPathStrategy().a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(getLocalPathStrategy().a(uri), modeToMode(str));
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        File fileA = getLocalPathStrategy().a(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(fileA.length());
            }
            i8 = i7;
        }
        String[] strArrCopyOf = copyOf(strArr3, i8);
        Object[] objArrCopyOf = copyOf(objArr, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i7) {
        this.mLock = new Object();
        this.mResourceId = i7;
    }

    private static Object[] copyOf(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        return objArr2;
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(wtzgsqRsIZB.olensnXQ, str2).build();
    }
}
