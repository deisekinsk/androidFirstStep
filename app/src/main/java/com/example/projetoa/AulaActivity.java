package com.example.projetoa;

import android.app.Activity;
import android.os.Bundle;

import java.util.Calendar;

public class AulaActivity extends Activity {
    private int dateOfDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    //private final calendarA calendarA= new calendarA();


    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        //if (saveInstanceState != null) dateOfDay = saveInstanceState("dateOfDay");
        //calendarA.showDay(dateOfDay);
    }

    private void saveInstanceState(String dateOfDay) {
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("dateOfDay", dateOfDay);

    }
}
