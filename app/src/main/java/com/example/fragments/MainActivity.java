package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.fragment.BackgroundFragment;
import com.example.fragments.fragment.EnterFragment;
import com.example.fragments.fragment.ResultFragment;
import com.example.fragments.fragment.WebFragment;

public class MainActivity extends AppCompatActivity {
Button backgrnd, web, result, start,ok;
Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgrnd=findViewById(R.id.backgroundbut);
        web=findViewById(R.id.web);
        result=findViewById(R.id.result);
        ok=findViewById(R.id.ok);
    }
   public void change (View view){
       FragmentManager fm=getSupportFragmentManager();
       FragmentTransaction ft=fm.beginTransaction();

        switch(view.getId()){
            case R.id.web:
                fragment=new WebFragment();
                ft.add(R.id.background,fragment);
                ft.addToBackStack(null);
                break;
            case R.id.backgroundbut:
                fragment=new BackgroundFragment();
                ft.add(R.id.background, fragment);
                ft.addToBackStack(null);
                break;
            case R.id.result:
                fragment=new ResultFragment();
                ft.add(R.id.background,fragment);
                ft.addToBackStack(null);
                break;
          case R.id.start:
            fragment=new EnterFragment();
           ft.add(R.id.background, fragment);
           ft.addToBackStack(null);
             break;




        }
       ft.commit();

    }






}