package com.developeramit.awesomealertdailog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.developeramit.awesomealertdailoglib.AwesomeDialog;
import com.developeramit.awesomealertdailoglib.AwesomeDialogBuilder;
import com.developeramit.awesomealertdailoglib.mDialogClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new AwesomeDialogBuilder(MainActivity.this)
                .setTitle("Hello, This is title ")
                .setSubtitle("this is sub title")
                .setBoldPositiveLabel(true)
                .setCancelable(false)
                .setPositiveListener("Yes",new mDialogClickListener() {
                    @Override
                    public void onClick(AwesomeDialog dialog) {
                        Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
                        dialog.dismiss();

                    }
                })
                .setNegativeListener("No", new mDialogClickListener() {
                    @Override
                    public void onClick(AwesomeDialog dialog) {
                        dialog.dismiss();
                    }
                })
                .build().show();

    }
}
