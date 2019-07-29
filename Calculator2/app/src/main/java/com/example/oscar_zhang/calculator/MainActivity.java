package com.example.oscar_zhang.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.oscar_zhang.calculator.R;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btn10;
    private Button btnC;
    private Button btnPlus;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btndot;
    private Button btnAbout;
    private Button btnEqu;
    private TextView bar;
    private String Result ="null";
    private boolean flag = false;
    private boolean contiOper = false;
    private boolean number1exists = false;

    private boolean number1e = false;
    private boolean Opere = false;
    private boolean number2e = false;
    private char lastOperate = '+';
    private double lastNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            Result = savedInstanceState.getString("x");
            Opere = savedInstanceState.getBoolean("Opere");
            number1e = savedInstanceState.getBoolean("number1e");
            lastNum = savedInstanceState.getDouble("lastNum");
            lastOperate = savedInstanceState.getChar("lastOperate");
            flag = savedInstanceState.getBoolean("flag");
        }
        findView();
    }

    private Button.OnClickListener bltisener = new Button.OnClickListener() {
        @Override
        public void onClick(View V) {
            switch (V.getId()) {
                case R.id.button10:
                    if(bar.getText().toString().length()==1) {
                        bar.setText("0");
                    } else {
                        bar.setText(bar.getText().toString().substring(0, bar.getText().toString().length() - 1));
                    }
                    break;
                case R.id.buttonC:
                    bar.setText("0");
                    lastNum = 0;
                    flag = false;
                    contiOper =false;

                    break;
                case R.id.buttonPlus:
                    if(number1e && Opere) {
                        double result = 0;
                        number1e = false;
                        switch (lastOperate) {
                            case '+':
                                result = lastNum + Double.parseDouble(bar.getText().toString());
                                break;
                            case '-':
                                result = lastNum - Double.parseDouble(bar.getText().toString());
                                break;
                            case '*':
                                result = lastNum * Double.parseDouble(bar.getText().toString());
                                break;
                            case '/':
                                result = lastNum / Double.parseDouble(bar.getText().toString());
                                break;
                            default:
                                break;
                        }
                        lastNum = result;
                        bar.setText(String.valueOf(result));
                        lastOperate = '+';
                    } else {
                        lastNum = Double.parseDouble(bar.getText().toString());
                        bar.setText("0");
                        lastOperate = '+';
                        Opere = true;
                        number1e = true;
                    }

                    flag = true;
                    break;
                case R.id.buttonSubtract:
                    if(number1e && Opere) {
                        double result = 0;
                        number1e = false;
                        switch (lastOperate) {
                            case '+':
                                result = lastNum + Double.parseDouble(bar.getText().toString());
                                break;
                            case '-':
                                result = lastNum - Double.parseDouble(bar.getText().toString());
                                break;
                            case '*':
                                result = lastNum * Double.parseDouble(bar.getText().toString());
                                break;
                            case '/':
                                result = lastNum / Double.parseDouble(bar.getText().toString());
                                break;
                            default:
                                break;
                        }
                        lastNum = result;
                        bar.setText(String.valueOf(result));
                        lastOperate = '-';
                    } else {
                        lastNum = Double.parseDouble(bar.getText().toString());
                        bar.setText("0");
                        lastOperate = '-';
                        Opere = true;
                        number1e = true;
                    }
                    flag = true;
                    break;
                case R.id.buttonMul:
                    if(number1e && Opere) {
                        double result = 0;
                        number1e = false;
                        switch (lastOperate) {
                            case '+':
                                result = lastNum + Double.parseDouble(bar.getText().toString());
                                break;
                            case '-':
                                result = lastNum - Double.parseDouble(bar.getText().toString());
                                break;
                            case '*':
                                result = lastNum * Double.parseDouble(bar.getText().toString());
                                break;
                            case '/':
                                result = lastNum / Double.parseDouble(bar.getText().toString());
                                break;
                            default:
                                break;
                        }
                        lastNum = result;
                        bar.setText(String.valueOf(result));
                        lastOperate = '*';
                    } else {
                        lastNum = Double.parseDouble(bar.getText().toString());
                        bar.setText("0");
                        lastOperate = '*';
                        Opere = true;
                        number1e = true;
                    }
                    flag = true;
                    break;
                case R.id.buttonDiv:
                    if(number1e && Opere) {
                        double result = 0;
                        number1e = false;
                        switch (lastOperate) {
                            case '+':
                                result = lastNum + Double.parseDouble(bar.getText().toString());
                                break;
                            case '-':
                                result = lastNum - Double.parseDouble(bar.getText().toString());
                                break;
                            case '*':
                                result = lastNum * Double.parseDouble(bar.getText().toString());
                                break;
                            case '/':
                                result = lastNum / Double.parseDouble(bar.getText().toString());
                                break;
                            default:
                                break;
                        }
                        lastNum = result;
                        bar.setText(String.valueOf(result));
                        lastOperate = '/';
                    } else {
                        lastNum = Double.parseDouble(bar.getText().toString());
                        bar.setText("0");
                        lastOperate = '/';
                        Opere = true;
                        number1e = true;
                    }
                    flag = true;
                    break;
                case R.id.buttonEqu:
                    if(flag) {
                        double result = 0;
                        switch (lastOperate) {
                            case '+':
                                result = lastNum + Double.parseDouble(bar.getText().toString());
                                break;
                            case '-':
                                result = lastNum - Double.parseDouble(bar.getText().toString());
                                break;
                            case '*':
                                result = lastNum * Double.parseDouble(bar.getText().toString());
                                break;
                            case '/':
                                result = lastNum / Double.parseDouble(bar.getText().toString());
                                break;
                            default:
                                break;
                        }
                        bar.setText(String.valueOf(result));
                    }
                    Opere = false;
                    number1e = false;
                    contiOper = false;
                    flag = false;
                    break;
                case R.id.buttondot:
                    if(bar.getText().toString().indexOf('.')<0) {
                        bar.setText(bar.getText().toString() + ((Button) V).getText().toString());
                    }
                    break;
                default:
                    // if origin is not 0, add a number in the last.
                    if(!number1e||(!number1e&&!Opere)||bar.getText().toString().equals("0")) {
                        number1e = true;
                        bar.setText(((Button)V).getText().toString());
                    } else {
                        bar.setText(bar.getText().toString()+((Button)V).getText().toString());
                    }
            }
        }
    };

    private void findView() {
        bar = (TextView)findViewById(R.id.tv);
        if(Result!="null") {
            bar.setText(Result);
        }

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btn0 = (Button)findViewById(R.id.button0);
        btn10 = (Button)findViewById(R.id.button10);
        btnPlus = (Button)findViewById(R.id.buttonPlus);
        btnSub = (Button)findViewById(R.id.buttonSubtract);
        btnMul = (Button)findViewById(R.id.buttonMul);
        btnDiv = (Button)findViewById(R.id.buttonDiv);
        btnEqu = (Button)findViewById(R.id.buttonEqu);
        btnC = (Button)findViewById(R.id.buttonC);
        btndot = (Button)findViewById(R.id.buttondot);


        btn1.setOnClickListener(bltisener);
        btn2.setOnClickListener(bltisener);
        btn3.setOnClickListener(bltisener);
        btn4.setOnClickListener(bltisener);
        btn5.setOnClickListener(bltisener);
        btn6.setOnClickListener(bltisener);
        btn7.setOnClickListener(bltisener);
        btn8.setOnClickListener(bltisener);
        btn9.setOnClickListener(bltisener);
        btn0.setOnClickListener(bltisener);
        btn10.setOnClickListener(bltisener);
        btnPlus.setOnClickListener(bltisener);
        btnSub.setOnClickListener(bltisener);
        btnMul.setOnClickListener(bltisener);
        btnDiv.setOnClickListener(bltisener);
        btnEqu.setOnClickListener(bltisener);
        btndot.setOnClickListener(bltisener);

        btnC.setOnClickListener(bltisener);
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String x = bar.getText().toString();
        outState.putString("x",x);
        outState.putChar("lastOperate",lastOperate);
        outState.putBoolean("Opere",Opere);
        outState.putBoolean("number1e",number1e);
        outState.putDouble("lastNum",lastNum);
        outState.putBoolean("flag",flag);
        super.onSaveInstanceState(outState);
    }

}