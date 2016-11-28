package com.example.dagger22.mainscreen;

import com.example.dagger22.mainscreen.MainScreenContract;
import com.example.dagger22.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liaodongming on 2016/11/24.
 * The purpose of creating MainScreenModule is to provide the View ( in our case Main4Activity) to
 * our Presenter when it is injected. The Presenter uses this view as a reference to our
 * MainAvtivity to call the methods in the View (showError(),showComplete()) whenever the network operation are performed
 It is a means through which the View and the Presenter Communicate with each other
 In Dagger, two dependent components cannot share the same scope i.e (Our NetComponent  and
 MainScreenComponent cannot share the scope of @Singlton). So we create a custom  scope
 called @CustomeScope to be used by our MainScreenComponent and MainScreenModule
 */
@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
