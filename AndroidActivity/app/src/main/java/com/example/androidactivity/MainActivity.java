package com.example.androidactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private static final int SUBACTIVITY1 = 1;
    private static final int SUBACTIVITY2 = 2;//定义请求码
    EditText textView1;
    EditText textView2;
    EditText textView3;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        textView1 =(EditText)findViewById(R.id.editText1);
        textView2 =(EditText)findViewById(R.id.editText2);
        textView3 =(EditText)findViewById(R.id.editText3);
        final Button btn1=(Button)findViewById(R.id.btn_start);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivityForResult(intent, SUBACTIVITY1);//以sub-activity启动子activity
            }
        });


    }
    @Override//处理返回值
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case SUBACTIVITY1:
                if(resultCode == RESULT_OK){
                    Uri uriData = data.getData();
                    textView1.setText(uriData.toString());
                    textView2.setText(uriData.toString());
                    textView3.setText(uriData.toString());
                }
                break;
            case SUBACTIVITY2:
                break;
            default:
                break;
        }
    }
}
