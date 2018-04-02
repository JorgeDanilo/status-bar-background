package br.com;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.view.WindowManager.LayoutParams;



public class StatusBarBackgroundColor extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        if(VERSION.SDK_INT >= VERSION_CODES.KITKAT) {
            cordova.getActivity().getWindow().addFlags(LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

    }

}
