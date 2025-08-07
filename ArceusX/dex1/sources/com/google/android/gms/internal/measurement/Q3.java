package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Q3;
import com.google.android.gms.internal.measurement.T3;
import java.io.IOException;

public class Q3<MessageType extends T3<MessageType, BuilderType>, BuilderType extends Q3<MessageType, BuilderType>> extends AbstractC1845c3<MessageType, BuilderType> {

    private final MessageType f15007d;

    protected MessageType f15008e;

    protected boolean f15009i = false;

    protected Q3(MessageType messagetype) {
        this.f15007d = messagetype;
        this.f15008e = (MessageType) messagetype.v(4, null, null);
    }

    private static final void k(MessageType messagetype, MessageType messagetype2) {
        G4.a().b(messagetype.getClass()).e(messagetype, messagetype2);
    }

    @Override
    public final InterfaceC2021y4 e() {
        return this.f15007d;
    }

    @Override
    protected final AbstractC1845c3 h(AbstractC1853d3 abstractC1853d3) {
        q((T3) abstractC1853d3);
        return this;
    }

    @Override
    public final AbstractC1845c3 i(byte[] bArr, int i7, int i8) throws C1854d4 {
        r(bArr, 0, i8, G3.a());
        return this;
    }

    @Override
    public final AbstractC1845c3 j(byte[] bArr, int i7, int i8, G3 g32) throws C1854d4 {
        r(bArr, 0, i8, g32);
        return this;
    }

    public final MessageType l() {
        MessageType messagetype = (MessageType) A();
        boolean z7 = true;
        byte bByteValue = ((Byte) messagetype.v(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z7 = false;
            } else {
                boolean zF = G4.a().b(messagetype.getClass()).f(messagetype);
                messagetype.v(2, true != zF ? null : messagetype, null);
                z7 = zF;
            }
        }
        if (z7) {
            return messagetype;
        }
        throw new X4(messagetype);
    }

    @Override
    public MessageType A() {
        if (this.f15009i) {
            return this.f15008e;
        }
        MessageType messagetype = this.f15008e;
        G4.a().b(messagetype.getClass()).d(messagetype);
        this.f15009i = true;
        return this.f15008e;
    }

    protected void o() {
        MessageType messagetype = (MessageType) this.f15008e.v(4, null, null);
        k(messagetype, this.f15008e);
        this.f15008e = messagetype;
    }

    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f15007d.v(5, null, null);
        buildertype.q(A());
        return buildertype;
    }

    public final BuilderType q(MessageType messagetype) {
        if (this.f15009i) {
            o();
            this.f15009i = false;
        }
        k(this.f15008e, messagetype);
        return this;
    }

    public final BuilderType r(byte[] bArr, int i7, int i8, G3 g32) throws C1854d4 {
        if (this.f15009i) {
            o();
            this.f15009i = false;
        }
        try {
            G4.a().b(this.f15008e.getClass()).g(this.f15008e, bArr, 0, i8, new C1877g3(g32));
            return this;
        } catch (C1854d4 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw C1854d4.f();
        }
    }
}
