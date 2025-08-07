package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class a implements c {
    a() {
    }

    private d p(b bVar) {
        return (d) bVar.e();
    }

    @Override
    public void a(b bVar, Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        bVar.b(new d(colorStateList, f7));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f8);
        o(bVar, f9);
    }

    @Override
    public void b(b bVar, float f7) {
        p(bVar).h(f7);
    }

    @Override
    public float c(b bVar) {
        return bVar.f().getElevation();
    }

    @Override
    public float d(b bVar) {
        return p(bVar).d();
    }

    @Override
    public void e(b bVar) {
        o(bVar, g(bVar));
    }

    @Override
    public void f(b bVar, float f7) {
        bVar.f().setElevation(f7);
    }

    @Override
    public float g(b bVar) {
        return p(bVar).c();
    }

    @Override
    public ColorStateList h(b bVar) {
        return p(bVar).b();
    }

    @Override
    public void i(b bVar) {
        if (!bVar.d()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fG = g(bVar);
        float fD = d(bVar);
        int iCeil = (int) Math.ceil(e.a(fG, fD, bVar.c()));
        int iCeil2 = (int) Math.ceil(e.b(fG, fD, bVar.c()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override
    public void j() {
    }

    @Override
    public float k(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override
    public float l(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override
    public void m(b bVar) {
        o(bVar, g(bVar));
    }

    @Override
    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override
    public void o(b bVar, float f7) {
        p(bVar).g(f7, bVar.d(), bVar.c());
        i(bVar);
    }
}
