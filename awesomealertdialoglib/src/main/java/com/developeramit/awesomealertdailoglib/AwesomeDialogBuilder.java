package com.developeramit.awesomealertdailoglib;

import android.content.Context;
import android.graphics.Typeface;

//TODO: Created by Amit Shara

public class AwesomeDialogBuilder {
    private Typeface tf;
    private boolean bold,cancelable;
    private String title, subtitle, okLabel, koLabel;
    private Context context;
    private mDialogClickListener positiveListener;
    private mDialogClickListener negativeListener;

    public AwesomeDialogBuilder(Context context) {
        this.context = context;
    }

    public AwesomeDialogBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public AwesomeDialogBuilder setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public AwesomeDialogBuilder setBoldPositiveLabel(boolean bold) {
        this.bold = bold;
        return this;
    }

    public AwesomeDialogBuilder setFont(Typeface font) {
        this.tf=font;
        return this;
    }
    public AwesomeDialogBuilder setCancelable(boolean cancelable){
        this.cancelable=cancelable;
        return this;
    }

    public AwesomeDialogBuilder setNegativeListener(String koLabel, mDialogClickListener listener) {
        this.negativeListener=listener;
        this.koLabel=koLabel;
        return this;
    }

    public AwesomeDialogBuilder setPositiveListener(String okLabel, mDialogClickListener listener) {
        this.positiveListener = listener;
        this.okLabel=okLabel;
        return this;
    }

    public AwesomeDialog build(){
        AwesomeDialog dialog = new AwesomeDialog(context,title,subtitle, bold, tf,cancelable);
        dialog.setNegative(koLabel,negativeListener);
        dialog.setPositive(okLabel,positiveListener);
        return dialog;
    }

}
