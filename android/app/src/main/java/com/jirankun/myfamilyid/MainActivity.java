package com.jirankun.myfamilyid;

import android.os.Bundle;
import android.view.WindowManager;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        blockScreenshot();
    }

    @Override
    public void onResume() {
        super.onResume();
        blockScreenshot();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void blockScreenshot() {
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        );
    }
}
