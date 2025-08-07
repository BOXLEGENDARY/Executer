package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {

    private final ConstraintLayout f9897a;

    d f9898b;

    int f9899c = -1;

    int f9900d = -1;

    private SparseArray<a> f9901e = new SparseArray<>();

    private SparseArray<d> f9902f = new SparseArray<>();

    static class a {

        int f9903a;

        ArrayList<b> f9904b = new ArrayList<>();

        int f9905c;

        d f9906d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f9905c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f10168e5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.f10175f5) {
                    this.f9903a = typedArrayObtainStyledAttributes.getResourceId(index, this.f9903a);
                } else if (index == i.f10182g5) {
                    this.f9905c = typedArrayObtainStyledAttributes.getResourceId(index, this.f9905c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9905c);
                    context.getResources().getResourceName(this.f9905c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f9906d = dVar;
                        dVar.e(context, this.f9905c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f9904b.add(bVar);
        }

        public int b(float f7, float f8) {
            for (int i7 = 0; i7 < this.f9904b.size(); i7++) {
                if (this.f9904b.get(i7).a(f7, f8)) {
                    return i7;
                }
            }
            return -1;
        }
    }

    static class b {

        float f9907a;

        float f9908b;

        float f9909c;

        float f9910d;

        int f9911e;

        d f9912f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f9907a = Float.NaN;
            this.f9908b = Float.NaN;
            this.f9909c = Float.NaN;
            this.f9910d = Float.NaN;
            this.f9911e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f10036A5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.f10042B5) {
                    this.f9911e = typedArrayObtainStyledAttributes.getResourceId(index, this.f9911e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9911e);
                    context.getResources().getResourceName(this.f9911e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f9912f = dVar;
                        dVar.e(context, this.f9911e);
                    }
                } else if (index == i.C5) {
                    this.f9910d = typedArrayObtainStyledAttributes.getDimension(index, this.f9910d);
                } else if (index == i.D5) {
                    this.f9908b = typedArrayObtainStyledAttributes.getDimension(index, this.f9908b);
                } else if (index == i.E5) {
                    this.f9909c = typedArrayObtainStyledAttributes.getDimension(index, this.f9909c);
                } else if (index == i.F5) {
                    this.f9907a = typedArrayObtainStyledAttributes.getDimension(index, this.f9907a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f7, float f8) {
            if (!Float.isNaN(this.f9907a) && f7 < this.f9907a) {
                return false;
            }
            if (!Float.isNaN(this.f9908b) && f8 < this.f9908b) {
                return false;
            }
            if (Float.isNaN(this.f9909c) || f7 <= this.f9909c) {
                return Float.isNaN(this.f9910d) || f8 <= this.f9910d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i7) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f9897a = constraintLayout;
        a(context, i7);
    }

    private void a(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if ("id".equals(xmlPullParser.getAttributeName(i7))) {
                String attributeValue = xmlPullParser.getAttributeValue(i7);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.u(context, xmlPullParser);
                this.f9902f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i7, float f7, float f8) {
        int iB;
        int i8 = this.f9899c;
        if (i8 == i7) {
            a aVarValueAt = i7 == -1 ? this.f9901e.valueAt(0) : this.f9901e.get(i8);
            int i9 = this.f9900d;
            if ((i9 == -1 || !aVarValueAt.f9904b.get(i9).a(f7, f8)) && this.f9900d != (iB = aVarValueAt.b(f7, f8))) {
                d dVar = iB == -1 ? this.f9898b : aVarValueAt.f9904b.get(iB).f9912f;
                if (iB != -1) {
                    int i10 = aVarValueAt.f9904b.get(iB).f9911e;
                }
                if (dVar == null) {
                    return;
                }
                this.f9900d = iB;
                dVar.c(this.f9897a);
                return;
            }
            return;
        }
        this.f9899c = i7;
        a aVar = this.f9901e.get(i7);
        int iB2 = aVar.b(f7, f8);
        d dVar2 = iB2 == -1 ? aVar.f9906d : aVar.f9904b.get(iB2).f9912f;
        if (iB2 != -1) {
            int i11 = aVar.f9904b.get(iB2).f9911e;
        }
        if (dVar2 != null) {
            this.f9900d = iB2;
            dVar2.c(this.f9897a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i7 + ", dim =" + f7 + ", " + f8);
    }
}
