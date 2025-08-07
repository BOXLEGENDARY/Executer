package com.google.android.material.datepicker;

import U.Gw.oeVkjmfPcLbWm;
import Z.tNT.PexNRiLSd;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import androidx.fragment.app.B;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1658c;
import androidx.room.kU.HguUe;
import c4.C1746b;
import c4.C1748d;
import c4.C1749e;
import c4.C1750f;
import c4.C1752h;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.s;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import h.C2473a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ka.oik.UJEa;
import l4.ViewOnTouchListenerC2544a;
import r4.C2753b;
import u4.C2937g;

public final class g<S> extends DialogInterfaceOnCancelListenerC1658c {

    static final Object f17806X = "CONFIRM_BUTTON_TAG";

    static final Object f17807Y = oeVkjmfPcLbWm.UDQ;

    static final Object f17808Z = "TOGGLE_BUTTON_TAG";

    private CalendarConstraints f17809A;

    private DayViewDecorator f17810B;

    private e<S> f17811C;

    private int f17812D;

    private CharSequence f17813E;

    private boolean f17814F;

    private int f17815G;

    private int f17816H;

    private CharSequence f17817I;

    private int f17818J;

    private CharSequence f17819K;

    private int f17820L;

    private CharSequence f17821M;

    private int f17822N;

    private CharSequence f17823O;

    private TextView f17824P;

    private TextView f17825Q;

    private CheckableImageButton f17826R;

    private C2937g f17827S;

    private Button f17828T;

    private boolean f17829U;

    private CharSequence f17830V;

    private CharSequence f17831W;

    private final LinkedHashSet<h<? super S>> f17832d = new LinkedHashSet<>();

    private final LinkedHashSet<View.OnClickListener> f17833e = new LinkedHashSet<>();

    private final LinkedHashSet<DialogInterface.OnCancelListener> f17834i = new LinkedHashSet<>();

    private final LinkedHashSet<DialogInterface.OnDismissListener> f17835v = new LinkedHashSet<>();

    private int f17836w;

    private DateSelector<S> f17837y;

    private m<S> f17838z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            Iterator it = g.this.f17832d.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(g.this.E());
            }
            g.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override
        public void onClick(View view) {
            Iterator it = g.this.f17833e.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            g.this.dismiss();
        }
    }

    class c implements I {

        final int f17841d;

        final View f17842e;

        final int f17843i;

        c(int i7, View view, int i8) {
            this.f17841d = i7;
            this.f17842e = view;
            this.f17843i = i8;
        }

        @Override
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            int i7 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f17841d >= 0) {
                this.f17842e.getLayoutParams().height = this.f17841d + i7;
                View view2 = this.f17842e;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f17842e;
            view3.setPadding(view3.getPaddingLeft(), this.f17843i + i7, this.f17842e.getPaddingRight(), this.f17842e.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    class d extends l<S> {
        d() {
        }

        @Override
        public void a(S s7) {
            g gVar = g.this;
            gVar.N(gVar.B());
            g.this.f17828T.setEnabled(g.this.y().I0());
        }
    }

    private String A() {
        return y().h0(requireContext());
    }

    private static int D(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1748d.f12789P);
        int i7 = Month.h().f17744v;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C1748d.f12791R) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(C1748d.f12794U));
    }

    private int F(Context context) {
        int i7 = this.f17836w;
        return i7 != 0 ? i7 : y().k0(context);
    }

    private void G(Context context) {
        this.f17826R.setTag(f17808Z);
        this.f17826R.setImageDrawable(w(context));
        this.f17826R.setChecked(this.f17815G != 0);
        Z.n0(this.f17826R, null);
        Q(this.f17826R);
        this.f17826R.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f17805d.K(view);
            }
        });
    }

    static boolean H(Context context) {
        return L(context, R.attr.windowFullscreen);
    }

    private boolean I() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean J(Context context) {
        return L(context, C1746b.f12721Q);
    }

    public void K(View view) {
        this.f17828T.setEnabled(y().I0());
        this.f17826R.toggle();
        this.f17815G = this.f17815G == 1 ? 0 : 1;
        Q(this.f17826R);
        M();
    }

    static boolean L(Context context, int i7) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C2753b.d(context, C1746b.f12761x, e.class.getCanonicalName()), new int[]{i7});
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z7;
    }

    private void M() {
        int iF = F(requireContext());
        i iVarK = e.K(y(), iF, this.f17809A, this.f17810B);
        this.f17811C = iVarK;
        if (this.f17815G == 1) {
            iVarK = i.t(y(), iF, this.f17809A);
        }
        this.f17838z = iVarK;
        O();
        N(B());
        B bP = getChildFragmentManager().p();
        bP.n(C1750f.f12894x, this.f17838z);
        bP.i();
        this.f17838z.q(new d());
    }

    private void O() {
        this.f17824P.setText((this.f17815G == 1 && I()) ? this.f17831W : this.f17830V);
    }

    private void Q(CheckableImageButton checkableImageButton) {
        this.f17826R.setContentDescription(this.f17815G == 1 ? checkableImageButton.getContext().getString(C1753i.f12939r) : checkableImageButton.getContext().getString(C1753i.f12941t));
    }

    private static Drawable w(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C2473a.b(context, C1749e.f12842e));
        stateListDrawable.addState(new int[0], C2473a.b(context, C1749e.f12843f));
        return stateListDrawable;
    }

    private void x(Window window) {
        if (this.f17829U) {
            return;
        }
        View viewFindViewById = requireView().findViewById(C1750f.f12877g);
        com.google.android.material.internal.d.a(window, true, s.e(viewFindViewById), null);
        Z.B0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f17829U = true;
    }

    public DateSelector<S> y() {
        if (this.f17837y == null) {
            this.f17837y = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f17837y;
    }

    private static CharSequence z(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public String B() {
        return y().u(getContext());
    }

    public final S E() {
        return y().P0();
    }

    void N(String str) {
        this.f17825Q.setContentDescription(A());
        this.f17825Q.setText(str);
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f17834i.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17836w = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f17837y = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f17809A = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f17810B = (DayViewDecorator) bundle.getParcelable(HguUe.wVFUJTJtuiEQM);
        this.f17812D = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f17813E = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f17815G = bundle.getInt("INPUT_MODE_KEY");
        this.f17816H = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f17817I = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f17818J = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f17819K = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f17820L = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f17821M = bundle.getCharSequence(PexNRiLSd.fpriM);
        this.f17822N = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f17823O = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f17813E;
        if (text == null) {
            text = requireContext().getResources().getText(this.f17812D);
        }
        this.f17830V = text;
        this.f17831W = z(text);
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), F(requireContext()));
        Context context = dialog.getContext();
        this.f17814F = H(context);
        int i7 = C1746b.f12761x;
        int i8 = C1754j.f12971x;
        this.f17827S = new C2937g(context, null, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1755k.f13165f3, i7, i8);
        int color = typedArrayObtainStyledAttributes.getColor(C1755k.f13173g3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f17827S.Q(context);
        this.f17827S.a0(ColorStateList.valueOf(color));
        this.f17827S.Z(Z.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f17814F ? C1752h.f12921v : C1752h.f12920u, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f17810B;
        if (dayViewDecorator != null) {
            dayViewDecorator.i(context);
        }
        if (this.f17814F) {
            viewInflate.findViewById(C1750f.f12894x).setLayoutParams(new LinearLayout.LayoutParams(D(context), -2));
        } else {
            viewInflate.findViewById(C1750f.f12895y).setLayoutParams(new LinearLayout.LayoutParams(D(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(C1750f.f12855E);
        this.f17825Q = textView;
        Z.p0(textView, 1);
        this.f17826R = (CheckableImageButton) viewInflate.findViewById(C1750f.f12856F);
        this.f17824P = (TextView) viewInflate.findViewById(C1750f.f12857G);
        G(context);
        this.f17828T = (Button) viewInflate.findViewById(C1750f.f12874d);
        if (y().I0()) {
            this.f17828T.setEnabled(true);
        } else {
            this.f17828T.setEnabled(false);
        }
        this.f17828T.setTag(f17806X);
        CharSequence charSequence = this.f17817I;
        if (charSequence != null) {
            this.f17828T.setText(charSequence);
        } else {
            int i7 = this.f17816H;
            if (i7 != 0) {
                this.f17828T.setText(i7);
            }
        }
        CharSequence charSequence2 = this.f17819K;
        if (charSequence2 != null) {
            this.f17828T.setContentDescription(charSequence2);
        } else if (this.f17818J != 0) {
            this.f17828T.setContentDescription(getContext().getResources().getText(this.f17818J));
        }
        this.f17828T.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C1750f.f12871a);
        button.setTag(f17807Y);
        CharSequence charSequence3 = this.f17821M;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i8 = this.f17820L;
            if (i8 != 0) {
                button.setText(i8);
            }
        }
        CharSequence charSequence4 = this.f17823O;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f17822N != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f17822N));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f17835v.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f17836w);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f17837y);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f17809A);
        e<S> eVar = this.f17811C;
        Month monthF = eVar == null ? null : eVar.F();
        if (monthF != null) {
            bVar.b(monthF.f17746y);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable(tAjeAKSIqDqzNP.oLiSZFpNRXm, this.f17810B);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f17812D);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f17813E);
        bundle.putInt("INPUT_MODE_KEY", this.f17815G);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f17816H);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f17817I);
        bundle.putInt(UJEa.arXzaKBlPep, this.f17818J);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f17819K);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f17820L);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f17821M);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f17822N);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f17823O);
    }

    @Override
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f17814F) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f17827S);
            x(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C1748d.f12793T);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f17827S, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC2544a(requireDialog(), rect));
        }
        M();
    }

    @Override
    public void onStop() {
        this.f17838z.s();
        super.onStop();
    }
}
