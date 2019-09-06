package com.example.drms.ui.pos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.drms.R;

import org.w3c.dom.Text;

public class PosFragment extends Fragment{

    private PosViewModel posViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        posViewModel =
                ViewModelProviders.of(this).get(PosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pos, container, false);
        //Declaring Variables and adding action listener
        final TextView textView = root.findViewById(R.id.text_POS);
        final TextView display = root.findViewById(R.id.text_barcode);
        final ImageButton one = root.findViewById(R.id.btn_one);
        ImageButton two = root.findViewById(R.id.btn_two);
        ImageButton three = root.findViewById(R.id.btn_three);
        ImageButton four = root.findViewById(R.id.btn_four);
        ImageButton five = root.findViewById(R.id.btn_five);
        ImageButton six = root.findViewById(R.id.btn_six);
        ImageButton seven = root.findViewById(R.id.btn_seven);
        ImageButton eight = root.findViewById(R.id.btn_eight);
        ImageButton nine = root.findViewById(R.id.btn_nine);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("1");
                else
                    display.setText("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("2");
                else
                    display.setText("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("3");
                else
                    display.setText("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("4");
                else
                    display.setText("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("5");
                else
                    display.setText("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("6");
                else
                    display.setText("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("7");
                else
                    display.setText("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("8");
                else
                    display.setText("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().matches(""))
                    display.append("9");
                else
                    display.setText("9");
            }
        });

        posViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("Point Of Sale");
            }
        });
        return root;
    }

    //Manual Input Barcode
}