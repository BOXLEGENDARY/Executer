package com.google.androidgamesdk.gametextinput;

public final class State {
    public int composingRegionEnd;
    public int composingRegionStart;
    public int selectionEnd;
    public int selectionStart;
    public String text;

    public State(String str, int i7, int i8, int i9, int i10) {
        this.text = str;
        this.selectionStart = i7;
        this.selectionEnd = i8;
        this.composingRegionStart = i9;
        this.composingRegionEnd = i10;
    }
}
