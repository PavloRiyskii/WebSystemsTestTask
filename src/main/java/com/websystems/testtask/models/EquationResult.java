package com.websystems.testtask.models;

import java.io.Serializable;

/**
 * Created by Павло on 03.08.2017.
 */
public class EquationResult implements Serializable{
    private Double x1;
    private Double x2;

    public EquationResult() {
    }

    public EquationResult(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }
}
