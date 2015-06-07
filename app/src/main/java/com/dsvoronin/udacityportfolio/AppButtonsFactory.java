package com.dsvoronin.udacityportfolio;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

public class AppButtonsFactory {

    private final Context context;

    public AppButtonsFactory(Context context) {
        this.context = context;
    }

    public Button make(final App app) {
        AppCompatButton button = new AppCompatButton(context);
        button.setText(app.getTitle());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View v) {
                app.getAction().call();
            }
        });
        if (app.isImportant()) {
            button.setSupportBackgroundTintList(ColorStateList.valueOf(context.getResources().getColor(R.color.important)));
        }
        return button;
    }
}
