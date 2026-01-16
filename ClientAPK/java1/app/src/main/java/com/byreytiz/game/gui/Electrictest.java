package com.byreytiz.game.gui;

import android.app.Activity;

import com.byreytiz.game.R;
import com.byreytiz.game.gui.util.Utils;
import com.nvidia.devtech.NvEventQueueActivity;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.*;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Electrictest {
    public Activity activity;
    public ConstraintLayout reytiz_layout;

    public TextView electric_button, electric_buttonexit;

    public int electric11 = 11;

    public Electrictest(Activity aactivity) {
        activity = aactivity;
        reytiz_layout = activity.findViewById(R.id.electricwork);
        electric_buttonexit = activity.findViewById(R.id.electric_buttonexit);
        electric_button = activity.findViewById(R.id.electric_button);
        setListeners(aactivity);
        close();
    }

    public void setListeners(Activity aactivity) {
        activity = aactivity;
        electric_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(aactivity, R.anim.button_click));
                NvEventQueueActivity.getInstance().sendElectricClick(electric11,0);
            }
        });
        electric_buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                close();
            }
        });

    }

    public void show(int electric) {

        Utils.ShowLayout(reytiz_layout, true);
    }

    public void close() {
        Utils.HideLayout(reytiz_layout, false);
    }
}
