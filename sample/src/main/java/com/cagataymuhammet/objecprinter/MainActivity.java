package com.cagataymuhammet.objecprinter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cagataymuhammet.objectprinter.ObjectPrinter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ObjectPrinter.printJson(new Object());

    }

}
