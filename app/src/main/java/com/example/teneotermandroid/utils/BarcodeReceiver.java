package com.example.teneotermandroid.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BarcodeReceiver extends BroadcastReceiver {
    public interface BarcodeListener{
        void onBarcodeScanned(String data);
    }
    private final BarcodeListener listener;

    public BarcodeReceiver(BarcodeListener listener) {
        this.listener = listener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.action.SCANNER_DATA".equals(action)) {
            String barcodeData = intent.getStringExtra("barcode_string");
            if (listener != null) {
                listener.onBarcodeScanned(barcodeData); // Notify activity
            }
        }
    }
}
