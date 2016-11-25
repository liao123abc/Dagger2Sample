package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import picaso.SampleGridViewActivity;

public class Main4Activity extends AppCompatActivity {
    private Handler myHandler;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> data;
    private List<String> newData;

    /**
     * 该函数在适当的时候会被UIThread调用,譬如后台数据变化了，要刷新界面
     */
    public void setAdapterNewData() {
        // do something long
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                changeData();
            }
        };
        new Thread(runnable).start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        //init handler
//        myHandler = new Handler(Looper.getMainLooper());
//        //初始化listView
//        listView = new ListView(this);
//        data = new ArrayList<>();
//        data.add("测试数据1");
//        data.add("测试数据2");
//        data.add("测试数据3");
//        data.add("测试数据4");
//        adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_expandable_list_item_1,data);
//        listView.setAdapter(adapter);
//        //setContentView(listView);
//        RelativeLayout view = (RelativeLayout)findViewById(R.id.hello);
//        view.addView(listView);
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
            Intent myIntent = new Intent(Main4Activity.this, SampleGridViewActivity.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * 生成数据
     */
    private void generateDate() {
        //newData = new ArrayList<String>();
        for(int i = 0; i < 20000; i++) {
            String string = new String("hello world");
            data.add(string);
        }
    }

    private void setDataList(List<String> newData) {
        data = newData;
    }

    public void changeData() {
        generateDate();
        //setDataList(newData); //改变数据
        myHandler.post(new Runnable() {
            @Override
            public void run() {

                adapter.notifyDataSetChanged();//通知数据已经改变了
            }
        });
    }

}
