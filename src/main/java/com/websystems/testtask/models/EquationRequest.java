package com.websystems.testtask.models;

import java.io.Serializable;

/**
 * Created by Павло on 03.08.2017.
 */
public class EquationRequest implements Serializable{
    private Double a;
    private Double b;
    private Double c;

    public EquationRequest() {
    }

    public EquationRequest(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
