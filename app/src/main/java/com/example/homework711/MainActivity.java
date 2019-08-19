package com.example.homework711;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    EditText editExpression;

    TextView one;
    TextView two;
    TextView tree;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;
    TextView zero;
    TextView plus;
    TextView minus;
    TextView multiply; //умножение
    TextView divide; //деление
    TextView clear;
    TextView changeSign;
    TextView proc;

    Button  engineerViewButton;
    View    calcViewButtons;
    View    engeneerCalcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engineerViewButton = findViewById(R.id.engineerButton);
        calcViewButtons = findViewById(R.id.calc_buttons);
        engeneerCalcView = findViewById(R.id.engineerCalc);
        engineerViewButton.setOnClickListener(engineerViewListner);
    }


    private final View.OnClickListener engineerViewListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(calcViewButtons.getVisibility() == VISIBLE) {
                calcViewButtons.setVisibility(View.GONE);
                engeneerCalcView.setVisibility(VISIBLE);
            }
            else{
                calcViewButtons.setVisibility(VISIBLE);
                engeneerCalcView.setVisibility(View.GONE);
            }
        }
    };

}
