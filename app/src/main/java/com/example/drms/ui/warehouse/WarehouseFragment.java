package com.example.drms.ui.warehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.drms.R;
import com.example.drms.ware_stock;
import android.app.FragmentManager;

public class WarehouseFragment extends Fragment {

    private WarehouseViewModel warehouseViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        warehouseViewModel =
                ViewModelProviders.of(this).get(WarehouseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_warehouse, container, false);



        final TextView textView = root.findViewById(R.id.text_gallery);
        warehouseViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }





}