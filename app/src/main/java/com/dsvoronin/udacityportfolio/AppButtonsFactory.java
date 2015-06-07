package com.dsvoronin.udacityportfolio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

public class AppButtonsFactory {

    private final Context context;

    public AppButtonsFactory(Context context) {
        this.context = context;
    }

    public Button make(final App app) {
        Button button = new Button(context);
        button.setText(app.getTitle());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View v) {
                app.getAction().call();
            }
        });
        return button;
    }
}
