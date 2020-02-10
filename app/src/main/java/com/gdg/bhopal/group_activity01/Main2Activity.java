package com.gdg.bhopal.group_activity01;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
            TextView Cname,email,phone,web,cont,add,oph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Cname =(TextView)findViewById(R.id.TxtCname);
        email=(TextView)findViewById(R.id.Txtemail);
        phone=(TextView)findViewById(R.id.Txtphne);
        web =(TextView)findViewById(R.id.Txtweb);
        cont=(TextView)findViewById(R.id.Txtcont);
        add = (TextView)findViewById(R.id.Txtadd);
        oph = (TextView)findViewById(R.id.Txtoph);
        String cname =getIntent().getStringExtra("Cname");
        String eml =getIntent().getStringExtra("email");
        String phn =getIntent().getStringExtra("phone");
        String wbs =getIntent().getStringExtra("website");
        String ad = getIntent().getStringExtra("add");
        String cnt = getIntent().getStringExtra("des");
        String op =getIntent().getStringExtra("oph");


        Cname.setText(cname);
        email.setText(eml);
        phone.setText(phn);
        web.setText(wbs);
        add.setText(ad);
        oph.setText(op);
        cont.setText(cnt);
    }

}
