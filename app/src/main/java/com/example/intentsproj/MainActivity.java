package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView no1 ,no2;
    EditText eNo1,eNo2;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNo1 = findViewById(R.id.no_1);
        eNo2 = findViewById(R.id.no_1);
        no1 = findViewById(R.id.textView);
        no2 = findViewById(R.id.textView2);
        ok = findViewById(R.id.button_ok);

        //create a Bundle object
        final Bundle extras = new Bundle();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putString("no_1",no1.getText().toString());
                extras.putString("no_2",no2.getText().toString());

                //create and initialize an intent
                Intent intent = new Intent(getApplicationContext(),SecondActivity2.class);

                //attach the bundle to the Intent object
                intent.putExtras(extras);

                Toast.makeText(MainActivity.this, "sending Message..", Toast.LENGTH_SHORT).show();

                //finally start the activity
                startActivity(intent);

            }
        });



    }
}