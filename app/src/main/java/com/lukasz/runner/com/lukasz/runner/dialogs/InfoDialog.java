package com.lukasz.runner.com.lukasz.runner.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lukasz.runner.R;

/**
 * Created by Lukasz on 2017-09-05.
 */

public class InfoDialog {


    public static void showDialog(Activity activity, String message){
        final Dialog dialog = new Dialog(activity);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_layout);
        TextView messageTextView = (TextView) dialog.findViewById(R.id.dialogTextView);
        messageTextView.setText(message);
        Button dismissButton = (Button) dialog.findViewById(R.id.dialogButton);
        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}