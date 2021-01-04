package edu.ib.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String Old = "";
    private String sign = "+";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ekran);

    }

    public void onClick(View view) {
        //if(editText.getText().toString().isEmpty()){ }


        String numery = editText.getText().toString();
        if (editText.getText().toString().isEmpty()) {
            editText.setText("0");
        } else{
            editText.setText(numery);
        }


        switch (view.getId()) {
            case R.id.number0:
                numery += "0";
                editText.setText(numery);
                break;
            case R.id.number1:
                numery += "1";
                editText.setText(numery);
                break;
            case R.id.number2:
                numery += "2";
                editText.setText(numery);
                break;
            case R.id.number3:
                numery += "3";
                editText.setText(numery);
                break;
            case R.id.number4:
                numery += "4";
                editText.setText(numery);
                break;
            case R.id.number5:
                numery += "5";
                editText.setText(numery);
                break;
            case R.id.number6:
                numery += "6";
                editText.setText(numery);
                break;
            case R.id.number7:
                numery += "7";
                editText.setText(numery);
                break;
            case R.id.number8:
                numery += "8";
                editText.setText(numery);
                break;
            case R.id.number9:
                numery += "9";
                editText.setText(numery);
                break;

            case R.id.coma:
                if (numery.contains(".")) {

                } else if (numery.equals("")) {

                } else {
                    numery += ".";

                }
                editText.setText(numery);
                break;

            case R.id.pulsorminus:
              if(editText.getText().toString().equals("")){

              }
              else if(editText.getText().toString().contains(".")){
                  double d = Double.parseDouble(editText.getText().toString());
                      double e = -1*d;
                      String f = String.valueOf(e);
                      editText.setText(f);
                  }

              else{
                  int a = Integer.parseInt(editText.getText().toString());
                  int b = -1*a;
                  String c = String.valueOf(b);
                  editText.setText(c);
              }
              break;
        }
    }

    public void onClickTrigger(View view) {
        Old = editText.getText().toString();

        switch(view.getId()){
            case R.id.plus:
                sign = "+";
                if(editText.getText().toString().contains("+")){
                    editText.setText("error");}
                else{
                editText.setText("");}
                break;
            case R.id.minus:
                sign = "-";
                editText.setText("");
                break;
            case R.id.times:
                sign = "*";
                editText.setText("");
                break;
            case R.id.devide:
                sign = "/";
                editText.setText("");
                break;

        }
    }

    public void onClickEquals(View view) {
        String New = editText.getText().toString();
        double equals = 0;
        switch(sign){
            case "+":
               equals = Double.parseDouble(New) + Double.parseDouble(Old);
               editText.setText(equals+"");
               break;
            case "-":
                equals = Double.parseDouble(Old) - Double.parseDouble(New);
                editText.setText(equals+"");
                break;
            case "*":
                equals = Double.parseDouble(Old) * Double.parseDouble(New);
                editText.setText(equals+"");
                break;
            case "/":
                equals = Double.parseDouble(Old) / Double.parseDouble(New);
                editText.setText(equals+"");
                break;
        }
                if(New.isEmpty()){
                    New = Old;
                    editText.setText(New+"");
                }
        }


    public void onClickClear(View view) {
        String toclear = editText.getText().toString();
        if(toclear.equals("")){

        }
        else{
            editText.setText("");
        }

    }

    public void onClickMakePercent(View view) {
        double makePercent = Double.parseDouble(editText.getText().toString())/100;
        editText.setText(makePercent+"%");
    }
}


