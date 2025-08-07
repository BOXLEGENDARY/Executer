package backtraceio.library.services;

import backtraceio.library.events.OnServerErrorEventListener;

public abstract class BacktraceHandlerInput {
    public OnServerErrorEventListener serverErrorEventListener;

    protected BacktraceHandlerInput(OnServerErrorEventListener onServerErrorEventListener) {
        this.serverErrorEventListener = onServerErrorEventListener;
    }
}
