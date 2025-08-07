package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

public final class b {

    private final Field f19147a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f19147a = field;
    }

    public String toString() {
        return this.f19147a.toString();
    }
}
