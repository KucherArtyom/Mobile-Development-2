package ru.mirea.kucheras.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
    }

    public void onClick1(View view){
        String S = editTextTextPersonName.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №16 ГРУППА БСБО-01-20 Количество символов - "+editTextTextPersonName.length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}