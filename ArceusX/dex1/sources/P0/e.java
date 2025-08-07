package p0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    static class a {
        static int a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        private final d[] f22633a;

        public c(d[] dVarArr) {
            this.f22633a = dVarArr;
        }

        public d[] a() {
            return this.f22633a;
        }
    }

    public static final class d {

        private final String f22634a;

        private final int f22635b;

        private final boolean f22636c;

        private final String f22637d;

        private final int f22638e;

        private final int f22639f;

        public d(String str, int i7, boolean z7, String str2, int i8, int i9) {
            this.f22634a = str;
            this.f22635b = i7;
            this.f22636c = z7;
            this.f22637d = str2;
            this.f22638e = i8;
            this.f22639f = i9;
        }

        public String a() {
            return this.f22634a;
        }

        public int b() {
            return this.f22639f;
        }

        public int c() {
            return this.f22638e;
        }

        public String d() {
            return this.f22637d;
        }

        public int e() {
            return this.f22635b;
        }

        public boolean f() {
            return this.f22636c;
        }
    }

    public static final class C0216e implements b {

        private final v0.e f22640a;

        private final v0.e f22641b;

        private final int f22642c;

        private final int f22643d;

        private final String f22644e;

        public C0216e(v0.e eVar, v0.e eVar2, int i7, int i8, String str) {
            this.f22640a = eVar;
            this.f22641b = eVar2;
            this.f22643d = i7;
            this.f22642c = i8;
            this.f22644e = str;
        }

        public v0.e a() {
            return this.f22641b;
        }

        public int b() {
            return this.f22643d;
        }

        public v0.e c() {
            return this.f22640a;
        }

        public String d() {
            return this.f22644e;
        }

        public int e() {
            return this.f22642c;
        }
    }

    private static int a(TypedArray typedArray, int i7) {
        return a.a(typedArray, i7);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i7) throws Resources.NotFoundException {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < typedArrayObtainTypedArray.length(); i8++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o0.g.f22401h);
        String string = typedArrayObtainAttributes.getString(o0.g.f22402i);
        String string2 = typedArrayObtainAttributes.getString(o0.g.f22407n);
        String string3 = typedArrayObtainAttributes.getString(o0.g.f22408o);
        String string4 = typedArrayObtainAttributes.getString(o0.g.f22404k);
        int resourceId = typedArrayObtainAttributes.getResourceId(o0.g.f22403j, 0);
        int integer = typedArrayObtainAttributes.getInteger(o0.g.f22405l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(o0.g.f22406m, 500);
        String string5 = typedArrayObtainAttributes.getString(o0.g.f22409p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C0216e(new v0.e(string, string2, string3, listC), string4 != null ? new v0.e(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o0.g.f22410q);
        int i7 = o0.g.f22419z;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = o0.g.f22412s;
        }
        int i8 = typedArrayObtainAttributes.getInt(i7, 400);
        int i9 = o0.g.f22417x;
        if (!typedArrayObtainAttributes.hasValue(i9)) {
            i9 = o0.g.f22413t;
        }
        boolean z7 = 1 == typedArrayObtainAttributes.getInt(i9, 0);
        int i10 = o0.g.f22377A;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = o0.g.f22414u;
        }
        int i11 = o0.g.f22418y;
        if (!typedArrayObtainAttributes.hasValue(i11)) {
            i11 = o0.g.f22415v;
        }
        String string = typedArrayObtainAttributes.getString(i11);
        int i12 = typedArrayObtainAttributes.getInt(i10, 0);
        int i13 = o0.g.f22416w;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = o0.g.f22411r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i8, z7, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
