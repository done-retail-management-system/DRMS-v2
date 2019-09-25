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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.drms.R;

public class WarehouseFragment extends Fragment {

    private WarehouseViewModel warehouseViewModel;
    Button btn;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        warehouseViewModel =  ViewModelProviders.of(this).get(WarehouseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_warehouse, container, false);
        /*final TextView textView = root.findViewById(R.id.text_gallery);*/
        /*warehouseViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        btn = root.findViewById(R.id.btn_stock);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(getActivity(),activity_stock.class));
                startActivity(new Intent(getActivity(), activity_stock.class));
            }
        });
        return root;
    }
}