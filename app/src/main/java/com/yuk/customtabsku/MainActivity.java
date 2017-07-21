package com.yuk.customtabsku;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

  //  WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // webView = (WebView) findViewById(R.id.webViewKu);
      /*  if (webView != null) {
            webView.setWebViewClient(new MyBrowser());
            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setJavaScriptEnabled(false);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webView.loadUrl("http://sbgs.in/9l0b");
        }*/
    }

    public void goClick(View view) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
       // builder.setToolbarColor(ContextCompat.getColor(getApplicationContext(), R.color.tranparent));
        /*
        builder.addDefaultShareMenuItem();
        builder.setSecondaryToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        Bitmap iconClose = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher);

        builder.setCloseButtonIcon(iconClose);
        builder.setShowTitle(true);*/

        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse("http://sbgs.in/9l0b"));
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
          //  webView.setVisibility(View.VISIBLE);
        }
    }
}
