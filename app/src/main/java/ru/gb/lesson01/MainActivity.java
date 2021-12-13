package ru.gb.lesson01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnOpen = findViewById(R.id.btnopen);
    btnOpen.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnopen) {
            Intent intent = new Intent(this, activite_second.class);
            startActivity(intent);
        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}