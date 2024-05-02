package com.atividadefinal.spring.api.models;

import jakarta.persistence.*;



@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPizza;

    @Column
    private String nome;
    @Column
    private Float precoBase;
    @Column
    private Boolean personalizada;

    public Pizza() {

    }

    public Long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Long idPizza) {
        this.idPizza = idPizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Float precoBase) {
        this.precoBase = precoBase;
    }

    public Boolean getPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(Boolean personalizada) {
        this.personalizada = personalizada;
    }
}
