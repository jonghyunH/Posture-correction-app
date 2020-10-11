package com.example.posture_correction_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CameraUpload extends AppCompatActivity {

    Button click;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_upload);
        click=(Button)findViewById(R.id.camera_upload);
        click.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
}
