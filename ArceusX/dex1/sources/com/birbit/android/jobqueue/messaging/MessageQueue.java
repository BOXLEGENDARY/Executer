package com.birbit.android.jobqueue.messaging;

import k2.b;
import k2.d;

public interface MessageQueue {
    void cancelMessages(MessagePredicate messagePredicate);

    void clear();

    void consume(d dVar);

    void post(b bVar);

    void postAt(b bVar, long j7);

    void stop();
}
