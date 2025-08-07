package com.roblox.client;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC1663h;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;

public class Y extends e0 {

    private View f19878a0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            ActivityC1663h activity = Y.this.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().d1();
            }
        }
    }

    private Point n0(float f7, float f8, int i7, int i8, int i9, int i10) {
        if (f7 < i9 || f8 < i10) {
            return null;
        }
        int i11 = (int) (0.9f * f7);
        if (i11 > i9) {
            i9 = i11;
        }
        int i12 = (int) (0.8f * f8);
        if (i12 > i10) {
            i10 = i12;
        }
        if (i8 > f8) {
            i8 = i10;
        }
        if (i7 > f7) {
            i7 = i9;
        }
        return new Point(i7, i8);
    }

    @Override
    public void h0(boolean z7) {
        super.h0(z7);
        View view = this.f19878a0;
        if (view != null) {
            view.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override
    public void m0(E7.a aVar) {
        super.m0(aVar);
        h7.l.a("RobloxModalWebFragment", "updateWebView.");
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        h7.l.a("RobloxModalWebFragment", "onActivityCreated.");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        h7.l.a("RobloxModalWebFragment", "onAttach.");
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        h7.l.a("RobloxModalWebFragment", "onCreate.");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.f19878a0 = viewOnCreateView;
        ((LinearLayout) viewOnCreateView).setLayoutTransition(layoutTransition);
        LinearLayout linearLayout = (LinearLayout) viewOnCreateView.findViewById(J.f19535k0);
        linearLayout.setVisibility(0);
        linearLayout.findViewById(J.f19533j0).setOnClickListener(new a());
        float f7 = getResources().getDisplayMetrics().widthPixels;
        float f8 = getResources().getDisplayMetrics().heightPixels;
        h7.l.a("RobloxModalWebFragment", "widthInPixels: " + f7 + ". heightInPixels: " + f8 + ".");
        int iP3 = j6.d.a().p3() + linearLayout.getHeight();
        int iO = j6.d.a().O();
        int iApplyDimension = (int) TypedValue.applyDimension(1, (float) iP3, getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, (float) iO, getResources().getDisplayMetrics());
        h7.l.a("RobloxModalWebFragment", "minWidthInDip: " + iApplyDimension2 + ". minHeightInDip: " + iApplyDimension + ".");
        Point pointN0 = n0(f7, f8, iApplyDimension2, iApplyDimension, iO, iP3);
        if (pointN0 != null) {
            h7.l.a("RobloxModalWebFragment", "width: " + pointN0.x + ". height: " + pointN0.y + ".");
            viewOnCreateView.setLayoutParams(new FrameLayout.LayoutParams(pointN0.x, pointN0.y, 17));
        }
        h0(this.f19965U);
        return viewOnCreateView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        h7.l.a("RobloxModalWebFragment", "onDetach.");
    }

    @Override
    public void onPause() {
        super.onPause();
        h7.l.a("RobloxModalWebFragment", "onPause.");
    }

    @Override
    public void onResume() {
        super.onResume();
        h7.l.a(GObvYfBKohxpYX.hMaXvrvltpLWxv, "onResume.");
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
