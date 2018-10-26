package com.andreperegrina.openhours;

public enum BusinessState {
    NOT_OPEN_YET(1), OPEN(2), CLOSED(3);

    private final int state;

    BusinessState(int state) {
        this.state = state;
    }


}
