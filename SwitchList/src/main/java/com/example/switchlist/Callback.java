package com.example.switchlist;

/**
 * Created by liaodongming on 2016/9/8.
 */
public interface Callback {
    void onSuccess();

    void onError();

    public static class EmptyCallback implements Callback {

        @Override public void onSuccess() {
        }

        @Override public void onError() {
        }
    }
}
