package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.N2;
import com.google.android.gms.internal.play_billing.R2;

public class N2<MessageType extends R2<MessageType, BuilderType>, BuilderType extends N2<MessageType, BuilderType>> extends Z1<MessageType, BuilderType> {

    private final R2 f15907d;

    protected R2 f15908e;

    protected N2(MessageType messagetype) {
        this.f15907d = messagetype;
        if (messagetype.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f15908e = messagetype.r();
    }

    private static void g(Object obj, Object obj2) {
        C3.a().b(obj.getClass()).e(obj, obj2);
    }

    public final N2 clone() {
        N2 n22 = (N2) this.f15907d.m(5, null, null);
        n22.f15908e = f();
        return n22;
    }

    @Override
    public final boolean j() {
        return R2.B(this.f15908e, false);
    }

    public final N2 k(R2 r22) {
        if (!this.f15907d.equals(r22)) {
            if (!this.f15908e.i()) {
                p();
            }
            g(this.f15908e, r22);
        }
        return this;
    }

    public final MessageType l() {
        MessageType messagetype = (MessageType) f();
        if (R2.B(messagetype, true)) {
            return messagetype;
        }
        throw new R3(messagetype);
    }

    @Override
    public MessageType f() {
        if (!this.f15908e.i()) {
            return (MessageType) this.f15908e;
        }
        this.f15908e.x();
        return (MessageType) this.f15908e;
    }

    protected final void o() {
        if (this.f15908e.i()) {
            return;
        }
        p();
    }

    protected void p() {
        R2 r2R = this.f15907d.r();
        g(r2R, this.f15908e);
        this.f15908e = r2R;
    }
}
