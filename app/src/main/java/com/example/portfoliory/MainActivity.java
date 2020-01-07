package com.example.portfoliory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void change_Fragment(View view){
        Fragment fragment;

        if(view == findViewById(R.id.home)){
            fragment = new Home_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft  = fm.beginTransaction();
            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.clock)){
            fragment = new Watch_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft  = fm.beginTransaction();
            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.clip)){
            fragment = new Clip_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft  = fm.beginTransaction();
            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.phone)){
            fragment = new Phone_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft  = fm.beginTransaction();
            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.group)){
            fragment = new Group_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft  = fm.beginTransaction();
            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }
    }
}
