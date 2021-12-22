package com.example.datatime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.mybtn1);
        txt1 = findViewById(R.id.mytxt1);
        txt2 = findViewById(R.id.mytxt2);

        btn1.setOnClickListener(v -> {
            // Текущее время
            Date currentDate = new Date();
            // Форматирование времени как "день.месяц.год"
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
            String dateText = dateFormat.format(currentDate);
            // Форматирование времени как "часы:минуты:секунды"
            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            String timeText = timeFormat.format(currentDate);

            txt1.setText(dateText);
            txt2.setText(timeText);
        });
    }
}