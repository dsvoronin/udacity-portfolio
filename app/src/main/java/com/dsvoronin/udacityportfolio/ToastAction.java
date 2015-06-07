package com.dsvoronin.udacityportfolio;

import android.content.Context;
import android.widget.Toast;

public class ToastAction implements Action {
    private final Context context;
    private final String message;

    public ToastAction(Context context, String message) {
        this.context = context;
        this.message = message;
    }

    @Override
    public void call() {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
