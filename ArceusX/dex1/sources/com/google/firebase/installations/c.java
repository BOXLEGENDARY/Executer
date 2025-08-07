package com.google.firebase.installations;

import Q4.h;

public class c extends h {

    private final a f19112d;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public c(a aVar) {
        this.f19112d = aVar;
    }

    public c(String str, a aVar) {
        super(str);
        this.f19112d = aVar;
    }
}
