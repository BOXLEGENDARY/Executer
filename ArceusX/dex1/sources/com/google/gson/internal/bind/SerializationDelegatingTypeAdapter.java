package com.google.gson.internal.bind;

import com.google.gson.z;

public abstract class SerializationDelegatingTypeAdapter<T> extends z<T> {
    public abstract z<T> getSerializationDelegate();
}
