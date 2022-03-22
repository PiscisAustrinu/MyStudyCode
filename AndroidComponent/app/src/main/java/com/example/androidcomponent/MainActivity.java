package com.example.androidcomponent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static final String ReceiverAction = "com.test.broadcast";

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ReceiverAction);//识别广播消息的字符串标识
                intent.putExtra("message", "车间发出火警。。。");
                sendBroadcast(intent);//发送广播信息
            }
        });

        button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ReceiverAction);//识别广播消息的字符串标识
                intent.putExtra("message", "仓库发出火警。。。");
                sendBroadcast(intent);//发送广播信息
            }
        });

        button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ReceiverAction);//识别广播消息的字符串标识
                intent.putExtra("message", "楼道发出火警。。。");
                sendBroadcast(intent);//发送广播信息
            }
        });

        button4 = (Button)findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ReceiverAction);//识别广播消息的字符串标识
                intent.putExtra("message", "食堂发出火警。。。");
                sendBroadcast(intent);//发送广播信息
            }
        });

    }
}