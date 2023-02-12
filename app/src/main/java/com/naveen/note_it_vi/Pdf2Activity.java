package com.naveen.note_it_vi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf2Activity extends AppCompatActivity {
    PDFView pdfView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf2);

        pdfView2 = findViewById(R.id.pdfView2);
        pdfView2.fromAsset("android.pdf").load();
    }
}