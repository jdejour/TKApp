package com.example.traditionkeeper.ui.prizes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.traditionkeeper.R;

public class PrizesFragment extends Fragment {

    private PrizesViewModel prizesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        prizesViewModel =
                ViewModelProviders.of(this).get(PrizesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_prizes, container, false);
        /*final TextView textView = root.findViewById(R.id.text_prizes_title);
        prizesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}