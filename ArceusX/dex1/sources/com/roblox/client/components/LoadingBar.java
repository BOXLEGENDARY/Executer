package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.roblox.client.J;
import com.roblox.client.K;
import java.util.ArrayList;

public class LoadingBar extends LinearLayout {

    private final ArrayList<ImageView> f19919d;

    private boolean f19920e;

    private class a implements Animation.AnimationListener {

        ImageView f19921a;

        b f19922b;

        void a(ImageView imageView) {
            this.f19921a = imageView;
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            this.f19921a.startAnimation(LoadingBar.this.d(this.f19922b));
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

        private a() {
        }
    }

    private class b implements Animation.AnimationListener {

        private ImageView f19924a;

        a f19925b;

        void a(ImageView imageView) {
            this.f19924a = imageView;
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            this.f19924a.startAnimation(LoadingBar.this.c(this.f19925b));
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

        private b() {
        }
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19919d = new ArrayList<>(3);
        e();
    }

    public AlphaAnimation c(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    public AlphaAnimation d(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    private void e() {
        View.inflate(getContext(), K.f19572r, this);
        this.f19919d.add((ImageView) findViewById(J.f19545t));
        this.f19919d.add((ImageView) findViewById(J.f19546u));
        this.f19919d.add((ImageView) findViewById(J.f19547v));
    }

    private void f() {
        int size = this.f19919d.size();
        for (int i7 = 0; i7 < size; i7++) {
            ImageView imageView = this.f19919d.get(i7);
            b bVar = new b();
            a aVar = new a();
            aVar.a(imageView);
            aVar.f19922b = bVar;
            bVar.f19925b = aVar;
            bVar.a(imageView);
            AlphaAnimation alphaAnimationD = d(bVar);
            alphaAnimationD.setStartOffset(i7 * 400);
            imageView.startAnimation(alphaAnimationD);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0 || this.f19920e) {
            return;
        }
        this.f19920e = true;
        f();
    }
}
