package com.gstvcolaco.FolhaDePagamento.model;

public class HoleriteDTO {
    private Funcionario funcionario;
    private double inss;
    private double sf;
    private double vt;
    private double salliq;
    private double irrf;
    private double descontos;

    public HoleriteDTO(Funcionario funcionario, Double inss, Double sf, Double vt, Double salliq, Double irrf, Double descontos){
        this.funcionario = funcionario;
        this.inss = inss;
        this.sf = sf;
        this.vt = vt;
        this.salliq = salliq;
        this.irrf = irrf;
        this.descontos =descontos;
    }
    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getSalliq() {
        return salliq;
    }

    public void setSalliq(double salliq) {
        this.salliq = salliq;
    }

    public double getVt() {
        return vt;
    }

    public void setVt(double vt) {
        this.vt = vt;
    }

    public double getSf() {
        return sf;
    }

    public void setSf(double sf) {
        this.sf = sf;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
