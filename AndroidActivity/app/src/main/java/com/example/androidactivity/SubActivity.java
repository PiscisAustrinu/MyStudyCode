package com.example.androidactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends Activity{
    private static final int SUBACTIVITY1 = 1;
    private static final int SUBACTIVITY2 = 2;
    TextView textView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.content_main);

        final EditText editText =(EditText)findViewById(R.id.edit);
        final Button btnOK=(Button)findViewById(R.id.ok);
        final Button btnCancel=(Button)findViewById(R.id.cancel);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uriString = editText.getText().toString();
                Uri data = Uri.parse(uriString);//设置返回值
                Intent result = new Intent(null,data);
                setResult(RESULT_OK, result);
                finish();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED, null);
                finish();
            }
        });

    }

}
