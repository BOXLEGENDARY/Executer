package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class C1854d4 extends IOException {
    public C1854d4(String str) {
        super(str);
    }

    static C1846c4 a() {
        return new C1846c4("Protocol message tag had invalid wire type.");
    }

    static C1854d4 b() {
        return new C1854d4("Protocol message contained an invalid tag (zero).");
    }

    static C1854d4 c() {
        return new C1854d4("Protocol message had invalid UTF-8.");
    }

    static C1854d4 d() {
        return new C1854d4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1854d4 e() {
        return new C1854d4("Failed to parse the message.");
    }

    static C1854d4 f() {
        return new C1854d4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
