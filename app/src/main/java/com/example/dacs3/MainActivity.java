package com.example.dacs3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;

import com.example.dacs3.adapters.truyentranhadapter;
import com.example.dacs3.object.truyentranh;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    GridView truyenmcn;
    truyentranhadapter adapter;
    ArrayList<truyentranh> truyenarr;
    @Override
    protected void onCreate (Bundle savedInstanceStave) {
        super.onCreate(savedInstanceStave);
        setContentView(R.layout.activity_main);
        init();
        anhxa();
        setClick();
        setUp();
    }

    public void init(){
        truyenarr = new ArrayList<>();
        truyenarr.add(new truyentranh("","",""));

        adapter= new truyentranhadapter(this, 0, truyenarr);
    }
    public void anhxa(){
        truyenmcn= findViewById(R.id.truyenmcn);
    }
    public void setUp(){
        truyenmcn.setAdapter(adapter);
    }
    public void setClick(){}
}
