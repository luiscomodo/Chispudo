package com.gt.dev.lazaro.chispudo.fragments.wiuro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.gt.dev.lazaro.chispudo.R;

/**
 * Created by Lazarus on 29/12/2016.
 */

public class HWiuroQuestion extends AbstractStep implements View.OnClickListener {

    public static int hWiuro;
    private Button btn1, btn2, btn3, btn4;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.h_wiuro_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_h_one_wiuro);
        btn2 = (Button) v.findViewById(R.id.btn_h_two_wiuro);
        btn3 = (Button) v.findViewById(R.id.btn_h_three_wiuro);
        btn4 = (Button) v.findViewById(R.id.btn_h_four_wiuro);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


        return v;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean nextIf() {
        return click > 0;
    }

    @Override
    public String error() {
        return getString(R.string.error_message_push_button);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_h_one_wiuro:
                hWiuro = 0;
                click++;
                break;
            case R.id.btn_h_two_wiuro:
                hWiuro = 1;
                click++;
                break;
            case R.id.btn_h_three_wiuro:
                hWiuro = 0;
                click++;
                break;
            case R.id.btn_h_four_wiuro:
                hWiuro = 0;
                click++;
                break;
        }
    }
}
