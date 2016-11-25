package com.example.dagger22.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dagger22.data.Post;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by liaodongming on 2016/11/24.
 */

public class MainActivity extends AppCompatActivity implements MainScreenContract.View{

    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_main);
        listView = (ListView)findViewById(R.id.my_list);
        list = new ArrayList<>();
    }

    @Override
    public void showPost(List<Post> posts) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showComplete() {

    }
}
