package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class o implements LayoutInflater.Factory2 {

    final FragmentManager f11214d;

    class a implements View.OnAttachStateChangeListener {

        final z f11215d;

        a(z zVar) {
            this.f11215d = zVar;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f11215d.k();
            this.f11215d.m();
            I.n((ViewGroup) fragmentK.mView.getParent(), o.this.f11214d).j();
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    o(FragmentManager fragmentManager) {
        this.f11214d = fragmentManager;
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        z zVarX;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f11214d);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M0.c.f2347a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(M0.c.f2348b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(M0.c.f2349c, -1);
        String string = typedArrayObtainStyledAttributes.getString(M0.c.f2350d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !l.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentJ0 = resourceId != -1 ? this.f11214d.j0(resourceId) : null;
        if (fragmentJ0 == null && string != null) {
            fragmentJ0 = this.f11214d.k0(string);
        }
        if (fragmentJ0 == null && id != -1) {
            fragmentJ0 = this.f11214d.j0(id);
        }
        if (fragmentJ0 == null) {
            fragmentJ0 = this.f11214d.u0().a(context.getClassLoader(), attributeValue);
            fragmentJ0.mFromLayout = true;
            fragmentJ0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentJ0.mContainerId = id;
            fragmentJ0.mTag = string;
            fragmentJ0.mInLayout = true;
            FragmentManager fragmentManager = this.f11214d;
            fragmentJ0.mFragmentManager = fragmentManager;
            fragmentJ0.mHost = fragmentManager.w0();
            fragmentJ0.onInflate(this.f11214d.w0().f(), attributeSet, fragmentJ0.mSavedFragmentState);
            zVarX = this.f11214d.j(fragmentJ0);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentJ0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentJ0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentJ0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f11214d;
            fragmentJ0.mFragmentManager = fragmentManager2;
            fragmentJ0.mHost = fragmentManager2.w0();
            fragmentJ0.onInflate(this.f11214d.w0().f(), attributeSet, fragmentJ0.mSavedFragmentState);
            zVarX = this.f11214d.x(fragmentJ0);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentJ0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        N0.c.g(fragmentJ0, viewGroup);
        fragmentJ0.mContainer = viewGroup;
        zVarX.m();
        zVarX.j();
        View view2 = fragmentJ0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentJ0.mView.getTag() == null) {
            fragmentJ0.mView.setTag(string);
        }
        fragmentJ0.mView.addOnAttachStateChangeListener(new a(zVarX));
        return fragmentJ0.mView;
    }
}
