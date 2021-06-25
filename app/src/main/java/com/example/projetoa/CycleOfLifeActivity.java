package com.example.projetoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;



public class CycleOfLifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("CycleOfLifeActivity","A.onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicle_of_life);
    }

    @Override
    protected void onStart(){
        Log.d("CycleOfLifeActivity","A.onStart");
        super.onStart();

    }
    @Override
    protected void onRestart(){
        Log.d("CycleOfLifeActivity","A.onRestart");
        super.onRestart();

    }
    @Override
    protected void onResume(){
        Log.d("CycleOfLifeActivity","A.onResume");
        super.onResume();

    }
    @Override
    protected void onPause(){
        Log.d("CycleOfLifeActivity","A.onPause");
        super.onPause();

    }

    @Override
    protected void onStop(){
        Log.d("CycleOfLifeActivity","A.onStop");
        super.onStop();

    }

    @Override
    protected void onDestroy(){
        Log.d("CycleOfLifeActivity","A.onDestroy");
        super.onDestroy();

    }
}