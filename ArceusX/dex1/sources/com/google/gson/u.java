package com.google.gson;

public abstract class u {

    public static final u f19221d;

    public static final u f19222e;

    private static final u[] f19223i;

    enum a extends u {
        a(String str, int i7) {
            super(str, i7, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f19221d = aVar;
        u uVar = new u("STRING", 1) {
            {
                a aVar2 = null;
            }
        };
        f19222e = uVar;
        f19223i = new u[]{aVar, uVar};
    }

    private u(String str, int i7) {
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f19223i.clone();
    }

    u(String str, int i7, a aVar) {
        this(str, i7);
    }
}
