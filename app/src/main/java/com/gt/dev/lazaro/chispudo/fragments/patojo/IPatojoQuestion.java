package com.gt.dev.lazaro.chispudo.fragments.patojo;

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

public class IPatojoQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public int iPatojo;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.i_patojo_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_i_one_patojo);
        btn2 = (Button) v.findViewById(R.id.btn_i_two_patojo);
        btn3 = (Button) v.findViewById(R.id.btn_i_three_patojo);
        btn4 = (Button) v.findViewById(R.id.btn_i_four_patojo);

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
            case R.id.btn_i_one_patojo:
                iPatojo = 0;
                click++;
                break;
            case R.id.btn_i_two_patojo:
                iPatojo = 1;
                click++;
                break;
            case R.id.btn_i_three_patojo:
                iPatojo = 0;
                click++;
                break;
            case R.id.btn_i_four_patojo:
                iPatojo = 0;
                click++;
                break;
        }
    }
}
