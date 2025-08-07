package com.google.gson;

import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

public class e {

    public static final e f19156d = new e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false);

    public static final e f19157e = new e("\n", "  ", true);

    private final String f19158a;

    private final String f19159b;

    private final boolean f19160c;

    private e(String str, String str2, boolean z7) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f19158a = str;
        this.f19159b = str2;
        this.f19160c = z7;
    }

    public String a() {
        return this.f19159b;
    }

    public String b() {
        return this.f19158a;
    }

    public boolean c() {
        return this.f19160c;
    }

    public e d(String str) {
        return new e(this.f19158a, str, this.f19160c);
    }
}
