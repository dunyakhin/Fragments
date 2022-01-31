package com.example.fragments.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

public class EnterFragment extends Fragment implements View.OnClickListener {
Button ok;
EditText et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_enter, container, false);
        ok=view.findViewById(R.id.ok);
        et=view.findViewById(R.id.et);
      ok.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ok:
            Bundle result=new Bundle();
            result.putString("bundleKey",et.getText().toString());
            getParentFragmentManager().setFragmentResult("requestKey", result);
            FragmentManager fm = getActivity().getSupportFragmentManager();
            fm.popBackStack();
            Toast.makeText(view.getContext(), "works",Toast.LENGTH_SHORT).show();
            break;
        }

        }
    }
