package com.google.android.gms.internal.measurement;

final class C1927m5 extends IllegalArgumentException {
    C1927m5(int i7, int i8) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i7);
        sb.append(" of ");
        sb.append(i8);
        super(sb.toString());
    }
}
