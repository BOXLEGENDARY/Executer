package com.birbit.android.jobqueue;

import java.util.Collection;

public class CancelResult {

    private Collection<e> f13660a;

    private Collection<e> f13661b;

    public interface AsyncCancelCallback {
        void onCancelled(CancelResult cancelResult);
    }

    public CancelResult(Collection<e> collection, Collection<e> collection2) {
        this.f13660a = collection;
        this.f13661b = collection2;
    }
}
