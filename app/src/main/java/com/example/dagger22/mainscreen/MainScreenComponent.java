package com.example.dagger22.mainscreen;

import com.example.dagger22.data.component.NetComponent;
import com.example.dagger22.util.CustomScope;

import dagger.Component;

/**
 * Created by liaodongming on 2016/11/24.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
