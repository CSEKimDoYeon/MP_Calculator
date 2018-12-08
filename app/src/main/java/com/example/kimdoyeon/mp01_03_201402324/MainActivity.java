package com.example.kimdoyeon.mp01_03_201402324;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv);
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                tv1.setText(tv1.getText().toString() + "0");
                break;
            case R.id.button_1:
                tv1.setText(tv1.getText().toString() + "1");
                break;
            case R.id.button_2:
                tv1.setText(tv1.getText().toString() + "2");
                break;
            case R.id.button_3:
                tv1.setText(tv1.getText().toString() + "3");
                break;
            case R.id.button_4:
                tv1.setText(tv1.getText().toString() + "4");
                break;
            case R.id.button_5:
                tv1.setText(tv1.getText().toString() + "5");
                break;
            case R.id.button_6:
                tv1.setText(tv1.getText().toString() + "6");
                break;
            case R.id.button_7:
                tv1.setText(tv1.getText().toString() + "7");
                break;
            case R.id.button_8:
                tv1.setText(tv1.getText().toString() + "8");
                break;
            case R.id.button_9:
                tv1.setText(tv1.getText().toString() + "9");
                break;
            case R.id.button_Dot:
                tv1.setText(tv1.getText().toString() + ".");
                break;
            case R.id.button_Devide:
                tv1.setText(tv1.getText().toString() + "/");
                break;
            case R.id.button_Times:
                tv1.setText(tv1.getText().toString() + "*");
                break;
            case R.id.button_Minus:
                tv1.setText(tv1.getText().toString() + "-");
                break;
            case R.id.button_Plus:
                tv1.setText(tv1.getText().toString() + "+");
                break;
            case R.id.button_Clear:
                tv1.setText("");
                break;
            case R.id.button_Calculate:
                tv1.setText(Calculator(tv1.getText().toString()));
                break;
        }
    }

    public String Calculator(String input) {
        Expression e = new ExpressionBuilder(input)
                .build();
        double result = e.evaluate();
        String result_toString = Double.toString(result);
        return result_toString;
    }
}
