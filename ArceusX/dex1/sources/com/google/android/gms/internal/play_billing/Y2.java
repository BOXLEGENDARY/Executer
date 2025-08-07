package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public class Y2 extends IOException {
    public Y2(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public Y2(String str) {
        super(str);
    }
}
