package com.example.traditionkeeper.ui.donors.donors;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.traditionkeeper.R;

public class DonorsFragment extends Fragment {

    private DonorsViewModel donorsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        donorsViewModel =
                ViewModelProviders.of(this).get(DonorsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_donors, container, false);
        //final TextView textView = root.findViewById(R.id.text_donors);
        /*donorsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}