package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    TextView no_1 ,no_2,result;
    EditText eNo1,eNo2;
    Button add,deduct,devide,muliply;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        eNo1 = findViewById(R.id.e_num_1);
        eNo2 = findViewById(R.id.e_num_2);
        no_1 = findViewById(R.id.number1);
        no_2 = findViewById(R.id.number2);
        result = findViewById(R.id.result_v);
//    ok = findViewById(R.id.button_ok);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        final String val1 = extras.getString("no_1");
        final String val2 = extras.getString("no_2");
        eNo1.setText(val1);
        eNo2.setText(val2);

        final int number1  = Integer.parseInt(eNo1.getText().toString());
        final int number2 = Integer.parseInt(eNo2.getText().toString());

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(number1+"+"+number2+"="+(add(number1,number2)));
            }
        });
        deduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(number1+"-"+number2+"="+(deduction(number1,number2)));
            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(number1+"/"+number2+"="+(multiply(number1,number2)));
            }
        });
        muliply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(number1+"*"+number2+"="+(divide(number1,number2)));
            }
        });




    }

    public static  int add(int n1 ,int n2){
        return n1 + n2 ;

    }
    public static  int deduction(int n1 ,int n2){
        return n1 - n2 ;

    }
    public static  int multiply(int n1 ,int n2){
        return n1 * n2 ;

    }
    public static  int divide(int n1 ,int n2){
        return n1 / n2 ;

    }
}