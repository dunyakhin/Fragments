package com.example.fragments.fragment;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.example.fragments.R;


public class BackgroundFragment extends Fragment {
Button contacts;
Intent contact=new Intent(Intent.ACTION_PICK,Uri.parse("content://contacts/people"));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View background=inflater.inflate(R.layout.fragment_background, container, false);
    contacts=background.findViewById(R.id.readContactsBut);
    contacts.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           int permissStatus= ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_CONTACTS);
          switch (permissStatus){
            case PackageManager.PERMISSION_GRANTED:
                    startActivity(contact);
                   break;
             case PackageManager.PERMISSION_DENIED:
                 ActivityCompat.requestPermissions(getActivity(), new String[] {Manifest.permission.READ_CONTACTS}, 1);
                break;
            }

        }

    });


        return background;
    }
    public void   onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        switch (requestCode){
            case 1:
                if(grantResults [0]==PackageManager.PERMISSION_GRANTED){
                    startActivity(contact);

                }
                break;
        }
    }
}