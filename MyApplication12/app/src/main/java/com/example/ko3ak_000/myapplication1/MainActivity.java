package com.example.ko3ak_000.myapplication1;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    TextView tvOut;
    Button btnOK;
    Button btnCancel;

    @Override
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut =(TextView) findViewById(R.id.tvOut);
        btnOK = (Button) findViewById(R.id.button);
        btnCancel= (Button) findViewById(R.id.button2);

        // обработчик нажатия

        OnClickListener oclBtnOK = new OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText("Presed OK button");

            }
        };

        btnOK.setOnClickListener(oclBtnOK);

        OnClickListener oclBtnCancel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Presed Cancel button");
            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);




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
