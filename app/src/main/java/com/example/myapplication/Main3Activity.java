package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.dagger.CoffeeApp;
import com.example.switchlist.SwitchList;

public class Main3Activity extends AppCompatActivity {

    private RelativeLayout container;

    private SwitchList switchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        container = (RelativeLayout)findViewById(R.id.activity_main3);

        Button button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toWeChatScan();
//            }
//        });

        SwitchList.with(this)
                .load(null)
                .into(container);
    }

    private void toWeChatScan() {
//        try {
//            //利用Intent打开微信
//            //Uri uri = Uri.parse("weixin://dl/scan");  已经无法调用
//            Uri uri = Uri.parse("weixin://");
//            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(intent);
//        } catch (Exception e) {
//            //若无法正常跳转，在此进行错误处理
//            Toast.makeText(Main3Activity.this, "无法跳转到微信，请检查您是否安装了微信！", Toast.LENGTH_SHORT).show();
//        }

        CoffeeApp.test();

    }
}
