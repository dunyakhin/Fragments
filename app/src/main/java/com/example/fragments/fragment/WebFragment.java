package com.example.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.fragments.R;


public class WebFragment extends Fragment {
    WebView wv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_web, container, false);
        wv=view.findViewById(R.id.wv);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.com/search?q=%D0%B1%D0%B8%D0%B1%D0%B0+%D0%B8+%D0%B1%D0%BE%D0%B1%D0%B0&sxsrf=AOaemvJSDh1JmlbEfLvBOzjCAEEXn8WUYg:1642346848628&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiXmYrkyrb1AhUrmIsKHVAHDakQ_AUoAXoECAIQAw&biw=1366&bih=657&dpr=1");
        return view;
    }
}