package com.paterns.generative.singleton;

public enum SingleEnum {
    INSTANCE(0);

    int param;

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    SingleEnum(int param) {
        this.param = param;
    }
}
