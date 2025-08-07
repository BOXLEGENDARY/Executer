package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.g;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

class t {

    static class a implements Executor {

        private final Object f8727d = new Object();

        final Queue<Runnable> f8728e = new ArrayDeque();

        final Executor f8729i;

        Runnable f8730v;

        a(Executor executor) {
            this.f8729i = executor;
        }

        public void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f8727d) {
                try {
                    Runnable runnablePoll = this.f8728e.poll();
                    this.f8730v = runnablePoll;
                    if (runnablePoll != null) {
                        this.f8729i.execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void execute(final Runnable runnable) {
            synchronized (this.f8727d) {
                try {
                    this.f8728e.add(new Runnable() {
                        @Override
                        public final void run() {
                            this.f8725d.b(runnable);
                        }
                    });
                    if (this.f8730v == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static void a(Context context, String str) throws IOException {
        if (str.equals(BuildConfig.FLAVOR)) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", vxbbqXNtzfMxs.YXNpJO + str + " persisted successfully.");
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e7);
                if (fileOutputStreamOpenFileOutput != null) {
                }
            }
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused2) {
                }
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    static java.lang.String b(android.content.Context r9) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t.b(android.content.Context):java.lang.String");
    }

    static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (g.k().e()) {
                    String strB = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        g.b.b(systemService, g.a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
