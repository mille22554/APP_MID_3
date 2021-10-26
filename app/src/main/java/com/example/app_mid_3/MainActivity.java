package com.example.app_mid_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x=0;
    public void but_click(View view){
        final EditText edn=(EditText)findViewById(R.id.editTextNumber);
        final TextView tv=(TextView) findViewById(R.id.textView2);
        float tem = Float.parseFloat(edn.getText().toString());
        if(x==0){
            edn.setText(""+(tem*9/5+32));
            tv.setText("°F");
            x=1;
        }
        else if(x==1){
            edn.setText(""+((tem-32)*5/9));
            tv.setText("°C");
            x=0;
        }
    }
}