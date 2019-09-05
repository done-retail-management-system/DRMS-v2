package com.example.drms.ui.shelf;

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

import com.example.drms.R;

public class ShelfFragment extends Fragment {

    private ShelfViewModel shelfViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shelfViewModel =
                ViewModelProviders.of(this).get(ShelfViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shelf, container, false);

        final TextView textView = root.findViewById(R.id.text_share);
        shelfViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}