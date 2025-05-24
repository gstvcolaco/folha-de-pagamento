package com.gstvcolaco.FolhaDePagamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Boolean vt;
    private Double salbruto;
    private  Integer dep14;
    private Integer depir;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVt() {
        return vt;
    }

    public void setVt(Boolean vt) {
        this.vt = vt;
    }

    public Double getSalbruto() {
        return salbruto;
    }

    public void setSalbruto(Double salbruto) {
        this.salbruto = salbruto;
    }

    public Integer getDep14() {
        return dep14;
    }

    public void setDep14(Integer dep14) {
        this.dep14 = dep14;
    }

    public Integer getDepir() {
        return depir;
    }

    public void setDepir(Integer depir) {
        this.depir = depir;
    }

}
