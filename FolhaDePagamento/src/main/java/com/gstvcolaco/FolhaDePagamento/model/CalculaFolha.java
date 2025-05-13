package com.gstvcolaco.FolhaDePagamento.model;

public class CalculaFolha {

    private Funcionario funcionario;
    private Imposto imposto;
    private double inss;
    private double sf;
    private double vt;
    private double salliq;
    private double irrf;
    double p;

    public void calcula() {
        //Calculo do Vale Transporte
        if (funcionario.getVt().equals("S")) {
            vt = funcionario.getSalbruto() * 6 / 100;
        } else {
            vt = 0;
        }
        //Cálculo do Salário Família
        if (funcionario.getSalbruto() <= imposto.getTsf()) {
            sf = funcionario.getDep14() * imposto.getVsf();
        } else {
            sf = 0;
        }
        //Calculo do INSS
        if (funcionario.getSalbruto() <= imposto.getTinns1()) {
            inss = funcionario.getSalbruto() * imposto.getAlinss1()/ 100;
        }else{
            p= imposto.getTinns1()*imposto.getAlinss1()/100;
            if (funcionario.getSalbruto() <= imposto.getTinss2()) {
                inss = p+(funcionario.getSalbruto()-imposto.getTinns1()) *  imposto.getAlinss2()/100;
            }else{
                p=p+(imposto.getTinss2()-imposto.getTinns1())*imposto.getAlinss2()/100;
                if(funcionario.getSalbruto() <= imposto.getTinss3()) {
                    inss = p+(funcionario.getSalbruto()-imposto.getTinss2())*imposto.getAlinss3()/100;
                }else{
                    p=p+(imposto.getTinss3()-imposto.getTinss2())*imposto.getAlinss3()/100;
                    if (funcionario.getSalbruto() <= imposto.getTinss4()){
                        inss = p+(funcionario.getSalbruto()-imposto.getTinss3())*imposto.getAlinss4()/100;
                    }else{
                        inss = p+(imposto.getTinss4()-imposto.getTinss3())* imposto.getAlinss4() /100;
                    }
                }
            }
        }
        
        //Calculo do IRRF
        double bc = funcionario.getSalbruto() - inss - (funcionario.getDepir() * imposto.getDeppdep());
        if(bc<= imposto.getTirrf1()){
            irrf = 0;
        } else {
            if (bc <= imposto.getTirrf2()) {
                irrf = bc * (imposto.getAlirrf2() / 100) - imposto.getDirrf2();
            } else {
                if (bc <= imposto.getTirrf3()){
                    irrf = bc * (imposto.getAlirrf3() / 100) - imposto.getDirrf3();
                } else {
                    if (bc <= imposto.getTirrf4()){
                        irrf = bc * (imposto.getAlirrf4() / 100) - imposto.getDirrf4();
                    } else{
                        irrf = bc * (imposto.getAlirrf5() / 100) - imposto.getDirrf5();
                    }
                }
            }
        }
        
        //Calculo do Salario Liquido
        salliq = funcionario.getSalbruto() - inss + sf - vt - irrf;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the tabela
     */
    public Imposto getImposto() {
        return imposto;
    }

    /**
     * @param tabela the tabela to set
     */
    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    /**
     * @return the inss
     */
    public double getInss() {
        return inss;
    }

    /**
     * @param inss the inss to set
     */
    public void setInss(double inss) {
        this.inss = inss;
    }

    /**
     * @return the sf
     */
    public double getSf() {
        return sf;
    }

    /**
     * @param sf the sf to set
     */
    public void setSf(double sf) {
        this.sf = sf;
    }

    /**
     * @return the vt
     */
    public double getVt() {
        return vt;
    }

    /**
     * @param vt the vt to set
     */
    public void setVt(double vt) {
        this.vt = vt;
    }

    /**
     * @return the salliq
     */
    public double getSalliq() {
        return salliq;
    }

    /**
     * @param salliq the salliq to set
     */
    public void setSalliq(double salliq) {
        this.salliq = salliq;
    }

    /**
     * @return the irrf
     */
    public double getIrrf() {
        return irrf;
    }

    /**
     * @param irrf the irrf to set
     */
    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }
}
