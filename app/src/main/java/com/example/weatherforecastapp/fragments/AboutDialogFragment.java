package com.example.weatherforecastapp.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.weatherforecastapp.R;

public class AboutDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getContext();
        AlertDialog alertDialog = new AlertDialog.Builder(context)
                .setTitle(getText(R.string.app_name))
                .setMessage(TextUtils.concat("Demo app for the weather report", "\n",
                               "to check the UI layput implementations"))
                .setPositiveButton(R.string.dialog_ok, null)
                .create();
        alertDialog.show();
        TextView message = alertDialog.findViewById(android.R.id.message);
        if (message != null) {
            message.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return alertDialog;
    }
}
