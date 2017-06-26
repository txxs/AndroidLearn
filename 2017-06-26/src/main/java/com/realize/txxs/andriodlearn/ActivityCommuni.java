package com.realize.txxs.andriodlearn;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by txxs on 2017/6/26.
 */

public class ActivityCommuni extends Activity implements FragmentCommm.Mylistener {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitycommuni);
        editText = (EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name",text);
                FragmentCommm fragmentCommm = new FragmentCommm();
                fragmentCommm.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.layout,fragmentCommm,"fragment");
                fragmentTransaction.commit();
                Toast.makeText(ActivityCommuni.this,"发送数据",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void thank(String args) {
        Toast.makeText(ActivityCommuni.this,args,Toast.LENGTH_LONG).show();
    }
}
