package com.ey.fileio;

import java.io.Serializable;

class CallDetailRecord implements Serializable {
    private int fromNumber;
    private int toNumber;
    private float duration;
    private float charge;

    public CallDetailRecord(int fromNumber, int toNumber, float duration) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.duration = duration;
        this.charge = calculateCharge(duration);
    }

    private float calculateCharge(float duration) {
        return duration * 1; // 1 Rupee per minute rate
    }

    @Override
    public String toString() {
        return fromNumber + "\t\t " + toNumber + "\t\t " + charge;
    }
}