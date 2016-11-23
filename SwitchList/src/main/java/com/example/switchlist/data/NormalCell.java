package com.example.switchlist.data;

/**
 * Created by liaodongming on 2016/9/7.
 */
public class NormalCell extends Cell{

    private boolean readOnly;
    private String unit;
    private int max;

    private int value;

    public NormalCell(boolean readOnly, String unit, int max) {
        this.readOnly = readOnly;
        this.unit = unit;
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
