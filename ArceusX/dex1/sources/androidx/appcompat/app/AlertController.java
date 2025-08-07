package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.Z;
import androidx.core.widget.NestedScrollView;
import g.C2447a;
import g.C2452f;
import g.C2456j;
import java.lang.ref.WeakReference;

class AlertController {

    NestedScrollView f8491A;

    private Drawable f8493C;

    private ImageView f8494D;

    private TextView f8495E;

    private TextView f8496F;

    private View f8497G;

    ListAdapter f8498H;

    private int f8500J;

    private int f8501K;

    int f8502L;

    int f8503M;

    int f8504N;

    int f8505O;

    private boolean f8506P;

    Handler f8508R;

    private final Context f8510a;

    final p f8511b;

    private final Window f8512c;

    private final int f8513d;

    private CharSequence f8514e;

    private CharSequence f8515f;

    ListView f8516g;

    private View f8517h;

    private int f8518i;

    private int f8519j;

    private int f8520k;

    private int f8521l;

    private int f8522m;

    Button f8524o;

    private CharSequence f8525p;

    Message f8526q;

    private Drawable f8527r;

    Button f8528s;

    private CharSequence f8529t;

    Message f8530u;

    private Drawable f8531v;

    Button f8532w;

    private CharSequence f8533x;

    Message f8534y;

    private Drawable f8535z;

    private boolean f8523n = false;

    private int f8492B = 0;

    int f8499I = -1;

    private int f8507Q = 0;

    private final View.OnClickListener f8509S = new a();

    public static class RecycleListView extends ListView {

        private final int f8536d;

        private final int f8537e;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.f20811e2);
            this.f8537e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20816f2, -1);
            this.f8536d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20821g2, -1);
        }

        public void a(boolean z7, boolean z8) {
            if (z8 && z7) {
                return;
            }
            setPadding(getPaddingLeft(), z7 ? getPaddingTop() : this.f8536d, getPaddingRight(), z8 ? getPaddingBottom() : this.f8537e);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f8524o || (message3 = alertController.f8526q) == null) ? (view != alertController.f8528s || (message2 = alertController.f8530u) == null) ? (view != alertController.f8532w || (message = alertController.f8534y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f8508R.obtainMessage(1, alertController2.f8511b).sendToTarget();
        }
    }

    public static class b {

        public int f8539A;

        public int f8540B;

        public int f8541C;

        public int f8542D;

        public boolean[] f8544F;

        public boolean f8545G;

        public boolean f8546H;

        public DialogInterface.OnMultiChoiceClickListener f8548J;

        public Cursor f8549K;

        public String f8550L;

        public String f8551M;

        public AdapterView.OnItemSelectedListener f8552N;

        public final Context f8554a;

        public final LayoutInflater f8555b;

        public Drawable f8557d;

        public CharSequence f8559f;

        public View f8560g;

        public CharSequence f8561h;

        public CharSequence f8562i;

        public Drawable f8563j;

        public DialogInterface.OnClickListener f8564k;

        public CharSequence f8565l;

        public Drawable f8566m;

        public DialogInterface.OnClickListener f8567n;

        public CharSequence f8568o;

        public Drawable f8569p;

        public DialogInterface.OnClickListener f8570q;

        public DialogInterface.OnCancelListener f8572s;

        public DialogInterface.OnDismissListener f8573t;

        public DialogInterface.OnKeyListener f8574u;

        public CharSequence[] f8575v;

        public ListAdapter f8576w;

        public DialogInterface.OnClickListener f8577x;

        public int f8578y;

        public View f8579z;

        public int f8556c = 0;

        public int f8558e = 0;

        public boolean f8543E = false;

        public int f8547I = -1;

        public boolean f8553O = true;

        public boolean f8571r = true;

        class a extends ArrayAdapter<CharSequence> {

            final RecycleListView f8580d;

            a(Context context, int i7, int i8, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i7, i8, charSequenceArr);
                this.f8580d = recycleListView;
            }

            @Override
            public View getView(int i7, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i7, view, viewGroup);
                boolean[] zArr = b.this.f8544F;
                if (zArr != null && zArr[i7]) {
                    this.f8580d.setItemChecked(i7, true);
                }
                return view2;
            }
        }

        class C0066b extends CursorAdapter {

            private final int f8582d;

            private final int f8583e;

            final RecycleListView f8584i;

            final AlertController f8585v;

            C0066b(Context context, Cursor cursor, boolean z7, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z7);
                this.f8584i = recycleListView;
                this.f8585v = alertController;
                Cursor cursor2 = getCursor();
                this.f8582d = cursor2.getColumnIndexOrThrow(b.this.f8550L);
                this.f8583e = cursor2.getColumnIndexOrThrow(b.this.f8551M);
            }

            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f8582d));
                this.f8584i.setItemChecked(cursor.getPosition(), cursor.getInt(this.f8583e) == 1);
            }

            @Override
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f8555b.inflate(this.f8585v.f8503M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            final AlertController f8587d;

            c(AlertController alertController) {
                this.f8587d = alertController;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                b.this.f8577x.onClick(this.f8587d.f8511b, i7);
                if (b.this.f8546H) {
                    return;
                }
                this.f8587d.f8511b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            final RecycleListView f8589d;

            final AlertController f8590e;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f8589d = recycleListView;
                this.f8590e = alertController;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                boolean[] zArr = b.this.f8544F;
                if (zArr != null) {
                    zArr[i7] = this.f8589d.isItemChecked(i7);
                }
                b.this.f8548J.onClick(this.f8590e.f8511b, i7, this.f8589d.isItemChecked(i7));
            }
        }

        public b(Context context) {
            this.f8554a = context;
            this.f8555b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f8555b.inflate(alertController.f8502L, (ViewGroup) null);
            if (this.f8545G) {
                dVar = this.f8549K == null ? new a(this.f8554a, alertController.f8503M, R.id.text1, this.f8575v, recycleListView) : new C0066b(this.f8554a, this.f8549K, false, recycleListView, alertController);
            } else {
                int i7 = this.f8546H ? alertController.f8504N : alertController.f8505O;
                if (this.f8549K != null) {
                    dVar = new SimpleCursorAdapter(this.f8554a, i7, this.f8549K, new String[]{this.f8550L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f8576w;
                    if (dVar == null) {
                        dVar = new d(this.f8554a, i7, R.id.text1, this.f8575v);
                    }
                }
            }
            alertController.f8498H = dVar;
            alertController.f8499I = this.f8547I;
            if (this.f8577x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f8548J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8552N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f8546H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f8545G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f8516g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f8560g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f8559f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f8557d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i7 = this.f8556c;
                if (i7 != 0) {
                    alertController.m(i7);
                }
                int i8 = this.f8558e;
                if (i8 != 0) {
                    alertController.m(alertController.d(i8));
                }
            }
            CharSequence charSequence2 = this.f8561h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f8562i;
            if (charSequence3 != null || this.f8563j != null) {
                alertController.k(-1, charSequence3, this.f8564k, null, this.f8563j);
            }
            CharSequence charSequence4 = this.f8565l;
            if (charSequence4 != null || this.f8566m != null) {
                alertController.k(-2, charSequence4, this.f8567n, null, this.f8566m);
            }
            CharSequence charSequence5 = this.f8568o;
            if (charSequence5 != null || this.f8569p != null) {
                alertController.k(-3, charSequence5, this.f8570q, null, this.f8569p);
            }
            if (this.f8575v != null || this.f8549K != null || this.f8576w != null) {
                b(alertController);
            }
            View view2 = this.f8579z;
            if (view2 != null) {
                if (this.f8543E) {
                    alertController.t(view2, this.f8539A, this.f8540B, this.f8541C, this.f8542D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i9 = this.f8578y;
            if (i9 != 0) {
                alertController.r(i9);
            }
        }
    }

    private static final class c extends Handler {

        private WeakReference<DialogInterface> f8592a;

        public c(DialogInterface dialogInterface) {
            this.f8592a = new WeakReference<>(dialogInterface);
        }

        @Override
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f8592a.get(), message.what);
            } else {
                if (i7 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i7, int i8, CharSequence[] charSequenceArr) {
            super(context, i7, i8, charSequenceArr);
        }

        @Override
        public long getItemId(int i7) {
            return i7;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f8510a = context;
        this.f8511b = pVar;
        this.f8512c = window;
        this.f8508R = new c(pVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C2456j.f20745H, C2447a.f20554p, 0);
        this.f8500J = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20748I, 0);
        this.f8501K = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20755K, 0);
        this.f8502L = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20761M, 0);
        this.f8503M = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20764N, 0);
        this.f8504N = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20770P, 0);
        this.f8505O = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20758L, 0);
        this.f8506P = typedArrayObtainStyledAttributes.getBoolean(C2456j.f20767O, true);
        this.f8513d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20751J, 0);
        typedArrayObtainStyledAttributes.recycle();
        pVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i7 = this.f8501K;
        return (i7 != 0 && this.f8507Q == 1) ? i7 : this.f8500J;
    }

    private void p(ViewGroup viewGroup, View view, int i7, int i8) {
        View viewFindViewById = this.f8512c.findViewById(C2452f.f20630A);
        View viewFindViewById2 = this.f8512c.findViewById(C2452f.f20676z);
        Z.E0(view, i7, i8);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        int i7;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f8524o = button;
        button.setOnClickListener(this.f8509S);
        if (TextUtils.isEmpty(this.f8525p) && this.f8527r == null) {
            this.f8524o.setVisibility(8);
            i7 = 0;
        } else {
            this.f8524o.setText(this.f8525p);
            Drawable drawable = this.f8527r;
            if (drawable != null) {
                int i8 = this.f8513d;
                drawable.setBounds(0, 0, i8, i8);
                this.f8524o.setCompoundDrawables(this.f8527r, null, null, null);
            }
            this.f8524o.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f8528s = button2;
        button2.setOnClickListener(this.f8509S);
        if (TextUtils.isEmpty(this.f8529t) && this.f8531v == null) {
            this.f8528s.setVisibility(8);
        } else {
            this.f8528s.setText(this.f8529t);
            Drawable drawable2 = this.f8531v;
            if (drawable2 != null) {
                int i9 = this.f8513d;
                drawable2.setBounds(0, 0, i9, i9);
                this.f8528s.setCompoundDrawables(this.f8531v, null, null, null);
            }
            this.f8528s.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f8532w = button3;
        button3.setOnClickListener(this.f8509S);
        if (TextUtils.isEmpty(this.f8533x) && this.f8535z == null) {
            this.f8532w.setVisibility(8);
        } else {
            this.f8532w.setText(this.f8533x);
            Drawable drawable3 = this.f8535z;
            if (drawable3 != null) {
                int i10 = this.f8513d;
                drawable3.setBounds(0, 0, i10, i10);
                this.f8532w.setCompoundDrawables(this.f8535z, null, null, null);
            }
            this.f8532w.setVisibility(0);
            i7 |= 4;
        }
        if (z(this.f8510a)) {
            if (i7 == 1) {
                b(this.f8524o);
            } else if (i7 == 2) {
                b(this.f8528s);
            } else if (i7 == 4) {
                b(this.f8532w);
            }
        }
        if (i7 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f8512c.findViewById(C2452f.f20631B);
        this.f8491A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f8491A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f8496F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f8515f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f8491A.removeView(this.f8496F);
        if (this.f8516g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f8491A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f8491A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f8516g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f8517h;
        if (viewInflate == null) {
            viewInflate = this.f8518i != 0 ? LayoutInflater.from(this.f8510a).inflate(this.f8518i, viewGroup, false) : null;
        }
        boolean z7 = viewInflate != null;
        if (!z7 || !a(viewInflate)) {
            this.f8512c.setFlags(131072, 131072);
        }
        if (!z7) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f8512c.findViewById(C2452f.f20665o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f8523n) {
            frameLayout.setPadding(this.f8519j, this.f8520k, this.f8521l, this.f8522m);
        }
        if (this.f8516g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.f8497G != null) {
            viewGroup.addView(this.f8497G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f8512c.findViewById(C2452f.f20649T).setVisibility(8);
            return;
        }
        this.f8494D = (ImageView) this.f8512c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f8514e) || !this.f8506P) {
            this.f8512c.findViewById(C2452f.f20649T).setVisibility(8);
            this.f8494D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f8512c.findViewById(C2452f.f20661k);
        this.f8495E = textView;
        textView.setText(this.f8514e);
        int i7 = this.f8492B;
        if (i7 != 0) {
            this.f8494D.setImageResource(i7);
            return;
        }
        Drawable drawable = this.f8493C;
        if (drawable != null) {
            this.f8494D.setImageDrawable(drawable);
        } else {
            this.f8495E.setPadding(this.f8494D.getPaddingLeft(), this.f8494D.getPaddingTop(), this.f8494D.getPaddingRight(), this.f8494D.getPaddingBottom());
            this.f8494D.setVisibility(8);
        }
    }

    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f8512c.findViewById(C2452f.f20675y);
        int i7 = C2452f.f20650U;
        View viewFindViewById4 = viewFindViewById3.findViewById(i7);
        int i8 = C2452f.f20664n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i8);
        int i9 = C2452f.f20662l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i9);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C2452f.f20666p);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i7);
        View viewFindViewById8 = viewGroup.findViewById(i8);
        View viewFindViewById9 = viewGroup.findViewById(i9);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z7 = viewGroup.getVisibility() != 8;
        boolean z8 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z9 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z9 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(C2452f.f20645P)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z8 != 0) {
            NestedScrollView nestedScrollView = this.f8491A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f8515f == null && this.f8516g == null) ? null : viewGroupI.findViewById(C2452f.f20648S);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(C2452f.f20646Q)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f8516g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z8, z9);
        }
        if (!z7) {
            View view = this.f8516g;
            if (view == null) {
                view = this.f8491A;
            }
            if (view != null) {
                p(viewGroupI2, view, z8 | (z9 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f8516g;
        if (listView2 == null || (listAdapter = this.f8498H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f8499I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2447a.f20553o, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i7) {
        if (i7 == -3) {
            return this.f8532w;
        }
        if (i7 == -2) {
            return this.f8528s;
        }
        if (i7 != -1) {
            return null;
        }
        return this.f8524o;
    }

    public int d(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f8510a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f8516g;
    }

    public void f() {
        this.f8511b.setContentView(j());
        y();
    }

    public boolean g(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8491A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean h(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8491A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void k(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f8508R.obtainMessage(i7, onClickListener);
        }
        if (i7 == -3) {
            this.f8533x = charSequence;
            this.f8534y = message;
            this.f8535z = drawable;
        } else if (i7 == -2) {
            this.f8529t = charSequence;
            this.f8530u = message;
            this.f8531v = drawable;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8525p = charSequence;
            this.f8526q = message;
            this.f8527r = drawable;
        }
    }

    public void l(View view) {
        this.f8497G = view;
    }

    public void m(int i7) {
        this.f8493C = null;
        this.f8492B = i7;
        ImageView imageView = this.f8494D;
        if (imageView != null) {
            if (i7 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f8494D.setImageResource(this.f8492B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.f8493C = drawable;
        this.f8492B = 0;
        ImageView imageView = this.f8494D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f8494D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f8515f = charSequence;
        TextView textView = this.f8496F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f8514e = charSequence;
        TextView textView = this.f8495E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i7) {
        this.f8517h = null;
        this.f8518i = i7;
        this.f8523n = false;
    }

    public void s(View view) {
        this.f8517h = view;
        this.f8518i = 0;
        this.f8523n = false;
    }

    public void t(View view, int i7, int i8, int i9, int i10) {
        this.f8517h = view;
        this.f8518i = 0;
        this.f8523n = true;
        this.f8519j = i7;
        this.f8520k = i8;
        this.f8521l = i9;
        this.f8522m = i10;
    }
}
