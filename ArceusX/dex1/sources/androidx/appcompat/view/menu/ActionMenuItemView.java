package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import g.C2456j;

public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    private boolean f8870A;

    private int f8871B;

    private int f8872C;

    private int f8873D;

    i f8874d;

    private CharSequence f8875e;

    private Drawable f8876i;

    g.b f8877v;

    private ForwardingListener f8878w;

    b f8879y;

    private boolean f8880z;

    private class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override
        public p getPopup() {
            b bVar = ActionMenuItemView.this.f8879y;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override
        protected boolean onForwardingStarted() {
            p popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f8877v;
            return bVar != null && bVar.invokeItem(actionMenuItemView.f8874d) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void o() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f8875e);
        if (this.f8876i != null && (!this.f8874d.B() || (!this.f8880z && !this.f8870A))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f8875e : null);
        CharSequence contentDescription = this.f8874d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z9 ? null : this.f8874d.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f8874d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z9 ? null : this.f8874d.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b(i iVar, int i7) {
        this.f8874d = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f8878w == null) {
            this.f8878w = new a();
        }
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override
    public i getItemData() {
        return this.f8874d;
    }

    @Override
    public boolean needsDividerAfter() {
        return d();
    }

    @Override
    public boolean needsDividerBefore() {
        return d() && this.f8874d.getIcon() == null;
    }

    @Override
    public void onClick(View view) {
        g.b bVar = this.f8877v;
        if (bVar != null) {
            bVar.invokeItem(this.f8874d);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8880z = g();
        o();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int i9;
        boolean zD = d();
        if (zD && (i9 = this.f8872C) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f8871B) : this.f8871B;
        if (mode != 1073741824 && this.f8871B > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i8);
        }
        if (zD || this.f8876i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8876i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f8874d.hasSubMenu() && (forwardingListener = this.f8878w) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f8870A != z7) {
            this.f8870A = z7;
            i iVar = this.f8874d;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8876i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f8873D;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        o();
    }

    public void setItemInvoker(g.b bVar) {
        this.f8877v = bVar;
    }

    @Override
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f8872C = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.f8879y = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8875e = charSequence;
        o();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f8880z = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.f20881v, i7, 0);
        this.f8871B = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20885w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8873D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8872C = -1;
        setSaveEnabled(false);
    }
}
