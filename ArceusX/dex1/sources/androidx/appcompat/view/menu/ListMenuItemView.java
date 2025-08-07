package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.Z;
import g.C2447a;
import g.C2452f;
import g.C2453g;
import g.C2456j;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    private ImageView f8885A;

    private LinearLayout f8886B;

    private Drawable f8887C;

    private int f8888D;

    private Context f8889E;

    private boolean f8890F;

    private Drawable f8891G;

    private boolean f8892H;

    private LayoutInflater f8893I;

    private boolean f8894J;

    private i f8895d;

    private ImageView f8896e;

    private RadioButton f8897i;

    private TextView f8898v;

    private CheckBox f8899w;

    private TextView f8900y;

    private ImageView f8901z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20526G);
    }

    private void c(View view) {
        d(view, -1);
    }

    private void d(View view, int i7) {
        LinearLayout linearLayout = this.f8886B;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2453g.f20686j, (ViewGroup) this, false);
        this.f8899w = checkBox;
        c(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(C2453g.f20687k, (ViewGroup) this, false);
        this.f8896e = imageView;
        d(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2453g.f20689m, (ViewGroup) this, false);
        this.f8897i = radioButton;
        c(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f8893I == null) {
            this.f8893I = LayoutInflater.from(getContext());
        }
        return this.f8893I;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f8901z;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8885A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8885A.getLayoutParams();
        rect.top += this.f8885A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override
    public void b(i iVar, int i7) {
        this.f8895d = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override
    public i getItemData() {
        return this.f8895d;
    }

    public void h(boolean z7, char c2) {
        int i7 = (z7 && this.f8895d.A()) ? 0 : 8;
        if (i7 == 0) {
            this.f8900y.setText(this.f8895d.h());
        }
        if (this.f8900y.getVisibility() != i7) {
            this.f8900y.setVisibility(i7);
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Z.r0(this, this.f8887C);
        TextView textView = (TextView) findViewById(C2452f.f20647R);
        this.f8898v = textView;
        int i7 = this.f8888D;
        if (i7 != -1) {
            textView.setTextAppearance(this.f8889E, i7);
        }
        this.f8900y = (TextView) findViewById(C2452f.f20640K);
        ImageView imageView = (ImageView) findViewById(C2452f.f20643N);
        this.f8901z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8891G);
        }
        this.f8885A = (ImageView) findViewById(C2452f.f20671u);
        this.f8886B = (LinearLayout) findViewById(C2452f.f20663m);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (this.f8896e != null && this.f8890F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8896e.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f8897i == null && this.f8899w == null) {
            return;
        }
        if (this.f8895d.m()) {
            if (this.f8897i == null) {
                g();
            }
            compoundButton = this.f8897i;
            view = this.f8899w;
        } else {
            if (this.f8899w == null) {
                e();
            }
            compoundButton = this.f8899w;
            view = this.f8897i;
        }
        if (z7) {
            compoundButton.setChecked(this.f8895d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f8899w;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f8897i;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f8895d.m()) {
            if (this.f8897i == null) {
                g();
            }
            compoundButton = this.f8897i;
        } else {
            if (this.f8899w == null) {
                e();
            }
            compoundButton = this.f8899w;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f8894J = z7;
        this.f8890F = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f8885A;
        if (imageView != null) {
            imageView.setVisibility((this.f8892H || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f8895d.z() || this.f8894J;
        if (z7 || this.f8890F) {
            ImageView imageView = this.f8896e;
            if (imageView == null && drawable == null && !this.f8890F) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f8890F) {
                this.f8896e.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f8896e;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f8896e.getVisibility() != 0) {
                this.f8896e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f8898v.getVisibility() != 8) {
                this.f8898v.setVisibility(8);
            }
        } else {
            this.f8898v.setText(charSequence);
            if (this.f8898v.getVisibility() != 0) {
                this.f8898v.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C2456j.V1, i7, 0);
        this.f8887C = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.X1);
        this.f8888D = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.W1, -1);
        this.f8890F = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.Y1, false);
        this.f8889E = context;
        this.f8891G = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.Z1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C2447a.f20523D, 0);
        this.f8892H = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}
