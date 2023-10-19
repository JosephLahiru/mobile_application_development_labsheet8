package me.mtron.mobile_application_development_labsheet8.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import me.mtron.mobile_application_development_labsheet8.R;

public class MainActivity extends AppCompatActivity {

    Button insert;
    Button update;
    Button delete;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        insert = (Button) findViewById(R.id.button1);
        update = (Button) findViewById(R.id.button2);
        delete = (Button) findViewById(R.id.button3);
        view = (Button) findViewById(R.id.button4);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddActivity.class));
            }
        });
    }
}