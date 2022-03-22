package com.example.androidevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imageView1);
        Switch switch1 = findViewById(R.id.switcher1);
        SeekBar seekBar1 = findViewById(R.id.seekBar1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        Switch switch2 = findViewById(R.id.switcher2);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);

        ImageView imageView3 = findViewById(R.id.imageView3);
        Switch switch3 = findViewById(R.id.switcher3);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);

        init(imageView1, switch1, seekBar1);
        init(imageView2, switch2, seekBar2);
        init(imageView3, switch3, seekBar3);

    }

    private void init(final ImageView imageView, Switch switcher, SeekBar seekBar) {
        imageView.setAlpha(1.0f);
        switcher.setChecked(true);
        seekBar.setProgress(50);

        switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(MainActivity.this, "打开街区灯光。", Toast.LENGTH_SHORT).show();
                    imageView.setAlpha(1.0f);
                } else {
                    Toast.makeText(MainActivity.this, "关闭街区灯光。", Toast.LENGTH_SHORT).show();
                    imageView.setAlpha(0.3f);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}