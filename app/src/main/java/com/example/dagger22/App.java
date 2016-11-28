package com.example.dagger22;

import android.app.Application;

import com.example.dagger22.data.component.DaggerNetComponent;
import com.example.dagger22.data.component.NetComponent;
import com.example.dagger22.data.module.AppModule;
import com.example.dagger22.data.module.NetModule;

/**
 * Created by liaodongming on 2016/11/24.
 * https://adityaladwa.wordpress.com/2016/05/11/dagger-2-and-mvp-architecture/
 */
public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * Create a private variable of type NetComponent and in onCreate build theNetComponent
         */
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

}
