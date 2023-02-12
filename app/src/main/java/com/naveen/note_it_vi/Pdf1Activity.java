package com.naveen.note_it_vi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf1Activity extends AppCompatActivity {

    PDFView pdfView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf1);

        pdfView1 = findViewById(R.id.pdfView1);

        pdfView1.fromAsset("python.pdf").load();
    }
}