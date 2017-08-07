package com.websystems.testtask.entities;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by Павло on 03.08.2017.
 */
@Entity
@Table(name = "equations_info")
public class EquationInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Long id;

    @Column(name = "a_param", nullable = false)
    private Double a;

    @Column(name = "b_param", nullable = false)
    private Double b;

    @Column(name = "c_param", nullable = false)
    private Double c;

    @Column(name = "x1")
    private Double x1;

    @Column(name = "x2")
    private Double x2;

    public EquationInfo() {
    }

    public EquationInfo(Double a, Double b, Double c, Double x1, Double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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