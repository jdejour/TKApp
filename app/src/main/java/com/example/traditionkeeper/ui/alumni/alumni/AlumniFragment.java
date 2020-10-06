package com.example.traditionkeeper.ui.alumni.alumni;

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

public class AlumniFragment extends Fragment {

    private AlumniViewModel alumniViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alumniViewModel =
                ViewModelProviders.of(this).get(AlumniViewModel.class);
        View root = inflater.inflate(R.layout.fragment_alumni, container, false);
        //final TextView textView = root.findViewById(R.id.text_alumni_title);
        /*alumniViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}