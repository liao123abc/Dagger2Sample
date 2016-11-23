package com.example.switchlist.data;

/**
 * Created by liaodongming on 2016/9/7.
 */

public class SpinnerCell extends Cell{

    private String bindOptions;

    private String value;

    public SpinnerCell(String bindOptions) {
        this.bindOptions = bindOptions;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
