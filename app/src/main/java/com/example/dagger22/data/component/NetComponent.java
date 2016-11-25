package com.example.dagger22.data.component;

import com.example.dagger22.data.module.AppModule;
import com.example.dagger22.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by liaodongming on 2016/11/24.
 */
@Singleton
@Component (modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
