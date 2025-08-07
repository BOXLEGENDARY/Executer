package com.google.firebase.installations;

import a4.C1574k;

class d implements e {

    final C1574k<String> f19117a;

    public d(C1574k<String> c1574k) {
        this.f19117a = c1574k;
    }

    @Override
    public boolean a(f5.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f19117a.e(dVar.d());
        return true;
    }

    @Override
    public boolean b(Exception exc) {
        return false;
    }
}
