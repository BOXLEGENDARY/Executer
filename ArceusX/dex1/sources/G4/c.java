package G4;

import E4.r0;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class c {

    private static final r0 f1387c = new r0("LocalTestingConfigParser");

    private final XmlPullParser f1388a;

    private final u f1389b = v.c();

    c(XmlPullParser xmlPullParser) {
        this.f1388a = xmlPullParser;
    }

    public static v a(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return v.f1433a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final c cVar = new c(xmlPullParserNewPullParser);
                cVar.e("local-testing-config", new z() {
                    @Override
                    public final void zza() throws XmlPullParserException, IOException {
                        this.f1436a.d();
                    }
                });
                v vVarE = cVar.f1389b.e();
                fileReader.close();
                return vVarE;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e7) {
            f1387c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e7.getMessage());
            return v.f1433a;
        }
    }

    public static void b(final c cVar) throws XmlPullParserException, IOException {
        for (int i7 = 0; i7 < cVar.f1388a.getAttributeCount(); i7++) {
            if ("defaultErrorCode".equals(cVar.f1388a.getAttributeName(i7))) {
                cVar.f1389b.a(F4.a.a(cVar.f1388a.getAttributeValue(i7)));
            }
        }
        cVar.e("split-install-error", new z() {
            @Override
            public final void zza() throws XmlPullParserException {
                c.c(this.f1434a);
            }
        });
    }

    public static void c(c cVar) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i7 = 0; i7 < cVar.f1388a.getAttributeCount(); i7++) {
            if ("module".equals(cVar.f1388a.getAttributeName(i7))) {
                attributeValue = cVar.f1388a.getAttributeValue(i7);
            }
            if ("errorCode".equals(cVar.f1388a.getAttributeName(i7))) {
                attributeValue2 = cVar.f1388a.getAttributeValue(i7);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), cVar.f1388a, null);
        }
        cVar.f1389b.d().put(attributeValue, Integer.valueOf(F4.a.a(attributeValue2)));
        while (cVar.f1388a.next() != 3) {
        }
    }

    private final void e(String str, z zVar) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.f1388a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f1388a.getEventType() == 2) {
                if (!this.f1388a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f1388a.getName()), this.f1388a, null);
                }
                zVar.zza();
            }
        }
    }

    final void d() throws XmlPullParserException, IOException {
        e("split-install-errors", new z() {
            @Override
            public final void zza() throws XmlPullParserException, IOException {
                c.b(this.f1435a);
            }
        });
    }
}
