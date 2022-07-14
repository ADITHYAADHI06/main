package com.example.simplecalculator_004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9;
    Button buttonAdd, buttonSub, buttonDiv, buttonMul, buttonDot, buttonC,
            buttonEqual;
    TextView edittext;

    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);

        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonDot = (Button) findViewById(R.id.btndot);
        buttonAdd = (Button) findViewById(R.id.btnplus);
        buttonSub = (Button) findViewById(R.id.btnminus);
        buttonMul = (Button) findViewById(R.id.btnmultiply);
        buttonDiv = (Button) findViewById(R.id.btndivide);
        buttonC = (Button) findViewById(R.id.btnclear);
        buttonEqual = (Button) findViewById(R.id.btnequal);
        edittext = (TextView) findViewById(R.id.edittext);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext == null) {
                    edittext.setText("");
                } else {
                    mValueOne = Float.parseFloat(edittext.getText() + "");
                    mAddition = true;
                    edittext.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                mSubtract = true;
                edittext.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                mMultiplication = true;
                edittext.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                mDivision = true;

                edittext.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edittext.getText() + "");
                if (mAddition == true) {
                    edittext.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }
                if (mSubtract == true) {
                    edittext.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (mMultiplication == true) {
                    edittext.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true) {
                    edittext.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                edittext.setText(edittext.getText() + ".");
            }
        });
    }
}



