package com.example.posture_correction_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExpertVideo extends AppCompatActivity {

    private Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expert_video);
        click=(Button)findViewById(R.id.expert_check);
        click.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ExpertVideo.this);
                builder.setTitle("교정 확인");
                builder.setMessage("교정을 원하십니까?");
                builder.setPositiveButton("예",null);
                builder.setNegativeButton("아니요",null);
                builder.create().show();
            }
        });
    }

}