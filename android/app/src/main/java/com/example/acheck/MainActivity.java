package com.example.acheck;

import android.os.Bundle;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // habilita inspeção no chrome://inspect
        WebView.setWebContentsDebuggingEnabled(true);
    }
}