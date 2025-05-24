package com.gstvcolaco.FolhaDePagamento.model;

import org.springframework.stereotype.Service;

@Service
public class CalculaFolha {
    private Funcionario funcionario;
    private Imposto imposto = new Imposto();;
    private double inss;
    private double sf;
    private double vt;
    private double salliq;
    private double irrf;
    private double descontos;
    double p;


    public void calcula(){
//calculo do vale transporte
        if (Boolean.TRUE.equals(funcionario.getVt())) {
            vt = funcionario.getSalbruto() * 6 / 100;
        } else {
            vt = 0;
        }

//calculo do salario familia
        if (funcionario.getSalbruto() <= imposto.getTsf()){
            sf = funcionario.getDep14() * imposto.getVsf();
        }else {
            sf=0;
        }
//calculo do inss
        if (funcionario.getSalbruto() <= imposto.getTinns1()) {
            inss = funcionario.getSalbruto() * imposto.getAlinss1() / 100;
        } else {
            p=imposto.getTinns1()*imposto.getAlinss1()/100;
            if (funcionario.getSalbruto() <= imposto.getTinss2()) {
                inss = p+(funcionario.getSalbruto()-imposto.getTinns1()) * imposto.getAlinss2() / 100;
            } else {
                p=p+(imposto.getTinss2()-imposto.getTinns1())*imposto.getAlinss2()/100;
                if (funcionario.getSalbruto() <= imposto.getTinss3()) {
                    inss = p+(funcionario.getSalbruto()-imposto.getTinss2()) * imposto.getAlinss3() / 100;
                } else {
                    p=p+(imposto.getTinss3()-imposto.getTinss2())*imposto.getAlinss3()/100;
                    if (funcionario.getSalbruto() <= imposto.getTinss4()) {
                        inss = p+ (funcionario.getSalbruto()-imposto.getTinss3())* imposto.getAlinss4() / 100;
                    } else {
                        inss = p+ (imposto.getTinss4()-imposto.getTinss3()) * imposto.getAlinss4() / 100;
                    }
                }
            }
        }
//Cálculo do IRRF
        double bc = funcionario.getSalbruto() - inss - (funcionario.getDepir() * imposto.getDeppdep());
        if (bc <= imposto.getTirrf1()) {
            irrf = 0;
        } else {
            if (bc <= imposto.getTirrf2()) {
                irrf = bc * (imposto.getAlirrf2() / 100) - imposto.getDirrf2();
            } else {
                if (bc <= imposto.getTirrf3()) {
                    irrf = bc * (imposto.getAlirrf3() / 100) - imposto.getDirrf3();
                } else {
                    if (bc <= imposto.getTirrf4()) {
                        irrf = bc * (imposto.getAlirrf4() / 100) - imposto.getDirrf4();
                    } else {
                        irrf = bc * (imposto.getAlirrf5() / 100) - imposto.getDirrf5();
                    }
                }
            }
        }
//Cálculo do Salário Líquido
        salliq=funcionario.getSalbruto()-inss+sf-vt-irrf;
        descontos=inss+vt+irrf;
    }
    public HoleriteDTO calculos(Funcionario funcionario) {
        this.funcionario = funcionario;
        calcula(); // executa os cálculos

        return new HoleriteDTO(
                funcionario,
                inss,
                sf,
                vt,
                salliq,
                irrf,
                descontos
        );
    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getSf() {
        return sf;
    }

    public void setSf(double sf) {
        this.sf = sf;
    }

    public double getVt() {
        return vt;
    }

    public void setVt(double vt) {
        this.vt = vt;
    }

    public double getSalliq() {
        return salliq;
    }

    public void setSalliq(double salliq) {
        this.salliq = salliq;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }
}
