package com.example.traditionkeeper.ui.buildings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.traditionkeeper.R;

public class BuildingsFragment extends Fragment {

    private BuildingsViewModel buildingsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        buildingsViewModel =
                ViewModelProviders.of(this).get(BuildingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buildings, container, false);
        //final TextView textView = root.findViewById(R.id.text_buildings);
        /*buildingsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}