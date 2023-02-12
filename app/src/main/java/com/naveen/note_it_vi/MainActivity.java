package com.naveen.note_it_vi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pdf1, pdf2, pdf0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdf1=findViewById(R.id.python_pdf);
        pdf2=findViewById(R.id.android_pdf);
        pdf0=findViewById(R.id.syllabus_pdf);

        pdf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Pdf1Activity.class);
                startActivity(intent);
            }
        });
        pdf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,Pdf2Activity.class);
                startActivity(intent2);
            }
        });
        pdf0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity.this,Pdf0Activity.class);
                startActivity(intent3);
            }
        });
    }
}