package com.realize.txxs.andriodlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by txxs on 2017/6/27.
 */

public class TwoActcomm extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoacticomm);
        textView = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        if(intent!=null){
            Person person = (Person) intent.getSerializableExtra("person");
            textView.setText(person.toString());
/*            String name  = intent.getStringExtra("name");
            int age = intent.getIntExtra("age",0);
            textView.setText("name:"+name+"age"+age);*/
        }
    }
}
