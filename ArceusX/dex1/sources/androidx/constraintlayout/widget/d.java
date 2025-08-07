package androidx.constraintlayout.widget;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import i0.C2482a;
import j0.C2490a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class d {

    private static final int[] f9913d = {0, 4, 8};

    private static SparseIntArray f9914e;

    private HashMap<String, androidx.constraintlayout.widget.a> f9915a = new HashMap<>();

    private boolean f9916b = true;

    private HashMap<Integer, a> f9917c = new HashMap<>();

    public static class a {

        int f9918a;

        public final C0080d f9919b = new C0080d();

        public final c f9920c = new c();

        public final b f9921d = new b();

        public final e f9922e = new e();

        public HashMap<String, androidx.constraintlayout.widget.a> f9923f = new HashMap<>();

        public void f(int i7, ConstraintLayout.b bVar) {
            this.f9918a = i7;
            b bVar2 = this.f9921d;
            bVar2.f9965h = bVar.f9828d;
            bVar2.f9967i = bVar.f9830e;
            bVar2.f9969j = bVar.f9832f;
            bVar2.f9971k = bVar.f9834g;
            bVar2.f9972l = bVar.f9836h;
            bVar2.f9973m = bVar.f9838i;
            bVar2.f9974n = bVar.f9840j;
            bVar2.f9975o = bVar.f9842k;
            bVar2.f9976p = bVar.f9844l;
            bVar2.f9977q = bVar.f9852p;
            bVar2.f9978r = bVar.f9853q;
            bVar2.f9979s = bVar.f9854r;
            bVar2.f9980t = bVar.f9855s;
            bVar2.f9981u = bVar.f9862z;
            bVar2.f9982v = bVar.f9796A;
            bVar2.f9983w = bVar.f9797B;
            bVar2.f9984x = bVar.f9846m;
            bVar2.f9985y = bVar.f9848n;
            bVar2.f9986z = bVar.f9850o;
            bVar2.f9925A = bVar.f9812Q;
            bVar2.f9926B = bVar.f9813R;
            bVar2.f9927C = bVar.f9814S;
            bVar2.f9963g = bVar.f9826c;
            bVar2.f9959e = bVar.f9822a;
            bVar2.f9961f = bVar.f9824b;
            bVar2.f9955c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f9957d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f9928D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f9929E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f9930F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f9931G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f9940P = bVar.f9801F;
            bVar2.f9941Q = bVar.f9800E;
            bVar2.f9943S = bVar.f9803H;
            bVar2.f9942R = bVar.f9802G;
            bVar2.f9966h0 = bVar.f9815T;
            bVar2.f9968i0 = bVar.f9816U;
            bVar2.f9944T = bVar.f9804I;
            bVar2.f9945U = bVar.f9805J;
            bVar2.f9946V = bVar.f9808M;
            bVar2.f9947W = bVar.f9809N;
            bVar2.f9948X = bVar.f9806K;
            bVar2.f9949Y = bVar.f9807L;
            bVar2.f9950Z = bVar.f9810O;
            bVar2.f9952a0 = bVar.f9811P;
            bVar2.f9964g0 = bVar.f9817V;
            bVar2.f9935K = bVar.f9857u;
            bVar2.f9937M = bVar.f9859w;
            bVar2.f9934J = bVar.f9856t;
            bVar2.f9936L = bVar.f9858v;
            bVar2.f9939O = bVar.f9860x;
            bVar2.f9938N = bVar.f9861y;
            bVar2.f9932H = bVar.getMarginEnd();
            this.f9921d.f9933I = bVar.getMarginStart();
        }

        public void g(int i7, e.a aVar) {
            f(i7, aVar);
            this.f9919b.f9998d = aVar.f10017p0;
            e eVar = this.f9922e;
            eVar.f10002b = aVar.f10020s0;
            eVar.f10003c = aVar.f10021t0;
            eVar.f10004d = aVar.f10022u0;
            eVar.f10005e = aVar.f10023v0;
            eVar.f10006f = aVar.f10024w0;
            eVar.f10007g = aVar.f10025x0;
            eVar.f10008h = aVar.f10026y0;
            eVar.f10009i = aVar.f10027z0;
            eVar.f10010j = aVar.f10015A0;
            eVar.f10011k = aVar.f10016B0;
            eVar.f10013m = aVar.f10019r0;
            eVar.f10012l = aVar.f10018q0;
        }

        public void h(androidx.constraintlayout.widget.b bVar, int i7, e.a aVar) {
            g(i7, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f9921d;
                bVar2.f9958d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f9954b0 = barrier.getType();
                this.f9921d.f9960e0 = barrier.getReferencedIds();
                this.f9921d.f9956c0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f9921d;
            bVar.f9828d = bVar2.f9965h;
            bVar.f9830e = bVar2.f9967i;
            bVar.f9832f = bVar2.f9969j;
            bVar.f9834g = bVar2.f9971k;
            bVar.f9836h = bVar2.f9972l;
            bVar.f9838i = bVar2.f9973m;
            bVar.f9840j = bVar2.f9974n;
            bVar.f9842k = bVar2.f9975o;
            bVar.f9844l = bVar2.f9976p;
            bVar.f9852p = bVar2.f9977q;
            bVar.f9853q = bVar2.f9978r;
            bVar.f9854r = bVar2.f9979s;
            bVar.f9855s = bVar2.f9980t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f9928D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f9929E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f9930F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f9931G;
            bVar.f9860x = bVar2.f9939O;
            bVar.f9861y = bVar2.f9938N;
            bVar.f9857u = bVar2.f9935K;
            bVar.f9859w = bVar2.f9937M;
            bVar.f9862z = bVar2.f9981u;
            bVar.f9796A = bVar2.f9982v;
            bVar.f9846m = bVar2.f9984x;
            bVar.f9848n = bVar2.f9985y;
            bVar.f9850o = bVar2.f9986z;
            bVar.f9797B = bVar2.f9983w;
            bVar.f9812Q = bVar2.f9925A;
            bVar.f9813R = bVar2.f9926B;
            bVar.f9801F = bVar2.f9940P;
            bVar.f9800E = bVar2.f9941Q;
            bVar.f9803H = bVar2.f9943S;
            bVar.f9802G = bVar2.f9942R;
            bVar.f9815T = bVar2.f9966h0;
            bVar.f9816U = bVar2.f9968i0;
            bVar.f9804I = bVar2.f9944T;
            bVar.f9805J = bVar2.f9945U;
            bVar.f9808M = bVar2.f9946V;
            bVar.f9809N = bVar2.f9947W;
            bVar.f9806K = bVar2.f9948X;
            bVar.f9807L = bVar2.f9949Y;
            bVar.f9810O = bVar2.f9950Z;
            bVar.f9811P = bVar2.f9952a0;
            bVar.f9814S = bVar2.f9927C;
            bVar.f9826c = bVar2.f9963g;
            bVar.f9822a = bVar2.f9959e;
            bVar.f9824b = bVar2.f9961f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f9955c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f9957d;
            String str = bVar2.f9964g0;
            if (str != null) {
                bVar.f9817V = str;
            }
            bVar.setMarginStart(bVar2.f9933I);
            bVar.setMarginEnd(this.f9921d.f9932H);
            bVar.a();
        }

        public a clone() {
            a aVar = new a();
            aVar.f9921d.a(this.f9921d);
            aVar.f9920c.a(this.f9920c);
            aVar.f9919b.a(this.f9919b);
            aVar.f9922e.a(this.f9922e);
            aVar.f9918a = this.f9918a;
            return aVar;
        }
    }

    public static class b {

        private static SparseIntArray f9924k0;

        public int f9955c;

        public int f9957d;

        public int[] f9960e0;

        public String f9962f0;

        public String f9964g0;

        public boolean f9951a = false;

        public boolean f9953b = false;

        public int f9959e = -1;

        public int f9961f = -1;

        public float f9963g = -1.0f;

        public int f9965h = -1;

        public int f9967i = -1;

        public int f9969j = -1;

        public int f9971k = -1;

        public int f9972l = -1;

        public int f9973m = -1;

        public int f9974n = -1;

        public int f9975o = -1;

        public int f9976p = -1;

        public int f9977q = -1;

        public int f9978r = -1;

        public int f9979s = -1;

        public int f9980t = -1;

        public float f9981u = 0.5f;

        public float f9982v = 0.5f;

        public String f9983w = null;

        public int f9984x = -1;

        public int f9985y = 0;

        public float f9986z = 0.0f;

        public int f9925A = -1;

        public int f9926B = -1;

        public int f9927C = -1;

        public int f9928D = -1;

        public int f9929E = -1;

        public int f9930F = -1;

        public int f9931G = -1;

        public int f9932H = -1;

        public int f9933I = -1;

        public int f9934J = -1;

        public int f9935K = -1;

        public int f9936L = -1;

        public int f9937M = -1;

        public int f9938N = -1;

        public int f9939O = -1;

        public float f9940P = -1.0f;

        public float f9941Q = -1.0f;

        public int f9942R = 0;

        public int f9943S = 0;

        public int f9944T = 0;

        public int f9945U = 0;

        public int f9946V = -1;

        public int f9947W = -1;

        public int f9948X = -1;

        public int f9949Y = -1;

        public float f9950Z = 1.0f;

        public float f9952a0 = 1.0f;

        public int f9954b0 = -1;

        public int f9956c0 = 0;

        public int f9958d0 = -1;

        public boolean f9966h0 = false;

        public boolean f9968i0 = false;

        public boolean f9970j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9924k0 = sparseIntArray;
            sparseIntArray.append(i.f10167e4, 24);
            f9924k0.append(i.f10174f4, 25);
            f9924k0.append(i.f10188h4, 28);
            f9924k0.append(i.f10195i4, 29);
            f9924k0.append(i.f10226n4, 35);
            f9924k0.append(i.f10220m4, 34);
            f9924k0.append(i.f10101P3, 4);
            f9924k0.append(i.f10097O3, 3);
            f9924k0.append(i.f10089M3, 1);
            f9924k0.append(i.f10255s4, 6);
            f9924k0.append(i.f10261t4, 7);
            f9924k0.append(i.f10126W3, 17);
            f9924k0.append(i.f10130X3, 18);
            f9924k0.append(i.f10134Y3, 19);
            f9924k0.append(i.f10284x3, 26);
            f9924k0.append(i.f10202j4, 31);
            f9924k0.append(i.f10208k4, 32);
            f9924k0.append(i.f10122V3, 10);
            f9924k0.append(i.f10119U3, 9);
            f9924k0.append(i.f10279w4, 13);
            f9924k0.append(i.f10298z4, 16);
            f9924k0.append(i.f10285x4, 14);
            f9924k0.append(i.f10267u4, 11);
            f9924k0.append(i.f10292y4, 15);
            f9924k0.append(i.f10273v4, 12);
            f9924k0.append(i.f10243q4, 38);
            f9924k0.append(i.f10153c4, 37);
            f9924k0.append(i.f10148b4, 39);
            f9924k0.append(i.f10237p4, 40);
            f9924k0.append(i.f10143a4, 20);
            f9924k0.append(i.f10231o4, 36);
            f9924k0.append(i.f10116T3, 5);
            f9924k0.append(i.f10160d4, 76);
            f9924k0.append(i.f10214l4, 76);
            f9924k0.append(i.f10181g4, 76);
            f9924k0.append(i.f10093N3, 76);
            f9924k0.append(i.f10085L3, 76);
            f9924k0.append(i.f10034A3, 23);
            f9924k0.append(i.f10046C3, 27);
            f9924k0.append(i.f10056E3, 30);
            f9924k0.append(i.f10060F3, 8);
            f9924k0.append(i.f10040B3, 33);
            f9924k0.append(i.f10051D3, 2);
            f9924k0.append(i.f10291y3, 22);
            f9924k0.append(i.f10297z3, 21);
            f9924k0.append(i.f10105Q3, 61);
            f9924k0.append(i.f10113S3, 62);
            f9924k0.append(i.f10109R3, 63);
            f9924k0.append(i.f10249r4, 69);
            f9924k0.append(i.f10138Z3, 70);
            f9924k0.append(i.f10077J3, 71);
            f9924k0.append(i.f10068H3, 72);
            f9924k0.append(i.f10072I3, 73);
            f9924k0.append(i.f10081K3, 74);
            f9924k0.append(i.f10064G3, 75);
        }

        public void a(b bVar) {
            this.f9951a = bVar.f9951a;
            this.f9955c = bVar.f9955c;
            this.f9953b = bVar.f9953b;
            this.f9957d = bVar.f9957d;
            this.f9959e = bVar.f9959e;
            this.f9961f = bVar.f9961f;
            this.f9963g = bVar.f9963g;
            this.f9965h = bVar.f9965h;
            this.f9967i = bVar.f9967i;
            this.f9969j = bVar.f9969j;
            this.f9971k = bVar.f9971k;
            this.f9972l = bVar.f9972l;
            this.f9973m = bVar.f9973m;
            this.f9974n = bVar.f9974n;
            this.f9975o = bVar.f9975o;
            this.f9976p = bVar.f9976p;
            this.f9977q = bVar.f9977q;
            this.f9978r = bVar.f9978r;
            this.f9979s = bVar.f9979s;
            this.f9980t = bVar.f9980t;
            this.f9981u = bVar.f9981u;
            this.f9982v = bVar.f9982v;
            this.f9983w = bVar.f9983w;
            this.f9984x = bVar.f9984x;
            this.f9985y = bVar.f9985y;
            this.f9986z = bVar.f9986z;
            this.f9925A = bVar.f9925A;
            this.f9926B = bVar.f9926B;
            this.f9927C = bVar.f9927C;
            this.f9928D = bVar.f9928D;
            this.f9929E = bVar.f9929E;
            this.f9930F = bVar.f9930F;
            this.f9931G = bVar.f9931G;
            this.f9932H = bVar.f9932H;
            this.f9933I = bVar.f9933I;
            this.f9934J = bVar.f9934J;
            this.f9935K = bVar.f9935K;
            this.f9936L = bVar.f9936L;
            this.f9937M = bVar.f9937M;
            this.f9938N = bVar.f9938N;
            this.f9939O = bVar.f9939O;
            this.f9940P = bVar.f9940P;
            this.f9941Q = bVar.f9941Q;
            this.f9942R = bVar.f9942R;
            this.f9943S = bVar.f9943S;
            this.f9944T = bVar.f9944T;
            this.f9945U = bVar.f9945U;
            this.f9946V = bVar.f9946V;
            this.f9947W = bVar.f9947W;
            this.f9948X = bVar.f9948X;
            this.f9949Y = bVar.f9949Y;
            this.f9950Z = bVar.f9950Z;
            this.f9952a0 = bVar.f9952a0;
            this.f9954b0 = bVar.f9954b0;
            this.f9956c0 = bVar.f9956c0;
            this.f9958d0 = bVar.f9958d0;
            this.f9964g0 = bVar.f9964g0;
            int[] iArr = bVar.f9960e0;
            if (iArr != null) {
                this.f9960e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f9960e0 = null;
            }
            this.f9962f0 = bVar.f9962f0;
            this.f9966h0 = bVar.f9966h0;
            this.f9968i0 = bVar.f9968i0;
            this.f9970j0 = bVar.f9970j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10278w3);
            this.f9953b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i8 = f9924k0.get(index);
                if (i8 == 80) {
                    this.f9966h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f9966h0);
                } else if (i8 != 81) {
                    switch (i8) {
                        case 1:
                            this.f9976p = d.v(typedArrayObtainStyledAttributes, index, this.f9976p);
                            break;
                        case 2:
                            this.f9931G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9931G);
                            break;
                        case 3:
                            this.f9975o = d.v(typedArrayObtainStyledAttributes, index, this.f9975o);
                            break;
                        case 4:
                            this.f9974n = d.v(typedArrayObtainStyledAttributes, index, this.f9974n);
                            break;
                        case 5:
                            this.f9983w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f9925A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9925A);
                            break;
                        case 7:
                            this.f9926B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9926B);
                            break;
                        case 8:
                            this.f9932H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9932H);
                            break;
                        case 9:
                            this.f9980t = d.v(typedArrayObtainStyledAttributes, index, this.f9980t);
                            break;
                        case 10:
                            this.f9979s = d.v(typedArrayObtainStyledAttributes, index, this.f9979s);
                            break;
                        case 11:
                            this.f9937M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9937M);
                            break;
                        case 12:
                            this.f9938N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9938N);
                            break;
                        case 13:
                            this.f9934J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9934J);
                            break;
                        case 14:
                            this.f9936L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9936L);
                            break;
                        case 15:
                            this.f9939O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9939O);
                            break;
                        case 16:
                            this.f9935K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9935K);
                            break;
                        case 17:
                            this.f9959e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9959e);
                            break;
                        case 18:
                            this.f9961f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9961f);
                            break;
                        case 19:
                            this.f9963g = typedArrayObtainStyledAttributes.getFloat(index, this.f9963g);
                            break;
                        case 20:
                            this.f9981u = typedArrayObtainStyledAttributes.getFloat(index, this.f9981u);
                            break;
                        case 21:
                            this.f9957d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f9957d);
                            break;
                        case 22:
                            this.f9955c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f9955c);
                            break;
                        case 23:
                            this.f9928D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9928D);
                            break;
                        case 24:
                            this.f9965h = d.v(typedArrayObtainStyledAttributes, index, this.f9965h);
                            break;
                        case 25:
                            this.f9967i = d.v(typedArrayObtainStyledAttributes, index, this.f9967i);
                            break;
                        case 26:
                            this.f9927C = typedArrayObtainStyledAttributes.getInt(index, this.f9927C);
                            break;
                        case 27:
                            this.f9929E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9929E);
                            break;
                        case 28:
                            this.f9969j = d.v(typedArrayObtainStyledAttributes, index, this.f9969j);
                            break;
                        case 29:
                            this.f9971k = d.v(typedArrayObtainStyledAttributes, index, this.f9971k);
                            break;
                        case 30:
                            this.f9933I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9933I);
                            break;
                        case 31:
                            this.f9977q = d.v(typedArrayObtainStyledAttributes, index, this.f9977q);
                            break;
                        case 32:
                            this.f9978r = d.v(typedArrayObtainStyledAttributes, index, this.f9978r);
                            break;
                        case 33:
                            this.f9930F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9930F);
                            break;
                        case 34:
                            this.f9973m = d.v(typedArrayObtainStyledAttributes, index, this.f9973m);
                            break;
                        case 35:
                            this.f9972l = d.v(typedArrayObtainStyledAttributes, index, this.f9972l);
                            break;
                        case 36:
                            this.f9982v = typedArrayObtainStyledAttributes.getFloat(index, this.f9982v);
                            break;
                        case 37:
                            this.f9941Q = typedArrayObtainStyledAttributes.getFloat(index, this.f9941Q);
                            break;
                        case 38:
                            this.f9940P = typedArrayObtainStyledAttributes.getFloat(index, this.f9940P);
                            break;
                        case 39:
                            this.f9942R = typedArrayObtainStyledAttributes.getInt(index, this.f9942R);
                            break;
                        case 40:
                            this.f9943S = typedArrayObtainStyledAttributes.getInt(index, this.f9943S);
                            break;
                        default:
                            switch (i8) {
                                case 54:
                                    this.f9944T = typedArrayObtainStyledAttributes.getInt(index, this.f9944T);
                                    break;
                                case 55:
                                    this.f9945U = typedArrayObtainStyledAttributes.getInt(index, this.f9945U);
                                    break;
                                case 56:
                                    this.f9946V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9946V);
                                    break;
                                case 57:
                                    this.f9947W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9947W);
                                    break;
                                case 58:
                                    this.f9948X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9948X);
                                    break;
                                case 59:
                                    this.f9949Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9949Y);
                                    break;
                                default:
                                    switch (i8) {
                                        case 61:
                                            this.f9984x = d.v(typedArrayObtainStyledAttributes, index, this.f9984x);
                                            break;
                                        case 62:
                                            this.f9985y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9985y);
                                            break;
                                        case 63:
                                            this.f9986z = typedArrayObtainStyledAttributes.getFloat(index, this.f9986z);
                                            break;
                                        default:
                                            switch (i8) {
                                                case 69:
                                                    this.f9950Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f9952a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f9954b0 = typedArrayObtainStyledAttributes.getInt(index, this.f9954b0);
                                                    break;
                                                case 73:
                                                    this.f9956c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9956c0);
                                                    break;
                                                case 74:
                                                    this.f9962f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f9970j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f9970j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f9924k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f9964g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f9924k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f9968i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f9968i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        private static SparseIntArray f9987h;

        public boolean f9988a = false;

        public int f9989b = -1;

        public String f9990c = null;

        public int f9991d = -1;

        public int f9992e = 0;

        public float f9993f = Float.NaN;

        public float f9994g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9987h = sparseIntArray;
            sparseIntArray.append(i.f10082K4, 1);
            f9987h.append(i.f10090M4, 2);
            f9987h.append(i.f10094N4, 3);
            f9987h.append(i.f10078J4, 4);
            f9987h.append(i.I4, 5);
            f9987h.append(i.f10086L4, 6);
        }

        public void a(c cVar) {
            this.f9988a = cVar.f9988a;
            this.f9989b = cVar.f9989b;
            this.f9990c = cVar.f9990c;
            this.f9991d = cVar.f9991d;
            this.f9992e = cVar.f9992e;
            this.f9994g = cVar.f9994g;
            this.f9993f = cVar.f9993f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10069H4);
            this.f9988a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f9987h.get(index)) {
                    case 1:
                        this.f9994g = typedArrayObtainStyledAttributes.getFloat(index, this.f9994g);
                        break;
                    case 2:
                        this.f9991d = typedArrayObtainStyledAttributes.getInt(index, this.f9991d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f9990c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f9990c = C2482a.f21059c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f9992e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f9989b = d.v(typedArrayObtainStyledAttributes, index, this.f9989b);
                        break;
                    case 6:
                        this.f9993f = typedArrayObtainStyledAttributes.getFloat(index, this.f9993f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class C0080d {

        public boolean f9995a = false;

        public int f9996b = 0;

        public int f9997c = 0;

        public float f9998d = 1.0f;

        public float f9999e = Float.NaN;

        public void a(C0080d c0080d) {
            this.f9995a = c0080d.f9995a;
            this.f9996b = c0080d.f9996b;
            this.f9998d = c0080d.f9998d;
            this.f9999e = c0080d.f9999e;
            this.f9997c = c0080d.f9997c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10127W4);
            this.f9995a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.f10135Y4) {
                    this.f9998d = typedArrayObtainStyledAttributes.getFloat(index, this.f9998d);
                } else if (index == i.f10131X4) {
                    this.f9996b = typedArrayObtainStyledAttributes.getInt(index, this.f9996b);
                    this.f9996b = d.f9913d[this.f9996b];
                } else if (index == i.f10144a5) {
                    this.f9997c = typedArrayObtainStyledAttributes.getInt(index, this.f9997c);
                } else if (index == i.f10139Z4) {
                    this.f9999e = typedArrayObtainStyledAttributes.getFloat(index, this.f9999e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        private static SparseIntArray f10000n;

        public boolean f10001a = false;

        public float f10002b = 0.0f;

        public float f10003c = 0.0f;

        public float f10004d = 0.0f;

        public float f10005e = 1.0f;

        public float f10006f = 1.0f;

        public float f10007g = Float.NaN;

        public float f10008h = Float.NaN;

        public float f10009i = 0.0f;

        public float f10010j = 0.0f;

        public float f10011k = 0.0f;

        public boolean f10012l = false;

        public float f10013m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10000n = sparseIntArray;
            sparseIntArray.append(i.f10268u5, 1);
            f10000n.append(i.f10274v5, 2);
            f10000n.append(i.f10280w5, 3);
            f10000n.append(i.f10256s5, 4);
            f10000n.append(i.f10262t5, 5);
            f10000n.append(i.f10232o5, 6);
            f10000n.append(i.f10238p5, 7);
            f10000n.append(i.f10244q5, 8);
            f10000n.append(i.f10250r5, 9);
            f10000n.append(i.f10286x5, 10);
            f10000n.append(i.f10293y5, 11);
        }

        public void a(e eVar) {
            this.f10001a = eVar.f10001a;
            this.f10002b = eVar.f10002b;
            this.f10003c = eVar.f10003c;
            this.f10004d = eVar.f10004d;
            this.f10005e = eVar.f10005e;
            this.f10006f = eVar.f10006f;
            this.f10007g = eVar.f10007g;
            this.f10008h = eVar.f10008h;
            this.f10009i = eVar.f10009i;
            this.f10010j = eVar.f10010j;
            this.f10011k = eVar.f10011k;
            this.f10012l = eVar.f10012l;
            this.f10013m = eVar.f10013m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10227n5);
            this.f10001a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f10000n.get(index)) {
                    case 1:
                        this.f10002b = typedArrayObtainStyledAttributes.getFloat(index, this.f10002b);
                        break;
                    case 2:
                        this.f10003c = typedArrayObtainStyledAttributes.getFloat(index, this.f10003c);
                        break;
                    case 3:
                        this.f10004d = typedArrayObtainStyledAttributes.getFloat(index, this.f10004d);
                        break;
                    case 4:
                        this.f10005e = typedArrayObtainStyledAttributes.getFloat(index, this.f10005e);
                        break;
                    case 5:
                        this.f10006f = typedArrayObtainStyledAttributes.getFloat(index, this.f10006f);
                        break;
                    case 6:
                        this.f10007g = typedArrayObtainStyledAttributes.getDimension(index, this.f10007g);
                        break;
                    case 7:
                        this.f10008h = typedArrayObtainStyledAttributes.getDimension(index, this.f10008h);
                        break;
                    case 8:
                        this.f10009i = typedArrayObtainStyledAttributes.getDimension(index, this.f10009i);
                        break;
                    case 9:
                        this.f10010j = typedArrayObtainStyledAttributes.getDimension(index, this.f10010j);
                        break;
                    case 10:
                        this.f10011k = typedArrayObtainStyledAttributes.getDimension(index, this.f10011k);
                        break;
                    case 11:
                        this.f10012l = true;
                        this.f10013m = typedArrayObtainStyledAttributes.getDimension(index, this.f10013m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9914e = sparseIntArray;
        sparseIntArray.append(i.f10264u0, 25);
        f9914e.append(i.f10270v0, 26);
        f9914e.append(i.f10282x0, 29);
        f9914e.append(i.f10288y0, 30);
        f9914e.append(i.f10054E0, 36);
        f9914e.append(i.f10049D0, 35);
        f9914e.append(i.f10151c0, 4);
        f9914e.append(i.f10146b0, 3);
        f9914e.append(i.f10136Z, 1);
        f9914e.append(i.f10088M0, 6);
        f9914e.append(i.f10092N0, 7);
        f9914e.append(i.f10198j0, 17);
        f9914e.append(i.f10205k0, 18);
        f9914e.append(i.f10211l0, 19);
        f9914e.append(i.f10251s, 27);
        f9914e.append(i.f10295z0, 32);
        f9914e.append(i.f10032A0, 33);
        f9914e.append(i.f10191i0, 10);
        f9914e.append(i.f10184h0, 9);
        f9914e.append(i.f10104Q0, 13);
        f9914e.append(i.T0, 16);
        f9914e.append(i.f10108R0, 14);
        f9914e.append(i.f10096O0, 11);
        f9914e.append(i.f10112S0, 15);
        f9914e.append(i.f10100P0, 12);
        f9914e.append(i.f10067H0, 40);
        f9914e.append(i.f10252s0, 39);
        f9914e.append(i.f10246r0, 41);
        f9914e.append(i.f10063G0, 42);
        f9914e.append(i.f10240q0, 20);
        f9914e.append(i.f10059F0, 37);
        f9914e.append(i.f10177g0, 5);
        f9914e.append(i.f10258t0, 82);
        f9914e.append(i.f10044C0, 82);
        f9914e.append(i.f10276w0, 82);
        f9914e.append(i.f10141a0, 82);
        f9914e.append(i.f10132Y, 82);
        f9914e.append(i.f10281x, 24);
        f9914e.append(i.f10294z, 28);
        f9914e.append(i.f10083L, 31);
        f9914e.append(i.f10087M, 8);
        f9914e.append(i.f10287y, 34);
        f9914e.append(i.f10031A, 2);
        f9914e.append(i.f10269v, 23);
        f9914e.append(i.f10275w, 21);
        f9914e.append(i.f10263u, 22);
        f9914e.append(i.f10037B, 43);
        f9914e.append(i.f10095O, 44);
        f9914e.append(i.f10074J, 45);
        f9914e.append(i.f10079K, 46);
        f9914e.append(i.f10070I, 60);
        f9914e.append(i.f10062G, 47);
        f9914e.append(i.f10066H, 48);
        f9914e.append(i.f10043C, 49);
        f9914e.append(i.f10048D, 50);
        f9914e.append(i.f10053E, 51);
        f9914e.append(i.f10058F, 52);
        f9914e.append(i.f10091N, 53);
        f9914e.append(i.f10071I0, 54);
        f9914e.append(i.f10217m0, 55);
        f9914e.append(i.f10075J0, 56);
        f9914e.append(i.f10223n0, 57);
        f9914e.append(i.f10080K0, 58);
        f9914e.append(i.f10229o0, 59);
        f9914e.append(i.f10156d0, 61);
        f9914e.append(i.f10170f0, 62);
        f9914e.append(i.f10163e0, 63);
        f9914e.append(i.f10099P, 64);
        f9914e.append(i.f10129X0, 65);
        f9914e.append(i.f10121V, 66);
        f9914e.append(i.f10133Y0, 67);
        f9914e.append(i.V0, 79);
        f9914e.append(i.f10257t, 38);
        f9914e.append(i.U0, 68);
        f9914e.append(i.f10084L0, 69);
        f9914e.append(i.f10234p0, 70);
        f9914e.append(i.f10115T, 71);
        f9914e.append(i.f10107R, 72);
        f9914e.append(i.f10111S, 73);
        f9914e.append(i.f10118U, 74);
        f9914e.append(i.f10103Q, 75);
        f9914e.append(i.f10125W0, 76);
        f9914e.append(i.f10038B0, 77);
        f9914e.append(i.f10137Z0, 78);
        f9914e.append(i.f10128X, 80);
        f9914e.append(i.f10124W, 81);
    }

    private String B(int i7) {
        switch (i7) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private int[] p(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < strArrSplit.length) {
            String strTrim = strArrSplit[i7].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i8] = iIntValue;
            i7++;
            i8++;
        }
        return i8 != strArrSplit.length ? Arrays.copyOf(iArr, i8) : iArr;
    }

    private a r(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10245r);
        w(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a s(int i7) {
        if (!this.f9917c.containsKey(Integer.valueOf(i7))) {
            this.f9917c.put(Integer.valueOf(i7), new a());
        }
        return this.f9917c.get(Integer.valueOf(i7));
    }

    public static int v(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    private void w(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            if (index != i.f10257t && i.f10083L != index && i.f10087M != index) {
                aVar.f9920c.f9988a = true;
                aVar.f9921d.f9953b = true;
                aVar.f9919b.f9995a = true;
                aVar.f9922e.f10001a = true;
            }
            switch (f9914e.get(index)) {
                case 1:
                    b bVar = aVar.f9921d;
                    bVar.f9976p = v(typedArray, index, bVar.f9976p);
                    break;
                case 2:
                    b bVar2 = aVar.f9921d;
                    bVar2.f9931G = typedArray.getDimensionPixelSize(index, bVar2.f9931G);
                    break;
                case 3:
                    b bVar3 = aVar.f9921d;
                    bVar3.f9975o = v(typedArray, index, bVar3.f9975o);
                    break;
                case 4:
                    b bVar4 = aVar.f9921d;
                    bVar4.f9974n = v(typedArray, index, bVar4.f9974n);
                    break;
                case 5:
                    aVar.f9921d.f9983w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f9921d;
                    bVar5.f9925A = typedArray.getDimensionPixelOffset(index, bVar5.f9925A);
                    break;
                case 7:
                    b bVar6 = aVar.f9921d;
                    bVar6.f9926B = typedArray.getDimensionPixelOffset(index, bVar6.f9926B);
                    break;
                case 8:
                    b bVar7 = aVar.f9921d;
                    bVar7.f9932H = typedArray.getDimensionPixelSize(index, bVar7.f9932H);
                    break;
                case 9:
                    b bVar8 = aVar.f9921d;
                    bVar8.f9980t = v(typedArray, index, bVar8.f9980t);
                    break;
                case 10:
                    b bVar9 = aVar.f9921d;
                    bVar9.f9979s = v(typedArray, index, bVar9.f9979s);
                    break;
                case 11:
                    b bVar10 = aVar.f9921d;
                    bVar10.f9937M = typedArray.getDimensionPixelSize(index, bVar10.f9937M);
                    break;
                case 12:
                    b bVar11 = aVar.f9921d;
                    bVar11.f9938N = typedArray.getDimensionPixelSize(index, bVar11.f9938N);
                    break;
                case 13:
                    b bVar12 = aVar.f9921d;
                    bVar12.f9934J = typedArray.getDimensionPixelSize(index, bVar12.f9934J);
                    break;
                case 14:
                    b bVar13 = aVar.f9921d;
                    bVar13.f9936L = typedArray.getDimensionPixelSize(index, bVar13.f9936L);
                    break;
                case 15:
                    b bVar14 = aVar.f9921d;
                    bVar14.f9939O = typedArray.getDimensionPixelSize(index, bVar14.f9939O);
                    break;
                case 16:
                    b bVar15 = aVar.f9921d;
                    bVar15.f9935K = typedArray.getDimensionPixelSize(index, bVar15.f9935K);
                    break;
                case 17:
                    b bVar16 = aVar.f9921d;
                    bVar16.f9959e = typedArray.getDimensionPixelOffset(index, bVar16.f9959e);
                    break;
                case 18:
                    b bVar17 = aVar.f9921d;
                    bVar17.f9961f = typedArray.getDimensionPixelOffset(index, bVar17.f9961f);
                    break;
                case 19:
                    b bVar18 = aVar.f9921d;
                    bVar18.f9963g = typedArray.getFloat(index, bVar18.f9963g);
                    break;
                case 20:
                    b bVar19 = aVar.f9921d;
                    bVar19.f9981u = typedArray.getFloat(index, bVar19.f9981u);
                    break;
                case 21:
                    b bVar20 = aVar.f9921d;
                    bVar20.f9957d = typedArray.getLayoutDimension(index, bVar20.f9957d);
                    break;
                case 22:
                    C0080d c0080d = aVar.f9919b;
                    c0080d.f9996b = typedArray.getInt(index, c0080d.f9996b);
                    C0080d c0080d2 = aVar.f9919b;
                    c0080d2.f9996b = f9913d[c0080d2.f9996b];
                    break;
                case 23:
                    b bVar21 = aVar.f9921d;
                    bVar21.f9955c = typedArray.getLayoutDimension(index, bVar21.f9955c);
                    break;
                case 24:
                    b bVar22 = aVar.f9921d;
                    bVar22.f9928D = typedArray.getDimensionPixelSize(index, bVar22.f9928D);
                    break;
                case 25:
                    b bVar23 = aVar.f9921d;
                    bVar23.f9965h = v(typedArray, index, bVar23.f9965h);
                    break;
                case 26:
                    b bVar24 = aVar.f9921d;
                    bVar24.f9967i = v(typedArray, index, bVar24.f9967i);
                    break;
                case 27:
                    b bVar25 = aVar.f9921d;
                    bVar25.f9927C = typedArray.getInt(index, bVar25.f9927C);
                    break;
                case 28:
                    b bVar26 = aVar.f9921d;
                    bVar26.f9929E = typedArray.getDimensionPixelSize(index, bVar26.f9929E);
                    break;
                case 29:
                    b bVar27 = aVar.f9921d;
                    bVar27.f9969j = v(typedArray, index, bVar27.f9969j);
                    break;
                case 30:
                    b bVar28 = aVar.f9921d;
                    bVar28.f9971k = v(typedArray, index, bVar28.f9971k);
                    break;
                case 31:
                    b bVar29 = aVar.f9921d;
                    bVar29.f9933I = typedArray.getDimensionPixelSize(index, bVar29.f9933I);
                    break;
                case 32:
                    b bVar30 = aVar.f9921d;
                    bVar30.f9977q = v(typedArray, index, bVar30.f9977q);
                    break;
                case 33:
                    b bVar31 = aVar.f9921d;
                    bVar31.f9978r = v(typedArray, index, bVar31.f9978r);
                    break;
                case 34:
                    b bVar32 = aVar.f9921d;
                    bVar32.f9930F = typedArray.getDimensionPixelSize(index, bVar32.f9930F);
                    break;
                case 35:
                    b bVar33 = aVar.f9921d;
                    bVar33.f9973m = v(typedArray, index, bVar33.f9973m);
                    break;
                case 36:
                    b bVar34 = aVar.f9921d;
                    bVar34.f9972l = v(typedArray, index, bVar34.f9972l);
                    break;
                case 37:
                    b bVar35 = aVar.f9921d;
                    bVar35.f9982v = typedArray.getFloat(index, bVar35.f9982v);
                    break;
                case 38:
                    aVar.f9918a = typedArray.getResourceId(index, aVar.f9918a);
                    break;
                case 39:
                    b bVar36 = aVar.f9921d;
                    bVar36.f9941Q = typedArray.getFloat(index, bVar36.f9941Q);
                    break;
                case 40:
                    b bVar37 = aVar.f9921d;
                    bVar37.f9940P = typedArray.getFloat(index, bVar37.f9940P);
                    break;
                case 41:
                    b bVar38 = aVar.f9921d;
                    bVar38.f9942R = typedArray.getInt(index, bVar38.f9942R);
                    break;
                case 42:
                    b bVar39 = aVar.f9921d;
                    bVar39.f9943S = typedArray.getInt(index, bVar39.f9943S);
                    break;
                case 43:
                    C0080d c0080d3 = aVar.f9919b;
                    c0080d3.f9998d = typedArray.getFloat(index, c0080d3.f9998d);
                    break;
                case 44:
                    e eVar = aVar.f9922e;
                    eVar.f10012l = true;
                    eVar.f10013m = typedArray.getDimension(index, eVar.f10013m);
                    break;
                case 45:
                    e eVar2 = aVar.f9922e;
                    eVar2.f10003c = typedArray.getFloat(index, eVar2.f10003c);
                    break;
                case 46:
                    e eVar3 = aVar.f9922e;
                    eVar3.f10004d = typedArray.getFloat(index, eVar3.f10004d);
                    break;
                case 47:
                    e eVar4 = aVar.f9922e;
                    eVar4.f10005e = typedArray.getFloat(index, eVar4.f10005e);
                    break;
                case 48:
                    e eVar5 = aVar.f9922e;
                    eVar5.f10006f = typedArray.getFloat(index, eVar5.f10006f);
                    break;
                case 49:
                    e eVar6 = aVar.f9922e;
                    eVar6.f10007g = typedArray.getDimension(index, eVar6.f10007g);
                    break;
                case 50:
                    e eVar7 = aVar.f9922e;
                    eVar7.f10008h = typedArray.getDimension(index, eVar7.f10008h);
                    break;
                case 51:
                    e eVar8 = aVar.f9922e;
                    eVar8.f10009i = typedArray.getDimension(index, eVar8.f10009i);
                    break;
                case 52:
                    e eVar9 = aVar.f9922e;
                    eVar9.f10010j = typedArray.getDimension(index, eVar9.f10010j);
                    break;
                case 53:
                    e eVar10 = aVar.f9922e;
                    eVar10.f10011k = typedArray.getDimension(index, eVar10.f10011k);
                    break;
                case 54:
                    b bVar40 = aVar.f9921d;
                    bVar40.f9944T = typedArray.getInt(index, bVar40.f9944T);
                    break;
                case 55:
                    b bVar41 = aVar.f9921d;
                    bVar41.f9945U = typedArray.getInt(index, bVar41.f9945U);
                    break;
                case 56:
                    b bVar42 = aVar.f9921d;
                    bVar42.f9946V = typedArray.getDimensionPixelSize(index, bVar42.f9946V);
                    break;
                case 57:
                    b bVar43 = aVar.f9921d;
                    bVar43.f9947W = typedArray.getDimensionPixelSize(index, bVar43.f9947W);
                    break;
                case 58:
                    b bVar44 = aVar.f9921d;
                    bVar44.f9948X = typedArray.getDimensionPixelSize(index, bVar44.f9948X);
                    break;
                case 59:
                    b bVar45 = aVar.f9921d;
                    bVar45.f9949Y = typedArray.getDimensionPixelSize(index, bVar45.f9949Y);
                    break;
                case 60:
                    e eVar11 = aVar.f9922e;
                    eVar11.f10002b = typedArray.getFloat(index, eVar11.f10002b);
                    break;
                case 61:
                    b bVar46 = aVar.f9921d;
                    bVar46.f9984x = v(typedArray, index, bVar46.f9984x);
                    break;
                case 62:
                    b bVar47 = aVar.f9921d;
                    bVar47.f9985y = typedArray.getDimensionPixelSize(index, bVar47.f9985y);
                    break;
                case 63:
                    b bVar48 = aVar.f9921d;
                    bVar48.f9986z = typedArray.getFloat(index, bVar48.f9986z);
                    break;
                case 64:
                    c cVar = aVar.f9920c;
                    cVar.f9989b = v(typedArray, index, cVar.f9989b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f9920c.f9990c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f9920c.f9990c = C2482a.f21059c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f9920c.f9992e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f9920c;
                    cVar2.f9994g = typedArray.getFloat(index, cVar2.f9994g);
                    break;
                case 68:
                    C0080d c0080d4 = aVar.f9919b;
                    c0080d4.f9999e = typedArray.getFloat(index, c0080d4.f9999e);
                    break;
                case 69:
                    aVar.f9921d.f9950Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f9921d.f9952a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f9921d;
                    bVar49.f9954b0 = typedArray.getInt(index, bVar49.f9954b0);
                    break;
                case 73:
                    b bVar50 = aVar.f9921d;
                    bVar50.f9956c0 = typedArray.getDimensionPixelSize(index, bVar50.f9956c0);
                    break;
                case 74:
                    aVar.f9921d.f9962f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f9921d;
                    bVar51.f9970j0 = typedArray.getBoolean(index, bVar51.f9970j0);
                    break;
                case 76:
                    c cVar3 = aVar.f9920c;
                    cVar3.f9991d = typedArray.getInt(index, cVar3.f9991d);
                    break;
                case 77:
                    aVar.f9921d.f9964g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0080d c0080d5 = aVar.f9919b;
                    c0080d5.f9997c = typedArray.getInt(index, c0080d5.f9997c);
                    break;
                case 79:
                    c cVar4 = aVar.f9920c;
                    cVar4.f9993f = typedArray.getFloat(index, cVar4.f9993f);
                    break;
                case 80:
                    b bVar52 = aVar.f9921d;
                    bVar52.f9966h0 = typedArray.getBoolean(index, bVar52.f9966h0);
                    break;
                case 81:
                    b bVar53 = aVar.f9921d;
                    bVar53.f9968i0 = typedArray.getBoolean(index, bVar53.f9968i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f9914e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f9914e.get(index));
                    break;
            }
        }
    }

    public void A(int i7, float f7) {
        s(i7).f9921d.f9982v = f7;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z7) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f9917c.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f9917c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", BtcVLuo.XuJb + C2490a.a(childAt));
            } else {
                if (this.f9916b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f9917c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f9917c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f9921d.f9958d0 = 1;
                        }
                        int i8 = aVar.f9921d.f9958d0;
                        if (i8 != -1 && i8 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f9921d.f9954b0);
                            barrier.setMargin(aVar.f9921d.f9956c0);
                            barrier.setAllowsGoneWidget(aVar.f9921d.f9970j0);
                            b bVar = aVar.f9921d;
                            int[] iArr = bVar.f9960e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f9962f0;
                                if (str != null) {
                                    bVar.f9960e0 = p(barrier, str);
                                    barrier.setReferencedIds(aVar.f9921d.f9960e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z7) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f9923f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0080d c0080d = aVar.f9919b;
                        if (c0080d.f9997c == 0) {
                            childAt.setVisibility(c0080d.f9996b);
                        }
                        childAt.setAlpha(aVar.f9919b.f9998d);
                        childAt.setRotation(aVar.f9922e.f10002b);
                        childAt.setRotationX(aVar.f9922e.f10003c);
                        childAt.setRotationY(aVar.f9922e.f10004d);
                        childAt.setScaleX(aVar.f9922e.f10005e);
                        childAt.setScaleY(aVar.f9922e.f10006f);
                        if (!Float.isNaN(aVar.f9922e.f10007g)) {
                            childAt.setPivotX(aVar.f9922e.f10007g);
                        }
                        if (!Float.isNaN(aVar.f9922e.f10008h)) {
                            childAt.setPivotY(aVar.f9922e.f10008h);
                        }
                        childAt.setTranslationX(aVar.f9922e.f10009i);
                        childAt.setTranslationY(aVar.f9922e.f10010j);
                        childAt.setTranslationZ(aVar.f9922e.f10011k);
                        e eVar = aVar.f9922e;
                        if (eVar.f10012l) {
                            childAt.setElevation(eVar.f10013m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f9917c.get(num);
            int i9 = aVar2.f9921d.f9958d0;
            if (i9 != -1 && i9 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f9921d;
                int[] iArr2 = bVar3.f9960e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f9962f0;
                    if (str2 != null) {
                        bVar3.f9960e0 = p(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f9921d.f9960e0);
                    }
                }
                barrier2.setType(aVar2.f9921d.f9954b0);
                barrier2.setMargin(aVar2.f9921d.f9956c0);
                ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.n();
                aVar2.d(bVarGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
            }
            if (aVar2.f9921d.f9951a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(bVarGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i7) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i7, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f9917c.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f9916b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f9917c.containsKey(Integer.valueOf(id))) {
                this.f9917c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f9917c.get(Integer.valueOf(id));
            aVar.f9923f = androidx.constraintlayout.widget.a.a(this.f9915a, childAt);
            aVar.f(id, bVar);
            aVar.f9919b.f9996b = childAt.getVisibility();
            aVar.f9919b.f9998d = childAt.getAlpha();
            aVar.f9922e.f10002b = childAt.getRotation();
            aVar.f9922e.f10003c = childAt.getRotationX();
            aVar.f9922e.f10004d = childAt.getRotationY();
            aVar.f9922e.f10005e = childAt.getScaleX();
            aVar.f9922e.f10006f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f9922e;
                eVar.f10007g = pivotX;
                eVar.f10008h = pivotY;
            }
            aVar.f9922e.f10009i = childAt.getTranslationX();
            aVar.f9922e.f10010j = childAt.getTranslationY();
            aVar.f9922e.f10011k = childAt.getTranslationZ();
            e eVar2 = aVar.f9922e;
            if (eVar2.f10012l) {
                eVar2.f10013m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f9921d.f9970j0 = barrier.o();
                aVar.f9921d.f9960e0 = barrier.getReferencedIds();
                aVar.f9921d.f9954b0 = barrier.getType();
                aVar.f9921d.f9956c0 = barrier.getMargin();
            }
        }
    }

    public void g(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f9917c.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = eVar.getChildAt(i7);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f9916b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f9917c.containsKey(Integer.valueOf(id))) {
                this.f9917c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f9917c.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void h(int i7, int i8, int i9, int i10) {
        if (!this.f9917c.containsKey(Integer.valueOf(i7))) {
            this.f9917c.put(Integer.valueOf(i7), new a());
        }
        a aVar = this.f9917c.get(Integer.valueOf(i7));
        switch (i8) {
            case 1:
                if (i10 == 1) {
                    b bVar = aVar.f9921d;
                    bVar.f9965h = i9;
                    bVar.f9967i = -1;
                    return;
                } else if (i10 == 2) {
                    b bVar2 = aVar.f9921d;
                    bVar2.f9967i = i9;
                    bVar2.f9965h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + B(i10) + " undefined");
                }
            case 2:
                if (i10 == 1) {
                    b bVar3 = aVar.f9921d;
                    bVar3.f9969j = i9;
                    bVar3.f9971k = -1;
                    return;
                } else if (i10 == 2) {
                    b bVar4 = aVar.f9921d;
                    bVar4.f9971k = i9;
                    bVar4.f9969j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                }
            case 3:
                if (i10 == 3) {
                    b bVar5 = aVar.f9921d;
                    bVar5.f9972l = i9;
                    bVar5.f9973m = -1;
                    bVar5.f9976p = -1;
                    return;
                }
                if (i10 == 4) {
                    b bVar6 = aVar.f9921d;
                    bVar6.f9973m = i9;
                    bVar6.f9972l = -1;
                    bVar6.f9976p = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + B(i10) + " undefined");
            case 4:
                if (i10 == 4) {
                    b bVar7 = aVar.f9921d;
                    bVar7.f9975o = i9;
                    bVar7.f9974n = -1;
                    bVar7.f9976p = -1;
                    return;
                }
                if (i10 == 3) {
                    b bVar8 = aVar.f9921d;
                    bVar8.f9974n = i9;
                    bVar8.f9975o = -1;
                    bVar8.f9976p = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + B(i10) + " undefined");
            case 5:
                if (i10 != 5) {
                    throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                }
                b bVar9 = aVar.f9921d;
                bVar9.f9976p = i9;
                bVar9.f9975o = -1;
                bVar9.f9974n = -1;
                bVar9.f9972l = -1;
                bVar9.f9973m = -1;
                return;
            case 6:
                if (i10 == 6) {
                    b bVar10 = aVar.f9921d;
                    bVar10.f9978r = i9;
                    bVar10.f9977q = -1;
                    return;
                } else if (i10 == 7) {
                    b bVar11 = aVar.f9921d;
                    bVar11.f9977q = i9;
                    bVar11.f9978r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                }
            case 7:
                if (i10 == 7) {
                    b bVar12 = aVar.f9921d;
                    bVar12.f9980t = i9;
                    bVar12.f9979s = -1;
                    return;
                } else if (i10 == 6) {
                    b bVar13 = aVar.f9921d;
                    bVar13.f9979s = i9;
                    bVar13.f9980t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                }
            default:
                throw new IllegalArgumentException(B(i8) + " to " + B(i10) + " unknown");
        }
    }

    public void i(int i7, int i8, int i9, int i10, int i11) {
        if (!this.f9917c.containsKey(Integer.valueOf(i7))) {
            this.f9917c.put(Integer.valueOf(i7), new a());
        }
        a aVar = this.f9917c.get(Integer.valueOf(i7));
        switch (i8) {
            case 1:
                if (i10 == 1) {
                    b bVar = aVar.f9921d;
                    bVar.f9965h = i9;
                    bVar.f9967i = -1;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException("Left to " + B(i10) + " undefined");
                    }
                    b bVar2 = aVar.f9921d;
                    bVar2.f9967i = i9;
                    bVar2.f9965h = -1;
                }
                aVar.f9921d.f9928D = i11;
                return;
            case 2:
                if (i10 == 1) {
                    b bVar3 = aVar.f9921d;
                    bVar3.f9969j = i9;
                    bVar3.f9971k = -1;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                    }
                    b bVar4 = aVar.f9921d;
                    bVar4.f9971k = i9;
                    bVar4.f9969j = -1;
                }
                aVar.f9921d.f9929E = i11;
                return;
            case 3:
                if (i10 == 3) {
                    b bVar5 = aVar.f9921d;
                    bVar5.f9972l = i9;
                    bVar5.f9973m = -1;
                    bVar5.f9976p = -1;
                } else {
                    if (i10 != 4) {
                        throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                    }
                    b bVar6 = aVar.f9921d;
                    bVar6.f9973m = i9;
                    bVar6.f9972l = -1;
                    bVar6.f9976p = -1;
                }
                aVar.f9921d.f9930F = i11;
                return;
            case 4:
                if (i10 == 4) {
                    b bVar7 = aVar.f9921d;
                    bVar7.f9975o = i9;
                    bVar7.f9974n = -1;
                    bVar7.f9976p = -1;
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                    }
                    b bVar8 = aVar.f9921d;
                    bVar8.f9974n = i9;
                    bVar8.f9975o = -1;
                    bVar8.f9976p = -1;
                }
                aVar.f9921d.f9931G = i11;
                return;
            case 5:
                if (i10 != 5) {
                    throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                }
                b bVar9 = aVar.f9921d;
                bVar9.f9976p = i9;
                bVar9.f9975o = -1;
                bVar9.f9974n = -1;
                bVar9.f9972l = -1;
                bVar9.f9973m = -1;
                return;
            case 6:
                if (i10 == 6) {
                    b bVar10 = aVar.f9921d;
                    bVar10.f9978r = i9;
                    bVar10.f9977q = -1;
                } else {
                    if (i10 != 7) {
                        throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                    }
                    b bVar11 = aVar.f9921d;
                    bVar11.f9977q = i9;
                    bVar11.f9978r = -1;
                }
                aVar.f9921d.f9933I = i11;
                return;
            case 7:
                if (i10 == 7) {
                    b bVar12 = aVar.f9921d;
                    bVar12.f9980t = i9;
                    bVar12.f9979s = -1;
                } else {
                    if (i10 != 6) {
                        throw new IllegalArgumentException("right to " + B(i10) + " undefined");
                    }
                    b bVar13 = aVar.f9921d;
                    bVar13.f9979s = i9;
                    bVar13.f9980t = -1;
                }
                aVar.f9921d.f9932H = i11;
                return;
            default:
                throw new IllegalArgumentException(B(i8) + " to " + B(i10) + " unknown");
        }
    }

    public void j(int i7, int i8, int i9, float f7) {
        b bVar = s(i7).f9921d;
        bVar.f9984x = i8;
        bVar.f9985y = i9;
        bVar.f9986z = f7;
    }

    public void k(int i7, int i8) {
        s(i7).f9921d.f9944T = i8;
    }

    public void l(int i7, int i8) {
        s(i7).f9921d.f9957d = i8;
    }

    public void m(int i7, int i8) {
        s(i7).f9921d.f9955c = i8;
    }

    public void n(int i7, boolean z7) {
        s(i7).f9921d.f9968i0 = z7;
    }

    public void o(int i7, boolean z7) {
        s(i7).f9921d.f9966h0 = z7;
    }

    public void q(int i7, int i8, int i9, int i10, int[] iArr, float[] fArr, int i11) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            s(iArr[0]).f9921d.f9940P = fArr[0];
        }
        s(iArr[0]).f9921d.f9943S = i11;
        i(iArr[0], 3, i7, i8, 0);
        for (int i12 = 1; i12 < iArr.length; i12++) {
            int i13 = i12 - 1;
            i(iArr[i12], 3, iArr[i13], 4, 0);
            i(iArr[i13], 4, iArr[i12], 3, 0);
            if (fArr != null) {
                s(iArr[i12]).f9921d.f9940P = fArr[i12];
            }
        }
        i(iArr[iArr.length - 1], 4, i9, i10, 0);
    }

    public void t(Context context, int i7) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarR = r(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarR.f9921d.f9951a = true;
                    }
                    this.f9917c.put(Integer.valueOf(aVarR.f9918a), aVarR);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public void u(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.u(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void x(int i7, float f7) {
        s(i7).f9921d.f9981u = f7;
    }

    public void y(int i7, float f7) {
        s(i7).f9921d.f9941Q = f7;
    }

    public void z(int i7, int i8, int i9) {
        a aVarS = s(i7);
        switch (i8) {
            case 1:
                aVarS.f9921d.f9928D = i9;
                return;
            case 2:
                aVarS.f9921d.f9929E = i9;
                return;
            case 3:
                aVarS.f9921d.f9930F = i9;
                return;
            case 4:
                aVarS.f9921d.f9931G = i9;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                aVarS.f9921d.f9933I = i9;
                return;
            case 7:
                aVarS.f9921d.f9932H = i9;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
