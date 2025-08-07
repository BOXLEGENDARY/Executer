package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

public class b {

    private final AssetManager f11442a;

    private final Executor f11443b;

    private final f.c f11444c;

    private final File f11446e;

    private final String f11447f;

    private final String f11448g;

    private final String f11449h;

    private c[] f11451j;

    private byte[] f11452k;

    private boolean f11450i = false;

    private final byte[] f11445d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f11442a = assetManager;
        this.f11443b = executor;
        this.f11444c = cVar;
        this.f11447f = str;
        this.f11448g = str2;
        this.f11449h = str3;
        this.f11446e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f11442a, this.f11449h);
        } catch (FileNotFoundException e7) {
            this.f11444c.b(9, e7);
        } catch (IOException e8) {
            this.f11444c.b(7, e8);
        } catch (IllegalStateException e9) {
            this.f11451j = null;
            this.f11444c.b(8, e9);
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f11451j = g.r(inputStreamH, g.p(inputStreamH, g.f11472b), bArr, cVarArr);
            inputStreamH.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f11450i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            return i.f11484a;
        }
        switch (i7) {
            case 26:
                return i.f11487d;
            case 27:
                return i.f11486c;
            case 28:
            case 29:
            case 30:
                return i.f11485b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f11448g);
        } catch (FileNotFoundException e7) {
            this.f11444c.b(6, e7);
            return null;
        } catch (IOException e8) {
            this.f11444c.b(7, e8);
            return null;
        }
    }

    public void g(int i7, Object obj) {
        this.f11444c.b(i7, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f11444c.a(5, null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    try {
                        c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f11471a), this.f11447f);
                        try {
                            inputStream.close();
                            return cVarArrX;
                        } catch (IOException e7) {
                            this.f11444c.b(7, e7);
                            return cVarArrX;
                        }
                    } catch (IOException e8) {
                        this.f11444c.b(7, e8);
                        return null;
                    }
                } catch (IllegalStateException e9) {
                    this.f11444c.b(8, e9);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e10) {
                this.f11444c.b(7, e10);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                this.f11444c.b(7, e11);
            }
            throw th;
        }
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void l(final int i7, final Object obj) {
        this.f11443b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7635d.g(i7, obj);
            }
        });
    }

    public boolean e() {
        if (this.f11445d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f11446e.exists()) {
            try {
                if (!this.f11446e.createNewFile()) {
                    l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f11446e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f11450i = true;
        return true;
    }

    public b i() {
        b bVarB;
        c();
        if (this.f11445d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f11442a);
        if (inputStreamF != null) {
            this.f11451j = j(inputStreamF);
        }
        c[] cVarArr = this.f11451j;
        return (cVarArr == null || !k() || (bVarB = b(cVarArr, this.f11445d)) == null) ? this : bVarB;
    }

    public b m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f11451j;
        byte[] bArr = this.f11445d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e7) {
                this.f11444c.b(7, e7);
            } catch (IllegalStateException e8) {
                this.f11444c.b(8, e8);
            }
            if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                this.f11444c.b(5, null);
                this.f11451j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f11452k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f11451j = null;
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f11452k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f11446e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                l(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                l(6, e7);
                return false;
            } catch (IOException e8) {
                l(7, e8);
                return false;
            }
        } finally {
            this.f11452k = null;
            this.f11451j = null;
        }
    }
}
