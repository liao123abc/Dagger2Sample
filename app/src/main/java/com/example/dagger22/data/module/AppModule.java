package com.example.dagger22.data.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liaodongming on 2016/11/23.
 * https://adityaladwa.wordpress.com/2016/05/11/dagger-2-and-mvp-architecture/
 */
@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
