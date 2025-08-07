package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.Z;
import androidx.emoji2.text.f;
import g.C2447a;
import g.C2454h;
import g.C2456j;
import h.C2473a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import k.C2506a;
import q0.C2731a;

public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private g mAppCompatEmojiTextHelper;
    private c mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final n mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<SwitchCompat, Float> THUMB_POS = new a(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.mThumbPosition);
        }

        @Override
        public void set(SwitchCompat switchCompat, Float f7) {
            switchCompat.setThumbPosition(f7.floatValue());
        }
    }

    static class b {
        static void a(ObjectAnimator objectAnimator, boolean z7) {
            objectAnimator.setAutoCancel(z7);
        }
    }

    static class c extends f.e {

        private final Reference<SwitchCompat> f9225a;

        c(SwitchCompat switchCompat) {
            this.f9225a = new WeakReference(switchCompat);
        }

        @Override
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f9225a.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override
        public void b() {
            SwitchCompat switchCompat = this.f9225a.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private void animateThumbToCheckedState(boolean z7) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, THUMB_POS, z7 ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.mPositionAnimator, true);
        this.mPositionAnimator.start();
    }

    private void applyThumbTint() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable drawableMutate = C2731a.r(drawable).mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    C2731a.o(drawableMutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C2731a.p(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void applyTrackTint() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable drawableMutate = C2731a.r(drawable).mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    C2731a.o(drawableMutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C2731a.p(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void cancelPositionAnimator() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float constrain(float f7, float f8, float f9) {
        return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
    }

    private CharSequence doTransformForOnOffText(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.mSwitchTransformationMethod);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private g getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new g(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((ViewUtils.isLayoutRtl(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect opticalBounds = drawable2 != null ? DrawableUtils.getOpticalBounds(drawable2) : DrawableUtils.INSETS_NONE;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    private boolean hitThumb(float f7, float f8) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i7 = this.mSwitchTop;
        int i8 = this.mTouchSlop;
        int i9 = i7 - i8;
        int i10 = (this.mSwitchLeft + thumbOffset) - i8;
        int i11 = this.mThumbWidth + i10;
        Rect rect = this.mTempRect;
        return f7 > ((float) i10) && f7 < ((float) (((i11 + rect.left) + rect.right) + i8)) && f8 > ((float) i9) && f8 < ((float) (this.mSwitchBottom + i8));
    }

    private Layout makeLayout(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void setOffStateDescriptionOnRAndAbove() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOff;
            if (string == null) {
                string = getResources().getString(C2454h.f20701d);
            }
            Z.F0(this, string);
        }
    }

    private void setOnStateDescriptionOnRAndAbove() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOn;
            if (string == null) {
                string = getResources().getString(C2454h.f20702e);
            }
            Z.F0(this, string);
        }
    }

    private void setSwitchTypefaceByIndex(int i7, int i8) {
        setSwitchTypeface(i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i8);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = doTransformForOnOffText(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = doTransformForOnOffText(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.b() && androidx.emoji2.text.f.h()) {
            androidx.emoji2.text.f fVarB = androidx.emoji2.text.f.b();
            int iD = fVarB.d();
            if (iD == 3 || iD == 0) {
                c cVar = new c(this);
                this.mEmojiCompatInitCallback = cVar;
                fVarB.s(cVar);
            }
        }
    }

    private void stopDrag(MotionEvent motionEvent) throws Resources.NotFoundException {
        this.mTouchMode = 0;
        boolean targetCheckedState = true;
        boolean z7 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z7) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= this.mMinFlingVelocity) {
                targetCheckedState = getTargetCheckedState();
            } else if (!ViewUtils.isLayoutRtl(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        cancelSuperTouch(motionEvent);
    }

    @Override
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        Rect rect = this.mTempRect;
        int i9 = this.mSwitchLeft;
        int i10 = this.mSwitchTop;
        int i11 = this.mSwitchRight;
        int i12 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.mThumbDrawable;
        Rect opticalBounds = drawable != null ? DrawableUtils.getOpticalBounds(drawable) : DrawableUtils.INSETS_NONE;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (opticalBounds != null) {
                int i14 = opticalBounds.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = opticalBounds.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = opticalBounds.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = opticalBounds.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                }
                this.mTrackDrawable.setBounds(i9, i7, i11, i8);
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.mTrackDrawable.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                C2731a.l(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C2731a.k(drawable, f7, f8);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C2731a.k(drawable2, f7, f8);
        }
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.t(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    @Override
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.mSwitchTop;
        int i8 = this.mSwitchBottom;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i9 + i10) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int iMax;
        int width;
        int paddingLeft;
        int i11;
        int paddingTop;
        int height;
        super.onLayout(z7, i7, i8, i9, i10);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            iMax = Math.max(0, opticalBounds.left - rect.left);
            iMax2 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            iMax = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i11 = this.mSwitchHeight;
            paddingTop = paddingTop2 - (i11 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.mSwitchHeight;
                this.mSwitchLeft = paddingLeft;
                this.mSwitchTop = paddingTop;
                this.mSwitchBottom = height;
                this.mSwitchRight = width;
            }
            paddingTop = getPaddingTop();
            i11 = this.mSwitchHeight;
        }
        height = i11 + paddingTop;
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override
    public void onMeasure(int i7, int i8) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable3);
            iMax = Math.max(iMax, opticalBounds.left);
            iMax2 = Math.max(iMax2, opticalBounds.right);
        }
        int iMax3 = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax + iMax2) : this.mSwitchMinWidth;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax3;
        this.mSwitchHeight = iMax4;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override
    public void setChecked(boolean z7) throws Resources.NotFoundException {
        super.setChecked(z7);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            setOnStateDescriptionOnRAndAbove();
        } else {
            setOffStateDescriptionOnRAndAbove();
        }
        if (getWindowToken() != null && Z.R(this)) {
            animateThumbToCheckedState(zIsChecked);
        } else {
            cancelPositionAnimator();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.u(this, callback));
    }

    @Override
    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z7) {
        this.mEnforceSwitchWidth = z7;
        invalidate();
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z7) {
        if (this.mShowText != z7) {
            this.mShowText = z7;
            requestLayout();
            if (z7) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setSplitTrack(boolean z7) {
        this.mSplitTrack = z7;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.mSwitchMinWidth = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.mSwitchPadding = i7;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i7) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i7, C2456j.U2);
        ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(C2456j.Y2);
        if (colorStateList != null) {
            this.mTextColors = colorStateList;
        } else {
            this.mTextColors = getTextColors();
        }
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.V2, 0);
        if (dimensionPixelSize != 0) {
            float f7 = dimensionPixelSize;
            if (f7 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f7);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(tintTypedArrayObtainStyledAttributes.getInt(C2456j.W2, -1), tintTypedArrayObtainStyledAttributes.getInt(C2456j.X2, -1));
        if (tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.f20807d3, false)) {
            this.mSwitchTransformationMethod = new C2506a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i7) {
        if (i7 <= 0) {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i8 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i7;
            this.mTextPaint.setFakeBoldText((i8 & 1) != 0);
            this.mTextPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        setOffStateDescriptionOnRAndAbove();
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            setOnStateDescriptionOnRAndAbove();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f7) {
        this.mThumbPosition = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(C2473a.b(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.mThumbTextPadding = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(C2473a.b(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    @Override
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20535P);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i7) throws Resources.NotFoundException {
        super(context, attributeSet, i7);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C2456j.F2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.I2);
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.R2);
        this.mTrackDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(tintTypedArrayObtainStyledAttributes.getText(C2456j.G2));
        setTextOffInternal(tintTypedArrayObtainStyledAttributes.getText(C2456j.H2));
        this.mShowText = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.f20753J2, true);
        this.mThumbTextPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.O2, 0);
        this.mSwitchMinWidth = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.L2, 0);
        this.mSwitchPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.M2, 0);
        this.mSplitTrack = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.K2, false);
        ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(C2456j.P2);
        if (colorStateList != null) {
            this.mThumbTintList = colorStateList;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode tintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(C2456j.Q2, -1), null);
        if (this.mThumbTintMode != tintMode) {
            this.mThumbTintMode = tintMode;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        ColorStateList colorStateList2 = tintTypedArrayObtainStyledAttributes.getColorStateList(C2456j.S2);
        if (colorStateList2 != null) {
            this.mTrackTintList = colorStateList2;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode tintMode2 = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(C2456j.T2, -1), null);
        if (this.mTrackTintMode != tintMode2) {
            this.mTrackTintMode = tintMode2;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.N2, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        tintTypedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
