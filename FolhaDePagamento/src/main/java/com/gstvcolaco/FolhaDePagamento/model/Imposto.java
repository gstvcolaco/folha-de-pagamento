package com.gstvcolaco.FolhaDePagamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity


public class Imposto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private double tinns1;
    private double alinss1;
    private double tinss2;
    private double alinss2;
    private double tinss3;
    private double alinss3;
    private double tinss4;
    private double alinss4;
    private double tsf;
    private double vsf;
    private double tirrf1;
    private double alirrf2;
    private double dirrf2;
    private double tirrf2;
    private double tirrf3;
    private double alirrf3;
    private double dirrf3;
    private double tirrf4;
    private double alirrf4;
    private double dirrf4;
    private double alirrf5;
    private double dirrf5;
    private double deppdep;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public double getTinns1() {
        return tinns1;
    }

    public void setTinns1(double tinns1) {
        this.tinns1 = tinns1;
    }

    public double getAlinss1() {
        return alinss1;
    }

    public void setAlinss1(double alinss1) {
        this.alinss1 = alinss1;
    }

    public double getTinss2() {
        return tinss2;
    }

    public void setTinss2(double tinss2) {
        this.tinss2 = tinss2;
    }

    public double getTinss3() {
        return tinss3;
    }

    public void setTinss3(double tinss3) {
        this.tinss3 = tinss3;
    }

    public double getAlinss2() {
        return alinss2;
    }

    public void setAlinss2(double alinss2) {
        this.alinss2 = alinss2;
    }

    public double getTirrf1() {
        return tirrf1;
    }

    public void setTirrf1(double tirrf1) {
        this.tirrf1 = tirrf1;
    }

    public double getVsf() {
        return vsf;
    }

    public void setVsf(double vsf) {
        this.vsf = vsf;
    }

    public double getTsf() {
        return tsf;
    }

    public void setTsf(double tsf) {
        this.tsf = tsf;
    }

    public double getAlinss4() {
        return alinss4;
    }

    public void setAlinss4(double alinss4) {
        this.alinss4 = alinss4;
    }

    public double getTinss4() {
        return tinss4;
    }

    public void setTinss4(double tinss4) {
        this.tinss4 = tinss4;
    }

    public double getAlinss3() {
        return alinss3;
    }

    public void setAlinss3(double alinss3) {
        this.alinss3 = alinss3;
    }

    public double getAlirrf2() {
        return alirrf2;
    }

    public void setAlirrf2(double alirrf2) {
        this.alirrf2 = alirrf2;
    }

    public double getDirrf2() {
        return dirrf2;
    }

    public void setDirrf2(double dirrf2) {
        this.dirrf2 = dirrf2;
    }

    public double getTirrf3() {
        return tirrf3;
    }

    public void setTirrf3(double tirrf3) {
        this.tirrf3 = tirrf3;
    }

    public double getTirrf2() {
        return tirrf2;
    }

    public void setTirrf2(double tirrf2) {
        this.tirrf2 = tirrf2;
    }

    public double getAlirrf3() {
        return alirrf3;
    }

    public void setAlirrf3(double alirrf3) {
        this.alirrf3 = alirrf3;
    }

    public double getDirrf3() {
        return dirrf3;
    }

    public void setDirrf3(double dirrf3) {
        this.dirrf3 = dirrf3;
    }

    public double getDeppdep() {
        return deppdep;
    }

    public void setDeppdep(double deppdep) {
        this.deppdep = deppdep;
    }

    public double getDirrf5() {
        return dirrf5;
    }

    public void setDirrf5(double dirrf5) {
        this.dirrf5 = dirrf5;
    }

    public double getAlirrf5() {
        return alirrf5;
    }

    public void setAlirrf5(double alirrf5) {
        this.alirrf5 = alirrf5;
    }

    public double getDirrf4() {
        return dirrf4;
    }

    public void setDirrf4(double dirrf4) {
        this.dirrf4 = dirrf4;
    }

    public double getAlirrf4() {
        return alirrf4;
    }

    public void setAlirrf4(double alirrf4) {
        this.alirrf4 = alirrf4;
    }

    public double getTirrf4() {
        return tirrf4;
    }

    public void setTirrf4(double tirrf4) {
        this.tirrf4 = tirrf4;
    }
}
