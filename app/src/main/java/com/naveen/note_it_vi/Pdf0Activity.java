package com.naveen.note_it_vi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf0Activity extends AppCompatActivity {

    PDFView pdfView0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf0);


        pdfView0 = findViewById(R.id.pdfView0);

        pdfView0.fromAsset("syllabus.pdf").load();
    }
}