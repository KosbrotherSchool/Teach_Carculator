package com.jasonko.newcarculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    private EditText editText1;
    private EditText editText2;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMutiple;
    private Button buttonDivide;
    private TextView textFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        buttonPlus = (Button) findViewById(R.id.button_plus);
        buttonMinus = (Button) findViewById(R.id.button_minus);
        buttonMutiple = (Button) findViewById(R.id.button_mutiple);
        buttonDivide = (Button) findViewById(R.id.button_divide);
        textFinal = (TextView) findViewById(R.id.text_final);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 取得數字1,並轉文字為數字
                String stringNum1 = editText1.getText().toString();
                int num1 = Integer.valueOf(stringNum1);

                // 取得數字2,並轉文字為數字
                String stringNum2 = editText2.getText().toString();
                int num2 = Integer.valueOf(stringNum2);

                // 數字相加, 再轉回文字
                int finalNum = num1 + num2;
                String stingFinal = Integer.toString(finalNum);

                // 顯示在 textFinal上
                textFinal.setText("計算結果是"+stingFinal);

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 取得數字1,並轉文字為數字
                String stringNum1 = editText1.getText().toString();
                int num1 = Integer.getInteger(stringNum1);

                // 取得數字2,並轉文字為數字
                String stringNum2 = editText2.getText().toString();
                int num2 = Integer.getInteger(stringNum2);

                // 數字相加, 再轉回文字
                int finalNum = num1 - num2;
                String stingFinal = Integer.toString(finalNum);

                // 顯示在 textFinal上
                textFinal.setText("計算結果是"+stingFinal);

            }
        });

        buttonMutiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 取得數字1,並轉文字為數字
                String stringNum1 = editText1.getText().toString();
                int num1 = Integer.getInteger(stringNum1);

                // 取得數字2,並轉文字為數字
                String stringNum2 = editText2.getText().toString();
                int num2 = Integer.getInteger(stringNum2);

                // 數字相加, 再轉回文字
                int finalNum = num1 * num2;
                String stingFinal = Integer.toString(finalNum);

                // 顯示在 textFinal上
                textFinal.setText("計算結果是"+stingFinal);

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 取得數字1,並轉文字為數字
                String stringNum1 = editText1.getText().toString();
                int num1 = Integer.getInteger(stringNum1);

                // 取得數字2,並轉文字為數字
                String stringNum2 = editText2.getText().toString();
                int num2 = Integer.getInteger(stringNum2);

                // 數字相除, 再轉回文字
                int finalNum = num1 / num2;
                String stingFinal = Integer.toString(finalNum);

                // 顯示在 textFinal上
                textFinal.setText("計算結果是"+stingFinal);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
