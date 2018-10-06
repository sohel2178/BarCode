package com.linearbd.barcode.ui.scanner.scanner;

import com.google.android.gms.vision.barcode.Barcode;

public interface BarcodeListener {

    void onReceiveBarCode(Barcode barcode);
}
