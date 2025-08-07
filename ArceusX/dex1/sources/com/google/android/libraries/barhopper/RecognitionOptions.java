package com.google.android.libraries.barhopper;

public class RecognitionOptions {
    private int barcodeFormats = 0;
    private boolean outputUnrecognizedBarcodes = false;
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    public void a(int i7) {
        this.barcodeFormats = i7;
    }
}
